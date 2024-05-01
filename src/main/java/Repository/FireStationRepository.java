package Repository;

import Models.Firestations;
import Models.Person;
import Reader.JsonReader;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class FireStationRepository {
    List<Firestations> firestationlist = new LinkedList<>();
    JsonReader jsonReader = new JsonReader();

    public void firestations() throws IOException {
        String jsonString = jsonReader.readJsonString();
        JSONObject jsonObject = new JSONObject(jsonString);
        JSONArray firestationarray = jsonObject.getJSONArray("firestations");
        for (int i = 0; i < firestationarray.length(); i++) {
            Firestations firestations = new Firestations();
            firestations.setAddress(firestationarray.getJSONObject(i).getString("address"));
            firestations.setStation(firestationarray.getJSONObject(i).getString("station"));

            firestationlist.add(firestations);
        }
        for (Firestations firestation : firestationlist) {
            System.out.println(firestation);
        }
    }
}
