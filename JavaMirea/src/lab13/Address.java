package lab13;

import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;

    public Address(String country, String region, String city, String street, String house, String building, String apartment) {
        this.country = country;
        this.region = region;
        this.city = city;
        this.street = street;
        this.house = house;
        this.building = building;
        this.apartment = apartment;
    }

    public Address(String dryString){
        generateAddress(dryString);
    }

    public void generateAddress(String addressString) {
        if (addressString == null || addressString.trim().isEmpty()) {
            throw new IllegalArgumentException("Адресная строка не может быть пустой");
        }

        var parts = addressString.split(",");

        if (parts.length < 7) {
            IO.println("Недостаточно частей адреса. Ожидается 7 частей, получено: " + parts.length + "\nПопробуем другой способ.");
            parseWithTokenizer(addressString);
            return;
        }

        this.country = parts[0].trim();
        this.region = parts[1].trim();
        this.city = parts[2].trim();
        this.street = parts[3].trim();
        this.house = parts[4].trim();
        this.building = parts[5].trim();
        this.apartment = parts[6].trim();
    }

    public void parseWithTokenizer(String addressString) {
        if (addressString == null || addressString.trim().isEmpty()) {
            throw new IllegalArgumentException("Адресная строка не может быть пустой");
        }

        var tokenizer = new StringTokenizer(addressString, ",.;");

        if (tokenizer.countTokens() < 7) {
            throw new IllegalArgumentException("Недостаточно частей адреса. Ожидается 7 частей, получено: " + tokenizer.countTokens());
        }

        this.country = tokenizer.nextToken().trim();
        this.region = tokenizer.nextToken().trim();
        this.city = tokenizer.nextToken().trim();
        this.street = tokenizer.nextToken().trim();
        this.house = tokenizer.nextToken().trim();
        this.building = tokenizer.nextToken().trim();
        this.apartment = tokenizer.nextToken().trim();
    }

    @Override
    public String toString() {
        return country + ", " + region + " обл., г. " + city + ", ул. " + street + ", д. " + house + ", стр. " + building + ", кв. " + apartment;
    }
}
