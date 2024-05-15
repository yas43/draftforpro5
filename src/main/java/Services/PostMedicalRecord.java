package Services;

import Models.Medicalrecords;
import Repository.Repository;

import java.io.IOException;
import java.util.List;

public class PostMedicalRecord {
     Repository repository = new Repository();

     public List<Medicalrecords> addMedicalRecords(Medicalrecords medicalrecords) throws IOException {
         List<Medicalrecords> medicalrecordsList = repository.medicalrecordsRepo();

         medicalrecordsList.add(medicalrecords);

         return medicalrecordsList;
     }
 }
