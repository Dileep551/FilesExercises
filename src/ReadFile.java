
//Create a Java program that reads the contents of a text file named "input.txt" and prints each line to the console.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFile {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("Java_Files/File.txt");

        Files.lines(path).forEach(System.out::println);


    }

}
