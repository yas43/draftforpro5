package Services;

import Models.Firestations;
import Reader.JsonReaderFile;
import Repository.Repository;
import jdk.security.jarsigner.JarSigner;

import java.io.IOException;
import java.util.List;

public class PostFireStation {
   Repository repository = new Repository();



    public List<Firestations> addFireStation(Firestations firestations) throws IOException {
        List<Firestations> firestationsList = repository.firestationRepo();
        firestationsList.add(firestations);
        return firestationsList;



    }
}
