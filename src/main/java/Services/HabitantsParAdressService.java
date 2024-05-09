package Services;

import Reader.JsonReaderFile;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class HabitantsParAdressService {
    JsonReaderFile jsonReaderFile = new JsonReaderFile();

    public Map<String, List<String>> personaddress(String address) throws IOException {
        Map<String, List<String>> map = new HashMap<>();
        List<String> coveredpersonslist = new LinkedList<>();
        for (int i = 0; i < jsonReaderFile.JsonReaderFileFireStation().size(); i++) {
            if (jsonReaderFile.JsonReaderFileFireStation().path(i).path("address").asText().equals(address)) {
                for (int j = 0; j < jsonReaderFile.JsonReaderFilePerson().size(); j++) {
                    if (jsonReaderFile.JsonReaderFileFireStation().path(i).path("address").equals(jsonReaderFile.JsonReaderFilePerson().path(j).path("address"))) {
                        for (int k = 0; k < jsonReaderFile.JsonReaderFileMedicalRecords().size(); k++) {
                            if (jsonReaderFile.JsonReaderFileMedicalRecords().path(k).path("firstName").equals(jsonReaderFile.JsonReaderFilePerson().path(j).path("firstName"))) {
//                                System.out.println(jsonReaderFile.JsonReaderFileMedicalRecords().path(k).path("birthdate"));
//                                System.out.println(age(jsonReaderFile.JsonReaderFileMedicalRecords().path(k)));
//                                System.out.println(jsonReaderFile.JsonReaderFileMedicalRecords().path(k).path("medications"));
//                                System.out.println(jsonReaderFile.JsonReaderFilePerson().path(j).path("firstName"));
//                                System.out.println(jsonReaderFile.JsonReaderFilePerson().path(j).path("phone"));
//                                System.out.println(jsonReaderFile.JsonReaderFileMedicalRecords().path(k).path("birthdate"));
                                coveredpersonslist.add(jsonReaderFile.JsonReaderFilePerson().path(j).path("firstName").toString());
                                coveredpersonslist.add(jsonReaderFile.JsonReaderFilePerson().path(j).path("phone").toString());
//                                coveredpersonslist.add(jsonReaderFile.JsonReaderFileMedicalRecords().path(k).path("birthdate").toString());
                                coveredpersonslist.add(String.valueOf(age(jsonReaderFile.JsonReaderFileMedicalRecords().path(k))));
                                map.put(jsonReaderFile.JsonReaderFileFireStation().path(i).path("station").toString(),coveredpersonslist);


                            }
                        }
                    }
                }
            }

        }
//        System.out.println(coveredpersonslist);

        return map;
    }


    private int age(JsonNode jsonNode){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("\"MM/dd/yyyy\"", Locale.ENGLISH);
        LocalDate currentDate = LocalDate.now();
        LocalDate personBirthdate = LocalDate.parse(jsonNode.path("birthdate").toString(), formatter);
        int age = Period.between(personBirthdate, currentDate).getYears();
        return age;

    }

}
