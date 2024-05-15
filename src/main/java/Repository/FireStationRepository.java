package Repository;

import Models.Firestations;
import Models.Person;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class FireStationRepository {
    private static   Repository repository = new Repository();
    public  static List<Firestations> firestationsList = new LinkedList<>();

    static {
        try {
            firestationsList = repository.firestationRepo() ;
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
