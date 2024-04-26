package advancedJavaCode;

import java.io.*; //replace with a file you want to read

public class FileReadWrite {
	 public static void main(String[] args) {
	        String fileName = "input.txt";
	        String content = "Hello, World!";

	        // Writing to a file
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
	            writer.write(content);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        // Reading from a file
	        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                System.out.println(line);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
}
