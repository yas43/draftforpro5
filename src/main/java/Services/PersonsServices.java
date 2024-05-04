package Services;


import DTO.ListePersonnesCouvertesParCaserne;
import Models.Person;

public class PersonsServices {

private void convertEntityToDTO(Person person){
    ListePersonnesCouvertesParCaserne listePersonnesCouvertesParCaserne =new ListePersonnesCouvertesParCaserne();

    listePersonnesCouvertesParCaserne.setFirstName(person.getFirstName());
    listePersonnesCouvertesParCaserne.setLastName(person.getLastName());
    listePersonnesCouvertesParCaserne.setAdresse(person.getAddress());
    listePersonnesCouvertesParCaserne.setPhone(person.getPhone());
//    listePersonnesCouvertesParCaserne.setNumberOfAdults(person.);
}

private int numberOfAdult(){
    return 10;
}
    }



