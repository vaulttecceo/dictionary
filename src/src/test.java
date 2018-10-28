import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {
        String file = "/Users/johnmcguinness/Desktop/JavaPrograms/dictwitherik/src/src/source.txt";

        BufferedReader reader = new BufferedReader(new FileReader(file));
        String currentLine = reader.readLine();
        reader.close();

        System.out.println(currentLine);

    }



}
