package Repository;

import Models.Person;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

 public class PersonRepository {

         private static   Repository repository = new Repository();
    public  static List<Person> personList = new LinkedList<>();

static {
    try {
        personList = repository.pesonRepo();
    } catch (IOException e) {
        e.printStackTrace();
    }

}


//    private List<Person> initialingpersonlist() throws IOException {
//         personList = repository.pesonRepo();
//         return personList;
//    }


}
