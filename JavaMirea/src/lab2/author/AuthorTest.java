package lab2.author;

public class AuthorTest {
    public static void main(String[] args){
        // ctrl p || ctrl q для показа сигнатуры метода в IntelliJ IDEA
        var author = new Author("Медведев Михаил Евгеньевич", "medvedev.m.e@edu.mirea.ru", 'M');
        System.out.println(author.toString());
        author.setEmail("medvedev.m.e.test.email@edu.mirea.ru");
        System.out.println(author.toString());
    }
}
