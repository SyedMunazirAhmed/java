import java.io.*;

public class CopyText {

    public static void main(String[] args) {
    
        File sourceFile = new File("location.txt"); 
        File destFile = new File("dest.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }
    }
}
