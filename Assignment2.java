import java.io.*;
import java.util.*;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the file path:");
        String filePath = scan.nextLine();
        scan.close();

        File inputFile = new File(filePath);
        File outputFile = new File("file.txt");

        BufferedWriter writer = null;

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            writer = new BufferedWriter(new FileWriter(outputFile));

            String l;
            while ((l = reader.readLine()) != null) {
                StringBuilder newfile = new StringBuilder();

                for (int i = 0; i < l.length(); i++) {
                    char ch = l.charAt(i);

                    if (Character.isLetter(ch)) {
                        if ("aeiou".indexOf(Character.toLowerCase(ch)) >= 0) {
                            newfile.append(Character.toUpperCase(ch)); 
                        } else {
                            newfile.append(ch); 
                        }
                    } else {
                        newfile.append(ch); 
                    }
                }

                writer.write(newfile.toString());
                writer.newLine();
            }

            System.out.println("File saved successfully");

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error processing the file: " + e.getMessage());
        } finally {
            try {
                if (writer != null) writer.close();
            } catch (IOException e) {
                System.out.println("Error closing the writer: " + e.getMessage());
            }
        }

        try (BufferedReader newFileReader = new BufferedReader(new FileReader(outputFile))) {
            String l;
            while ((l = newFileReader.readLine()) != null) {
                System.out.println(l);
            }
        } catch (IOException e) {
            System.out.println("Error reading the processed file: " + e.getMessage());
        }
    }
}
