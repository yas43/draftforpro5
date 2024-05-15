package Services;

import Models.Medicalrecords;
import Repository.Repository;

import java.io.IOException;
import java.util.List;

public class DeleteMedicalRecord {
    Repository repository = new Repository();
    public List<Medicalrecords> deletMedicalRecrd(Medicalrecords medicalrecords) throws IOException {
        List<Medicalrecords> medicalrecordsList = repository.medicalrecordsRepo();
        for (int i=0;i<medicalrecordsList.size();i++){
            if (medicalrecordsList.get(i).getFirstName().replace("\"", "").equalsIgnoreCase(medicalrecords.getFirstName())
            && medicalrecordsList.get(i).getLastName().replace("\"", "").equalsIgnoreCase(medicalrecords.getLastName())){
                medicalrecordsList.remove(medicalrecordsList.get(i));
            }
        }
        return medicalrecordsList;
    }
}
