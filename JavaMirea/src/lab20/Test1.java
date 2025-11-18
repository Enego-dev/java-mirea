package lab20;

import lab2.author.Author;

public class Test1 {
    static void main() {
        var test = new Task1<>(1, new Dog(), new Author("Кулибаба", "themrx@ya,ru", 'M'));
        // обязательно new Task1<>, иначе компилятор не будет проверять типы автоматически, своеобразная защита от
        // дурака-разраба (warning: raw used of parametrized class)
        test.describe();
    }
}
