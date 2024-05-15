package Services;

import Models.Firestations;
import Repository.Repository;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class DeletFireStation {
    Repository repository = new Repository();
    public List<Firestations> deleteFireStations(Firestations firestations) throws IOException {
        List<Firestations> firestationsList = repository.firestationRepo();
        List<Firestations> firestationsListdeleted = new LinkedList<>();
        for (int i = 0; i < firestationsList.size(); i++) {

            if (firestationsList.get(i).getAddress().replace("\"", "").equalsIgnoreCase(firestations.getAddress())
                    || firestationsList.get(i).getStation().replace("\"", "").equalsIgnoreCase(firestations.getStation())) {

//                firestationsList.remove(firestationsList.get(i));
                firestationsListdeleted.add(firestationsList.get(i));


            }
        }
        for (Firestations firestations1:firestationsListdeleted){
            firestationsList.remove(firestations1);
        }
        return firestationsList;
    }
}
