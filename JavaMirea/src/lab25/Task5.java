package lab25;

public class Task5 {
    static void main() {
        var emails = new String[]{
                "user@example.com",
                "use_r@example.com",
                "root@localhost",
                "root@localhost.",
                "root@local.host",
                "root.@localhost",
                "root_@localhost",
                "myhost@@@com.ru",
                "@my.ru",
                "Julia String",
                "test.user+tag@sub.domain.com",
                "user.name@domain.co.sub.com.brrr.df.uk",
                "user@127.0.0.1",
                "themrxxxyou@gmail.com",
                "themrxxxyou@.gmail.com",
                "medvedev.me816@yandex.ru",
                "medvedev.me816@ya.ru",
                "medvedev.me816@y.ru",
                "medvedev.m.e@edu.mirea.ru"
        };

        var regex = "^[\\w.&&[^_]]{3,}[^\\W_]@([\\w&&[^_]]{2,}\\.)*[\\w&&[^_\\d]]{2,}$";
        for (var email : emails){
            IO.println(email + "   ->   " + email.matches(regex));
        }

        IO.println("\n");
        for (var email : emails){
            if(email.matches(regex))
                IO.println(email);
        }
    }
}