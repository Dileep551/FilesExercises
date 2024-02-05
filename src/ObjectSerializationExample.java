//Write a Java program that serializes an object
// (e.g., a custom class with some data) to a file named "object.ser".


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class CustomObject implements Serializable {
    private static final long serialVersionUID = 1L;
    private String data;

    public CustomObject(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}

public class ObjectSerializationExample {
    public static void main(String[] args) {
        // Create an instance of your custom class
        CustomObject customObject = new CustomObject("Hello, world!");

        // Serialize the object and write it to a file
        serializeObject(customObject);
    }

    private static void serializeObject(CustomObject object) {
        try (FileOutputStream fileOut = new FileOutputStream("object.ser");
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {

            // Write the object to the file
            objectOut.writeObject(object);

            System.out.println("Object has been serialized and written to object.ser");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
