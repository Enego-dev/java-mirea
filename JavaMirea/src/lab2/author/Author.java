package lab2.author;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // методы, относящиеся к имени
    public String getName() {
        return name;
    }

    // методы, относящиеся к почте
    public String getEmail() {
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    // методы, относящиеся к полу
    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}
