//import Services.PersonsServices;

import Models.Firestations;
import Models.Medicalrecords;
import Models.Person;
import Repository.*;
import Services.*;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.json.JSONArray;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException {


//        JSONArray jsonArray1 = new JSONArray(FireStationRepository.firestationsList);
//
//        ObjectMapper mapper = new ObjectMapper();
//        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
//        writer.writeValue(new File("C:/Users/yaser/IdeaProjects/simplemavendraftjson/src/main/resources/dataTwo.json"), jsonArray1);


//        PostPerson postPerson = new PostPerson();
//        Person person = new Person("ali","keshtdar","aryashahr","tehran","13413","44128541","akeshtdar@yahoo.com");
//        System.out.println(postPerson.postPerson(person));

//        UpdatrPerson updatrPerson = new UpdatrPerson();
//        Person person1 = new Person("John","Boyd","","tehran","13413","44128541","akeshtdar@yahoo.com");
//        System.out.println(updatrPerson.updatrPerson(person1));

//        DeletePerson deletePerson = new DeletePerson();
//        Person person1 = new Person("John","Boyd","","tehran","13413","44128541","akeshtdar@yahoo.com");
//        System.out.println(deletePerson.deletPerson(person1));


//        PostFireStation postFireStation = new PostFireStation();
//        Firestations firestations_new = new Firestations("saadatabad","12");
//        System.out.println( postFireStation.addFireStation(firestations_new));


//        UpdateFireStation updateFireStation = new UpdateFireStation();
//                Firestations firestations_new = new Firestations("112 Steppes Pl","303");
//        System.out.println(    updateFireStation.updateFireStations(firestations_new));


        DeletFireStation deletFireStation = new DeletFireStation();
        Firestations firestations_new = new Firestations("","3");
        System.out.println(deletFireStation.deleteFireStations(firestations_new));



    }
}
