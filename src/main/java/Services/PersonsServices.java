package Services;


import Models.Firestations;
import Models.Person;
import Repository.FireStationRepository;
import Repository.PersonRepository;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonsServices {
    PersonRepository personRepository = new PersonRepository();
    FireStationRepository fireStationRepository = new FireStationRepository();
//    Person person = new Person();
//    Firestations firestations = new Firestations();

    public void firstationNumber(){
        System.out.println("input firestation number ");
        Scanner scanner = new Scanner(System.in);
        int fireStationNumber = scanner.nextInt();
        System.out.println("you asked for "+ fireStationNumber+"th "+"firestation");

        switch (fireStationNumber){
            case 1 :
            String address ="644 Gershwin Cir";
            break;



        }

    }




    public List<Firestations>test() throws IOException {

       List<Person> actual_Person_List = personRepository.persons();
       List<Firestations> actual_FireStation_List = fireStationRepository.firestations();

       Stream<Firestations> actual_FireStation_stream = actual_FireStation_List.stream();
       Stream<Person> actual_person_stream = actual_Person_List.stream();



        List<Firestations> matchlist = actual_FireStation_stream.
                 filter(firestations -> actual_person_stream.anyMatch(person -> person.getAddress().equals(firestations.getAddress())))
//               .collect(Collectors.groupingBy(firestations -> firestations.getStation()));
                .toList();



       return matchlist;

    }
}
