package Services;


import Models.Firestations;
import Models.Person;
import Repository.PersonRepository;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PersonsServices {
    PersonRepository personRepository = new PersonRepository();
    Person person = new Person();
    Firestations firestations = new Firestations();

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




    public Map<String,List<Person>>test() throws IOException {

       List<Person> persolis  = personRepository.persons();



         Map<String,List<Person>> map = persolis.stream()
               .collect(Collectors.groupingBy(s->s.getAddress()));


       return  map;

    }
}
