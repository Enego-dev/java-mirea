package lab19;

import java.util.Scanner;

public class Task1 {
    static void main() {
        var scanner = new Scanner(System.in);
        var fullName = new ParseFullName(scanner.nextLine()).getFullName();
        var inn = new ParseInn(scanner.nextLine()).getInn();

    }

    public static class ParseFullName{
        private final String fullName;
        public ParseFullName(String raw){
            var name = raw.trim();
            var split = name.split(" ");
            if (split.length != 3){
                throw new FullNameParsingException("ФИО введено неверно. Запишите в формате Фамилия (пробел) Имя (пробел) Отчество");
            }
            fullName = name;
        }

        public String getFullName(){
            return fullName;
        }

        public static class FullNameParsingException extends IllegalArgumentException{
            public FullNameParsingException(){
                super();
            }

            public FullNameParsingException(String s){
                super(s);
            }

            public FullNameParsingException(String message, Throwable cause){
                super(message, cause);
            }

            public FullNameParsingException(Throwable cause){
                super(cause);
            }
        }
    }

    public static class ParseInn{
        private final String inn;
        public ParseInn(String raw){
            if (!raw.matches("^\\d{12}$"))
                throw new InnParsingException("ИНН должен состоять из 12 цифр");

            inn = raw;
        }

        public String getInn(){
            return inn;
        }

        public static class InnParsingException extends IllegalArgumentException{
            public InnParsingException(){
                super();
            }

            public InnParsingException(String s){
                super(s);
            }

            public InnParsingException(String message, Throwable cause){
                super(message, cause);
            }

            public InnParsingException(Throwable cause){
                super(cause);
            }
        }
    }
}
