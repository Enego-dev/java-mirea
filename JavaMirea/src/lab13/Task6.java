package lab13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    static void main() {
        var scanner = new Scanner(System.in);
        var fileName = scanner.nextLine();
        fileName = fileName.split(".txt")[0];
        if (fileName.equals(" ")){
            IO.println("Пустое имя файла");
            return;
        }

        if(fileName.split(" ").length <= 1){
            IO.println("Вы ввели недостаточное кол-во слов");
            return;
        }

        IO.println(getLine(fileName));
    }

    private static String getLine(String fileName){
        var words = new ArrayList<>(Arrays.asList(fileName.split(" ")));
        var out = new StringBuilder();

        var firstWord = words.getFirst();
        out.append(firstWord);
        words.remove(firstWord);

        boolean execute;
        char lastChar = firstWord.toLowerCase().charAt(firstWord.length() - 1);

        do {
            execute = false;

            for (int i = 0; i < words.size(); i++) {
                var currentWord = words.get(i);
                var currentWordLower = currentWord.toLowerCase();
                var firstChar = currentWordLower.charAt(0);
                if(lastChar == firstChar){
                    execute = true;
                    lastChar = currentWordLower.charAt(currentWord.length() - 1);
                    out.append(" ").append(currentWord);
                    words.remove(currentWord);
                    break;
                }
            }
        } while (execute);

        return out.toString();
    }
}
