package Repository;

import Models.Medicalrecords;
import Reader.JsonReader;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class MedicalRecordsRepository {
    JsonReader jsonReader = new JsonReader();


    public List<Medicalrecords> medicalrecords() throws IOException {
        List<Medicalrecords> medicalrecordsList = new LinkedList<>();
        String jsonstring = jsonReader.readJsonString();
        JSONObject jsonObject = new JSONObject(jsonstring);
        JSONArray medicalrecordarray = jsonObject.getJSONArray("medicalrecords");
        for(int i=0;i<medicalrecordarray.length();i++){
            Medicalrecords medicalrecords = new Medicalrecords();
            medicalrecords.setFirstName(medicalrecordarray.getJSONObject(i).getString("firstName"));
            medicalrecords.setLastName(medicalrecordarray.getJSONObject(i).getString("lastName"));
            medicalrecords.setBirthdate(medicalrecordarray.getJSONObject(i).getString("birthdate"));
            medicalrecords.setMedications(medicalrecordarray.getJSONObject(i).getJSONArray("medications").toString());
            medicalrecords.setAllergies(medicalrecordarray.getJSONObject(i).getJSONArray("allergies").toString());


            medicalrecordsList.add(medicalrecords);
        }
     return medicalrecordsList;
    }
}
