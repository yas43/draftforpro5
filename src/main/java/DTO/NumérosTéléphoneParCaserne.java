package DTO;

import Reader.JsonReaderFile;

public class NumérosTéléphoneParCaserne {

    String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "NumérosTéléphoneParCaserne{" +
                "phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
