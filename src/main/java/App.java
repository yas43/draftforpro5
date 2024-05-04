//import Services.PersonsServices;

import Repository.Repository;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {



//PersonRepository personRepository = new PersonRepository();
//personRepository.persons();
// FireStationRepository fireStationRepository = new FireStationRepository();
// fireStationRepository.firestations();
// MedicalRecordsRepository medicalRecordsRepository = new MedicalRecordsRepository();
// medicalRecordsRepository.medicalrecords();



//        PersonsServices personsServices = new PersonsServices();
//        System.out.println(personsServices.test());


//        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
//        String json = ow.writeValueAsString(personsServices.test());

//        System.out.println(json);

//        JsonReaderFile jsonReaderFile =new JsonReaderFile();
//        System.out.println( jsonReaderFile.JsonReaderFilePerson());
//        System.out.println(jsonReaderFile.JsonReaderFileFireStation());
//        System.out.println(jsonReaderFile.JsonReaderFileMedicalRecords());


//        RepoTest repoTest = new RepoTest();
//        System.out.println( repoTest.pesonRepo());
//        System.out.println(repoTest.firestationRepo());
//        System.out.println( repoTest.medicalrecordsRepo());

//        FireStationRepository fireStationRepository = new FireStationRepository();
//        System.out.println( fireStationRepository.firestationRepo());


        Repository repository = new Repository();
        System.out.println(repository.pesonRepo());
    }
}
