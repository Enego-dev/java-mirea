package lab13;

public class Person {
    private final String firstName;
    private final String lastName;
    private final String middleName;
    private final String shortName;


    public Person(String lastName){
        this.lastName = lastName;
        firstName = null;
        middleName = null;
        shortName = generateShortName();
    }

    public Person(String firstName, String lastName, String middleName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        shortName = generateShortName();
    }

    public String getShortName(){
        return shortName;
    }

    private String generateShortName(){
        var stringBuilder = new StringBuilder();
        stringBuilder.append(lastName);

        if(firstName != null && !firstName.isEmpty() && !firstName.startsWith(" ")){
            stringBuilder.append(" ");
            stringBuilder.append(firstName.charAt(0));
            stringBuilder.append(".");
            IO.println("1");
        }

        if(middleName != null && !middleName.isEmpty() && !middleName.startsWith(" ")){
            stringBuilder.append(" ");
            stringBuilder.append(middleName.charAt(0));
            stringBuilder.append(".");
        }

        return stringBuilder.toString();
    }
}
