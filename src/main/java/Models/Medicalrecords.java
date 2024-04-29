package Models;

public class Medicalrecords {
    String firstName;
    String lastName;
    String birthdate;
    String medications;

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

    @Override
    public String toString() {
        return "Models.Medicalrecords{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", medications='" + medications + '\'' +
                '}';
    }
}
