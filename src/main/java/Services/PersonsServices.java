package Services;


import DTO.PersonnesCouvertesParCaserne;
import Models.Medicalrecords;
import Models.Person;
import Reader.JsonReaderFile;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;

public class PersonsServices {
    JsonReaderFile jsonReaderFile = new JsonReaderFile();

    private void convertEntityToDTO() throws IOException {
        PersonnesCouvertesParCaserne personnesCouvertesParCaserne = new PersonnesCouvertesParCaserne();
//        PersonsServices personsServices = new PersonsServices();
//        personnesCouvertesParCaserne.setFirstName(medicalrecords.getFirstName());
//        personnesCouvertesParCaserne.setLastName(medicalrecords.getLastName());
//        personnesCouvertesParCaserne.setAdresse(person.getAddress());
//        personnesCouvertesParCaserne.setPhone(person.getPhone());
//        personnesCouvertesParCaserne.setNumberOfAdults(counterOfAdult(medicalrecords));
//        personnesCouvertesParCaserne.setNumberOfAdults(personsServices.numberOfAdult());
//        personnesCouvertesParCaserne.setNumberOfKids(personsServices.numberOfKids());
    }

    public int counterOfAdult(Medicalrecords medicalrecords) throws IOException {
        int numberofadult=0;

        for (JsonNode person: jsonReaderFile.JsonReaderFileMedicalRecords()){
//            if( isAdult(person))
//                numberofadult++;
//
        if (medicalrecords.isAdult(person.path("birthdate").toString())){
            numberofadult++;
            }

        }


        return numberofadult;
    }


//    public int numberOfKids() throws IOException {
//        int numberofkids=0;
//
//        for (JsonNode person: jsonReaderFile.JsonReaderFileMedicalRecords()){
//            if (isAdult(person)==false)
//                numberofkids++;
//
//        }


//        return numberofkids;
//    }


//    public  static boolean isAdult(JsonNode person) throws IOException {
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("\"MM/dd/yyyy\"", Locale.ENGLISH);
//        LocalDate currentDate = LocalDate.now();
//
//        LocalDate personBirthdate = LocalDate.parse(person.path("birthdate").toString(), formatter);
//        int age = Period.between(personBirthdate, currentDate).getYears();
//        if (age > 18) return true;
//        else return false;
//
//    }

}






