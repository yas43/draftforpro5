package Services;

import DTO.NumérosTéléphoneParCaserne;
import Reader.JsonReaderFile;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class NumérosTelephoneParCaserneService {
    JsonReaderFile jsonReaderFile = new JsonReaderFile();
    Set<NumérosTéléphoneParCaserne> numérosTéléphoneParCaserneList = new HashSet<>();

    public Set<NumérosTéléphoneParCaserne> phoneNumbers(int firesationnumber) throws IOException {
        String firestationstring = String.valueOf(firesationnumber);
        for (int i = 0; i < jsonReaderFile.JsonReaderFileFireStation().size(); i++) {
            if (jsonReaderFile.JsonReaderFileFireStation().path(i).path("station").asText().equals(firestationstring)) {
                for (int j = 0; j < jsonReaderFile.JsonReaderFilePerson().size(); j++) {
                    NumérosTéléphoneParCaserne numérosTéléphoneParCaserne = new NumérosTéléphoneParCaserne();
                    if (jsonReaderFile.JsonReaderFilePerson().path(j).path("address").equals(jsonReaderFile.JsonReaderFileFireStation().path(i).path("address"))) {
                        numérosTéléphoneParCaserne.setPhoneNumber(jsonReaderFile.JsonReaderFilePerson().path(j).path("phone").asText());
                        numérosTéléphoneParCaserneList.add(numérosTéléphoneParCaserne);
                    }
                }
            }
        }
        return numérosTéléphoneParCaserneList;
    }
}
