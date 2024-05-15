package Services;

import Models.Person;
import Reader.JsonReaderFile;
import Repository.Repository;

import java.io.IOException;
import java.util.List;

public class PostPerson {
    Repository repository =new Repository();

     public List<Person> postPerson(Person person) throws IOException {
        List<Person>  personList = repository.pesonRepo();
        personList.add(person);
        return personList;

    }
}
