import java.io.*;

public class file_read {
    public static void main(String[] args) {
        
        String filePath = "C:\\Users\\broha\\OneDrive\\Documents\\Research & Code\\Java_DSA\\Java\\test.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            System.out.println("File exists and can be read.");
            System.out.println();
            
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("File not found.");
        }
        catch (IOException e) {
            System.out.println("Could not read file.");
        }
        catch(Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
