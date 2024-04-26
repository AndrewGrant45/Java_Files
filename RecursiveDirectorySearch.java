//Recursive Directory Search:
//This example demonstrates how to recursively search a directory and its sub-directories to find all files within it. 
//It utilizes the java.io.File class to represent directories and files. 
//The example takes a directory path as input, checks if it exists and is a directory, 
//and then recursively searches for files within the directory and its sub-directories. 
//It show cases how to use recursion to traverse a directory tree and perform operations on files.

//Doesn't work because there is no path to directory "Invalid directory"

package advancedJavaCode;

import java.io.File;

public class RecursiveDirectorySearch {
	public static void main(String[] args) {
        String directoryPath = "/path/to/directory"; // Specify the directory path to search
        
        searchDirectory(new File(directoryPath));
    }
    
    public static void searchDirectory(File directory) {
        if (directory.isDirectory()) {
            System.out.println("Searching in directory: " + directory.getAbsolutePath());
            
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        searchDirectory(file); // Recursively search subdirectories
                    } else {
                        System.out.println("Found file: " + file.getAbsolutePath());
                    }
                }
            }
        } else {
            System.out.println("Invalid directory: " + directory.getAbsolutePath());
        }
    }
}
