package Repository;

import Models.Person;
import Reader.JsonReader;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class PersonRepository {
    JsonReader jsonReader = new JsonReader();


   public List<Person> persons() throws IOException {
       List<Person> personlist = new LinkedList<>();
        String jsonString = jsonReader.readJsonString();
       JSONObject jsonObject = new JSONObject(jsonString);
       JSONArray personsarray = jsonObject.getJSONArray("persons");
       for(int i=0;i<personsarray.length();i++){
           Person person = new Person();
           person.setFirstName( personsarray.getJSONObject(i).getString("firstName"));
           person.setLastName(personsarray.getJSONObject(i).getString("lastName"));
           person.setAddress(personsarray.getJSONObject(i).getString("address"));
           person.setCity(personsarray.getJSONObject(i).getString("city"));
           person.setZip(personsarray.getJSONObject(i).getString("zip"));
           person.setPhone(personsarray.getJSONObject(i).getString("phone"));
           person.setEmail(personsarray.getJSONObject(i).getString("email"));

           personlist.add(person);
       }


       return personlist;
   }
}
