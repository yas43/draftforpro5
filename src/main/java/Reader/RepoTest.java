package Reader;

import Models.Firestations;
import Models.Medicalrecords;
import Models.Person;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class RepoTest {
    JsonReaderFile jsonReaderFile = new JsonReaderFile();

    public List<Person> pesonRepo() throws IOException {

        List<Person> personlist = new LinkedList<>();
        JsonNode persons = jsonReaderFile.JsonReaderFilePerson();

        for (int i = 0; i < persons.size(); i++) {

            Person person = new Person();

            person.setFirstName(persons.path(i).path("firstName").toString());
            person.setLastName(persons.path(i).path("lastName").toString());
            person.setAddress(persons.path(i).path("address").toString());
            person.setCity(persons.path(i).path("city").toString());
            person.setZip(persons.path(i).path("zip").toString());
            person.setPhone(persons.path(i).path("phone").toString());
            person.setEmail(persons.path(i).path("email").toString());

            personlist.add(person);

        }
        return personlist;
    }


    public List<Firestations> firestationRepo() throws IOException {

        List<Firestations> firestationsList = new LinkedList<>();
        JsonNode firestations = jsonReaderFile.JsonReaderFileFireStation();

        for (int i = 0; i < firestations.size(); i++) {

            Firestations firestation = new Firestations();

            firestation.setAddress(firestations.path(i).path("address").toString());
            firestation.setStation(firestations.path(i).path("station").toString());


            firestationsList.add(firestation);

        }
        return firestationsList;
    }


    public List<Medicalrecords> medicalrecordsRepo() throws IOException {

        List<Medicalrecords> medicalrecordsList = new LinkedList<>();
        JsonNode medicalrecords = jsonReaderFile.JsonReaderFileMedicalRecords();

        for (int i = 0; i < medicalrecords.size(); i++) {

            Medicalrecords medicalrecord = new Medicalrecords();

//            System.out.println( medicalrecords.path(1).path("medications").path(0));
//        System.out.println( medicalrecords.path(1).path("medications").path(1));
//        System.out.println( medicalrecords.path(1).path("medications").path(2));


        medicalrecord.setFirstName(medicalrecords.path(i).path("firstName").toString());
        medicalrecord.setLastName(medicalrecords.path(i).path("lastName").toString());
        medicalrecord.setBirthdate(medicalrecords.path(i).path("birthdate").toString());
        medicalrecord.setMedications(medicalrecords.path(i).path("medications").toString());
        medicalrecord.setAllergies(medicalrecords.path(i).path("allergies").toString());

        medicalrecordsList.add(medicalrecord);
        }
        return medicalrecordsList;

    }
}
