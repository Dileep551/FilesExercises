//Modify the program from Question 6.1 to deserialize
// the object from "object.ser" and print its contents.


import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectDeserializationExample {
    public static void main(String[] args) {
        // Deserialize the object from the file
        CustomObject deserializedObject = deserializeObject();

        // Print the contents of the deserialized object
        if (deserializedObject != null) {
            System.out.println("Deserialized Object Data: " + deserializedObject.getData());
        }
    }

    private static CustomObject deserializeObject() {
        try (FileInputStream fileIn = new FileInputStream("object.ser");
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {

            // Read the object from the file
            Object obj = objectIn.readObject();

            if (obj instanceof CustomObject) {
                return (CustomObject) obj;
            } else {
                System.err.println("Unexpected object type found in object.ser");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
