package Reader;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JsonReader {

    public String readJsonString() throws IOException {
        String jsonstring ="";
        BufferedReader br = new BufferedReader(new FileReader("jasonstring.txt"));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
           jsonstring = sb.toString();
            return jsonstring;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            br.close();
        }
        return jsonstring;
    }


    public void readPersons() throws IOException {
        JsonReader jsonReader = new JsonReader();
        String persnsString = jsonReader.readJsonString();
        JSONObject jsonObject = new JSONObject(persnsString);
    }

}
