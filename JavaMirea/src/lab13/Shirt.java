package lab13;

public class Shirt {
    private String article;
    private String model;
    private String color;
    private String size;

    public Shirt(String drySting){
        var splitString = drySting.split(",");
        article = splitString[0].trim();
        model = splitString[1].trim();
        color = splitString[2].trim();
        size = splitString[3].trim();
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "article='" + article + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
