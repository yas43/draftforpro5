package DTO;

public class CommunityEmail {
    String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "CommunityEmail{" +
                "email='" + email + '\'' +
                '}';
    }
}
