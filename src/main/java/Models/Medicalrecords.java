package Models;

import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Medicalrecords {
    String firstName;
    String lastName;
    String birthdate;
    String medications;
    String allergies;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getMedications() {
        return medications;
    }

    public String getAllergies() { return allergies; }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public void setMedications(String medications) {
        this.medications = medications;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public  boolean isAdult(String birthdate) throws IOException {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("\"MM/dd/yyyy\"", Locale.ENGLISH);
                LocalDate currentDate = LocalDate.now();

                LocalDate personBirthdate = LocalDate.parse(birthdate, formatter);
                int age = Period.between(personBirthdate, currentDate).getYears();
                if (age > 18) return true;
                else return false;

            }


        @Override
    public String toString() {
        return "Medicalrecords{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", medications='" + medications + '\'' +
                ", allergies='" + allergies + '\'' +
                '}';
    }
}
