package Services;

import Models.Firestations;
import Repository.Repository;

import java.io.IOException;
import java.util.List;

public class UpdateFireStation {
     Repository repository = new Repository();
     public List<Firestations> updateFireStations(Firestations firestations) throws IOException {
          List<Firestations> firestationsList = repository.firestationRepo();
          for (int i=0;i<firestationsList.size();i++){
              if (firestationsList.get(i).getAddress().replace("\"", "").equalsIgnoreCase(firestations.getAddress())){
//                  System.out.println(firestationsList.get(i).getStation());
                  firestationsList.get(i).setStation(firestations.getStation());
              }

          }

         return  firestationsList;
     }
}
