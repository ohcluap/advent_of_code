import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by pcho on 12/10/15.
 */
public class Day1 {
    public static void main(String[] args) {
        long floor = 0L;

        try {
            FileReader file = new FileReader("../../input.txt");
            int nextChar = file.read();
            while (nextChar != -1) {
                char currentChar = (char) nextChar;
                if (currentChar == '(') {
                    floor++;
                } else if (currentChar == ')') {
                    floor--;
                }
                nextChar = file.read();
            }
            file.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.print("There are " + floor + " floors.");
    }
}
