//import Services.PersonsServices;

import Reader.JsonReaderFile;
import Repository.Repository;
import Services.PersonsServices;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.json.JSONObject;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

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

        JsonReaderFile jsonReaderFile =new JsonReaderFile();
//        List<JsonNode> list = Stream.concat(jsonReaderFile.JsonReaderFilePerson(),jsonReaderFile.JsonReaderFileMedicalRecords()).toList();
//        for(int i=0;i<jsonReaderFile.JsonReaderFilePerson().size();i++) {
//            System.out.println(jsonReaderFile.JsonReaderFilePerson().get(i).fieldNames());
//        }
//      merge( jsonReaderFile.JsonReaderFilePerson().ge,jsonReaderFile.JsonReaderFileMedicalRecords().fieldNames());





//        System.out.println( jsonReaderFile.JsonReaderFilePerson());
//        System.out.println(jsonReaderFile.JsonReaderFileFireStation());
//        System.out.println(jsonReaderFile.JsonReaderFileMedicalRecords());
//        for(int i=0;i<jsonReaderFile.JsonReaderFileAll().size();i++) {
//            System.out.println(jsonReaderFile.JsonReaderFileAll().path("persons").path(i));
////            System.out.println("----------------------------------------------------------------------------");
//        }

//        RepoTest repoTest = new RepoTest();
//        System.out.println( repoTest.pesonRepo());
//        System.out.println(repoTest.firestationRepo());
//        System.out.println( repoTest.medicalrecordsRepo());

//        FireStationRepository fireStationRepository = new FireStationRepository();
//        System.out.println( fireStationRepository.firestationRepo());


//        Repository repository = new Repository();
//        System.out.println(repository.pesonRepo());

//        PersonsServices personsServices = new PersonsServices();
//        System.out.println( personsServices.numberOfKids());

//        List<String> list1 = new LinkedList<>();
//        List<String> list2 = new LinkedList<>();
//        list1.add("yaser");
//        list1.add("gigi");
//        list1.add("matin");
//        list2.add("yash");
//        list2.add("zahra");
//        list2.add("clair marie");

//        List<String> newList = Stream.concat(list1.stream(), list2.stream()).toList();
//        System.out.println(newList);



    }
}
