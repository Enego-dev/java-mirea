package lab13;

public class Task1 {
    static void main() {
        doStuff("I like Java!!!");
    }

    private static void doStuff(String str){
        IO.println(str.charAt(str.length() - 1));
        IO.println(str.endsWith("!!!"));
        IO.println(str.startsWith("I like"));
        IO.println(str.contains("Java"));
        IO.println(str.indexOf("Java"));

        str = str.replace('a', 'o');
        IO.println(str);

        str = str.toUpperCase();
        IO.println(str);

        str = str.toLowerCase();
        IO.println(str);

        IO.println(str.substring(7, 11));
    }
}
