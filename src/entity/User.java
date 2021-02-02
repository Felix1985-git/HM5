package entity;

public class User extends Person {
    private String email;
    private String password;

    public User(String firstName, String lastName, String email, String password) {
        super(firstName, lastName);
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getFullInfo() {
        return "Имя: " + super.getFullName() + "\n" + "E-mail: " + getEmail();
    }

    public boolean isPasswordCorrect(String password) {
        return password.equals(this.password);
    }

}
