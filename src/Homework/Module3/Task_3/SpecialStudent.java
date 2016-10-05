package Homework.Module3.Task_3;

public class SpecialStudent extends CollegeStudent {
    private long secretKey;
    private String email;

    public SpecialStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public SpecialStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    public SpecialStudent(long secretKey, String collegeName, int rating, long id) {
        super(collegeName,rating,id);
        this.secretKey=secretKey;
    }

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getSecretKey() {

        return secretKey;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "SpecialStudent{" +
                "secretKey=" + secretKey +
                ", email='" + email + '\'' +
                '}';
    }
}
