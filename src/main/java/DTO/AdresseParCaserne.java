package DTO;

import java.util.List;

public class AdresseParCaserne {
    String firstName;
    String phone;
    int age;
    List<String> medicalbackgroundlist;

    public String getFirstName() {
        return firstName;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public List<String> getMedicalbackgroundlist() {
        return medicalbackgroundlist;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMedicalbackgroundlist(List<String> medicalbackgroundlist) {
        this.medicalbackgroundlist = medicalbackgroundlist;
    }

    @Override
    public String toString() {
        return "AdresseParCaserne{" +
                "firstName='" + firstName + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", medicalbackgroundlist=" + medicalbackgroundlist +
                '}';
    }
}
