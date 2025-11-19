package lab21;

import java.io.File;
import java.io.FileNotFoundException;

public class Task4 {
    static void main() throws FileNotFoundException {
        var catalog = new File("JavaMirea/src/lab9");

        var files = catalog.listFiles();
        if (files == null)
            throw new FileNotFoundException("Пустая директория!");
        for (int i = 0; i < Math.min(files.length - 1, 5); i++) {
                IO.println(files[i].getName());
        }
    }
}
