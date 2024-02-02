
//Create a Java program that checks if a file named "sample.txt"
// exists in the current directory. Print a message indicating whether it exists or not.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CheckFileName {

    public static void main(String[] args) throws IOException {

        Path currentDirectory = Paths.get("./Java_Files/sample.txt");

        if(Files.isReadable(currentDirectory)){

            System.out.println("Files exists ");
        }
        else{

            System.out.println("File not exists");

        }





    }

}
