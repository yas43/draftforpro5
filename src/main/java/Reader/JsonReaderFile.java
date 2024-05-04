package Reader;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;

public class JsonReaderFile {
    private static ObjectMapper mapper = new ObjectMapper();

    public JsonNode JsonReaderFilePerson() throws IOException {
        InputStream exampleInput =
                JsonReaderFile.class.getClassLoader()
                        .getResourceAsStream("data.json");

        JsonNode rootNode = mapper.readTree(exampleInput);
        return rootNode.path("persons");

    }

    public JsonNode JsonReaderFileFireStation() throws IOException {
        InputStream exampleInput =
                JsonReaderFile.class.getClassLoader()
                        .getResourceAsStream("data.json");

        JsonNode rootNode = mapper.readTree(exampleInput);
        return rootNode.path("firestations");

    }

    public JsonNode JsonReaderFileMedicalRecords() throws IOException {
        InputStream exampleInput =
                JsonReaderFile.class.getClassLoader()
                        .getResourceAsStream("data.json");

        JsonNode rootNode = mapper.readTree(exampleInput);
        return rootNode.path("medicalrecords");

    }
}
