package Services;

import Models.Person;
import Repository.Repository;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class DeletePerson {
    Repository repository = new Repository();
    public List<Person> deletPerson(Person person) throws IOException {
        List<Person> personList = repository.pesonRepo();
        for (int i = 0; i < personList.size(); i++) {

            if (personList.get(i).getFirstName().replace("\"", "").equalsIgnoreCase(person.getFirstName())
                    && personList.get(i).getLastName().replace("\"", "").equalsIgnoreCase(person.getLastName())) {
                personList.remove(personList.get(i));


            }
        }
        return personList;
    }
}
