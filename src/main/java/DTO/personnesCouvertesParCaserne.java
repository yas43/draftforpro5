package DTO;

public class personnesCouvertesParCaserne {
    String firstName;
    String lastName;
    String adresse;
    String phone;
    int numberOfAdults;
    int numberOfKids;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getPhone() {
        return phone;
    }

    public int getNumberOfAdults() {
        return numberOfAdults;
    }

    public int getNumberOfKids() {
        return numberOfKids;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setNumberOfAdults(int numberOfAdults) {
        this.numberOfAdults = numberOfAdults;
    }

    public void setNumberOfKids(int numberOfKids) {
        this.numberOfKids = numberOfKids;
    }

    @Override
    public String toString() {
        return "ListePersonnesCouvertesParCaserne{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", adresse='" + adresse + '\'' +
                ", phone='" + phone + '\'' +
                ", numberOfAdults=" + numberOfAdults +
                ", numberOfKids=" + numberOfKids +
                '}';
    }
}
