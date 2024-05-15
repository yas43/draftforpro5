package Repository;

import Models.Medicalrecords;
import Models.Person;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class MedicalRecordRepository {
    private static   Repository repository = new Repository();
    public  static List<Medicalrecords> medicalRecordRepositoryList = new LinkedList<>();

    static {
        try {
            medicalRecordRepositoryList = repository.medicalrecordsRepo();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
