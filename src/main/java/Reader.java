import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Reader {
    public Map<String, Object> readJsonString() {
        Map<String,Object> map = new HashMap<>();
        ObjectMapper mapper = new ObjectMapper();

        try (
                BufferedReader br = new BufferedReader(new FileReader("jasonstring.txt"))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();
           map = mapper.readValue(everything, Map.class);
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            return map;
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        } catch (
                IOException e) {
            e.printStackTrace();
        }

        return map;

    }

    public Object returnPersons(){
        Reader reader = new Reader();
          Map<String,Object> map = reader.readJsonString();
          return map.get("persons");

    }

    public Object returnFirestations(){
        Reader reader = new Reader();
        Map<String,Object> map = reader.readJsonString();
        return map.get("firestations");

    }

    public Object returnMedicalrecords(){
        Reader reader = new Reader();
        Map<String,Object> map = reader.readJsonString();
        return map.get("medicalrecords");

    }

}
