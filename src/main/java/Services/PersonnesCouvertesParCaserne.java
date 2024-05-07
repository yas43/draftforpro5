package Services;

import Models.Person;
import Reader.JsonReaderFile;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class PersonnesCouvertesParCaserne {
    JsonReaderFile jsonReaderFile = new JsonReaderFile();

    public List<DTO.PersonnesCouvertesParCaserne> coveredpersonsRepo(int stationnumber) throws IOException {

        List<DTO.PersonnesCouvertesParCaserne> couvertesParCasernes = new LinkedList<>();
        JsonNode fireStations = jsonReaderFile.JsonReaderFileFireStation();
        //        JsonNode medicalrecords = jsonReaderFile.JsonReaderFileMedicalRecords();
        JsonNode persons = jsonReaderFile.JsonReaderFilePerson();


        Person person1 = new Person();
        String firestationnumberstring = String.valueOf(stationnumber);
        for (int i = 0; i < fireStations.size(); i++) {
            if (fireStations.path(i).path("station").asText().equals(firestationnumberstring)) {
                for (int j = 0; j < persons.size(); j++) {
                    DTO.PersonnesCouvertesParCaserne personnesCouvertesParCaserne = new DTO.PersonnesCouvertesParCaserne();
                    if (persons.path(j).path("address").equals(fireStations.path(i).path("address"))) {

                        personnesCouvertesParCaserne.setFirstName(persons.path(j).path("firstName").toString());
                        personnesCouvertesParCaserne.setLastName(persons.path(j).path("lastName").toString());
                        personnesCouvertesParCaserne.setAdresse(persons.path(j).path("address").toString());
                        personnesCouvertesParCaserne.setPhone(persons.path(j).path("phone").toString());

                        couvertesParCasernes.add(personnesCouvertesParCaserne);
                    }
                    //                                        System.out.println(persons.path(j).path("firstName"));

                }
            }
        }
        return couvertesParCasernes;
    }
}
