package Services;

import DTO.PersonInfo;
import Reader.JsonReaderFile;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class PersonInfoServices {
    JsonReaderFile jsonReaderFile = new JsonReaderFile();
    List<PersonInfo> personInfoList = new LinkedList<>();
    List<String> medicationhistorylist = new LinkedList<>();

    public List<PersonInfo> personInfo(String firstName, String lastName) throws IOException {
        for (int i = 0; i < jsonReaderFile.JsonReaderFilePerson().size(); i++) {
            if (jsonReaderFile.JsonReaderFilePerson().path(i).path("firstName").asText().equalsIgnoreCase(firstName)
                    && jsonReaderFile.JsonReaderFilePerson().path(i).path("lastName").asText().equalsIgnoreCase(lastName)) {
                //                System.out.println(jsonReaderFile.JsonReaderFilePerson().path(i).path("email"));
                for (int j = 0; j < jsonReaderFile.JsonReaderFileMedicalRecords().size(); j++) {
                    PersonInfo personInfo = new PersonInfo();
                    if (jsonReaderFile.JsonReaderFileMedicalRecords().path(j).path("firstName").equals(jsonReaderFile.JsonReaderFilePerson().path(i).path("firstName"))
                            && jsonReaderFile.JsonReaderFileMedicalRecords().path(j).path("lastName").equals(jsonReaderFile.JsonReaderFileMedicalRecords().path(i).path("lastName"))) {
                        //                        System.out.println(jsonReaderFile.JsonReaderFileMedicalRecords().path(j).path("birthdate"));
                        personInfo.setFirstName(jsonReaderFile.JsonReaderFilePerson().path(i).path("firstName").toString());
                        personInfo.setAddress(jsonReaderFile.JsonReaderFilePerson().path(i).path("address").toString());
                        personInfo.setEmail(jsonReaderFile.JsonReaderFilePerson().path(i).path("email").toString());
                        medicationhistorylist.add(jsonReaderFile.JsonReaderFileMedicalRecords().path(j).path("medications").toString());
                        medicationhistorylist.add(jsonReaderFile.JsonReaderFileMedicalRecords().path(j).path("allergies").toString());
                        personInfo.setMedicationhistory(medicationhistorylist);
                        personInfo.setAge(age(jsonReaderFile.JsonReaderFileMedicalRecords().path(j)));
                        personInfoList.add(personInfo);

                    }
                }
            }
        }
        return personInfoList;
    }


    private int age(JsonNode jsonNode) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("\"MM/dd/yyyy\"", Locale.ENGLISH);
        LocalDate currentDate = LocalDate.now();
        LocalDate personBirthdate = LocalDate.parse(jsonNode.path("birthdate").toString(), formatter);
        int age = Period.between(personBirthdate, currentDate).getYears();
        return age;

    }
}
