import Repository.FireStationRepository;
import Repository.MedicalRecordsRepository;
import Repository.PersonRepository;
import Services.PersonsServices;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {



//PersonRepository personRepository = new PersonRepository();
//personRepository.persons();
// FireStationRepository fireStationRepository = new FireStationRepository();
// fireStationRepository.firestations();
// MedicalRecordsRepository medicalRecordsRepository = new MedicalRecordsRepository();
// medicalRecordsRepository.medicalrecords();



        PersonsServices personsServices = new PersonsServices();
//        System.out.println(personsServices.test());


        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json = ow.writeValueAsString(personsServices.test());
//
        System.out.println(json);
    }
}
