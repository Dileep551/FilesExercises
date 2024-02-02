
//Modify the program from Question 1.1 to count and display the number of words in the file.

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class ReadCountWords {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("Java_Files/File.txt");

        Stream<String> fileLines = Files.lines(path, Charset.defaultCharset());

         long wordCount = fileLines.flatMap(line -> Arrays.stream(line.split(" "))).count();

        System.out.println(wordCount);




    }
}
