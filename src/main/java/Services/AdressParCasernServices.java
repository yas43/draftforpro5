package Services;

import DTO.AdresseParCaserne;
import Reader.JsonReaderFile;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class AdressParCasernServices {
    JsonReaderFile jsonReaderFile = new JsonReaderFile();
    public Map<String, List<AdresseParCaserne>> addresseesForFireStation(int firestationnumber) throws IOException {
        String firestationnumberstring = String.valueOf(firestationnumber);
        List<AdresseParCaserne> adresseParCaserneList = new LinkedList<>();
        Map<String,List<AdresseParCaserne>> map = new HashMap<>();
        for (int i=0;i<jsonReaderFile.JsonReaderFileFireStation().size();i++){
            if(jsonReaderFile.JsonReaderFileFireStation().path(i).path("station").asText().equals(firestationnumberstring)){
//                System.out.println(jsonReaderFile.JsonReaderFileFireStation().path(i).path("address"));
                for (int j=0;j<jsonReaderFile.JsonReaderFilePerson().size();j++){
                    if(jsonReaderFile.JsonReaderFilePerson().path(j).path("address").equals(jsonReaderFile.JsonReaderFileFireStation().path(i).path("address"))){
//                        System.out.println(jsonReaderFile.JsonReaderFilePerson().path(j).path("firstName"));
                        for (int k=0;k<jsonReaderFile.JsonReaderFileMedicalRecords().size();k++){
                            AdresseParCaserne adresseParCaserne = new AdresseParCaserne();
                            List<String> medicalbackgroundlist = new LinkedList<>();
                            if (jsonReaderFile.JsonReaderFilePerson().path(j).path("firstName").equals(jsonReaderFile.JsonReaderFileMedicalRecords().path(k).path("firstName"))){
//                                System.out.println(jsonReaderFile.JsonReaderFileMedicalRecords().path(k).path("birthdate"));
                                adresseParCaserne.setFirstName(jsonReaderFile.JsonReaderFilePerson().path(j).path("firstName").toString());
                                adresseParCaserne.setPhone(jsonReaderFile.JsonReaderFilePerson().path(j).path("phone").toString());
                                medicalbackgroundlist.add(jsonReaderFile.JsonReaderFileMedicalRecords().path(k).path("allergies").toString());
                                medicalbackgroundlist.add(jsonReaderFile.JsonReaderFileMedicalRecords().path(k).path("medications").toString());
                                adresseParCaserne.setMedicalbackgroundlist(medicalbackgroundlist);
                                adresseParCaserne.setAge( age( jsonReaderFile.JsonReaderFileMedicalRecords().path(k)));
//                                System.out.println(adresseParCaserne);
                                adresseParCaserneList.add(adresseParCaserne);
                                map.put(jsonReaderFile.JsonReaderFileFireStation().path(i).path("station").toString(),adresseParCaserneList);



                            }

                        }
                    }

                }
            }
        }

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
