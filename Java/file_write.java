import java.io.*;

public class file_write {
    public static void main(String[] args) {

        String filePath = "C:\\Users\\broha\\OneDrive\\Documents\\Research & Code\\Java_DSA\\Java\\test.txt";

        String textContent = """
                This is a line of text.
                This is another line of text.
                This is yet another line of text.
                
                """;

        try (FileWriter writer = new FileWriter(filePath)){
            
            writer.write(textContent);
            System.out.println("Successfully wrote to the file.");

        }
        catch(FileNotFoundException e) {
            System.out.println("File not found.");
        }
        catch (IOException e) {
             System.out.println("Could not write to file.");
        }
    }
}