package Reader;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;

public class JsonReaderFile {
    private static ObjectMapper mapper = new ObjectMapper();

    public JsonNode JsonReaderFilePerson() throws IOException {
        InputStream Input =
                JsonReaderFile.class.getClassLoader()
                        .getResourceAsStream("data.json");

        JsonNode rootNode = mapper.readTree(Input);
        return rootNode.path("persons");

    }

    public JsonNode JsonReaderFileFireStation() throws IOException {
        InputStream Input =
                JsonReaderFile.class.getClassLoader()
                        .getResourceAsStream("data.json");

        JsonNode rootNode = mapper.readTree(Input);
        return rootNode.path("firestations");

    }

    public JsonNode JsonReaderFileMedicalRecords() throws IOException {
        InputStream Input =
                JsonReaderFile.class.getClassLoader()
                        .getResourceAsStream("data.json");

        JsonNode rootNode = mapper.readTree(Input);
        return rootNode.path("medicalrecords");

    }


    public JsonNode JsonReaderFileAll() throws IOException {
        InputStream Input =
                JsonReaderFile.class.getClassLoader()
                        .getResourceAsStream("data.json");

        JsonNode rootNode = mapper.readTree(Input);
        return rootNode;

    }
public void test(){
    System.out.println("this is jus a test");
    System.out.println("my name is yaser");
}

}
