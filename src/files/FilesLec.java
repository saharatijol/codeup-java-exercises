package files;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilesLec {
    public static void main(String[] args) throws IOException {

        String directoryName = "data";
        String fileName = "grocery_list.txt";


        Path directoryPath = Paths.get(directoryName);
        Path dataFilePath = Paths.get(directoryName, fileName);
        // Here, we create our own path
        // This is an interface, therefore we can't instantiate it

        // This will create grocery_list.txt in the project folder directly
        //Path dataFilePath = Paths.get(fileName);

        // OUTPUT the path
        // dataFilePath.getFileName();

        // Files.createFile(dataFilePath);
        // This will break bec Java does not know we are creating a file, it does not recognize it

        // We have to create a directory or folder first BEFORE we get to create our file

        try { // Try to catch exception if we are out of disk space
            if (Files.notExists(directoryPath)) { //1. checks if directory does NOT exists
                Files.createDirectories(directoryPath); // Create Path
            }

            if (!Files.exists(dataFilePath)) { //2. checks if filename itself does NOT exists
                Files.createFile(dataFilePath); // Create File
            }

            // Let's write to our file
            List<String> groceryList = Arrays.asList("milks", "eggs", "bacon");
            Files.write(dataFilePath, groceryList);

            // Let's read our file
            List<String> fileContents = Files.readAllLines(dataFilePath);
            for (int i = 0; i < fileContents.size(); i++) {
                System.out.printf("%d: %s\n", i + 1, fileContents.get(i));
            }

            // Append to the file. StandardOpenOption.APPEND will prevent overwriting
            Files.write(dataFilePath, Arrays.asList("cereal", "bread"), StandardOpenOption.APPEND);
            fileContents = Files.readAllLines(dataFilePath);
            System.out.println();
            for (int i = 0; i < fileContents.size(); i++) {
                System.out.printf("%d: %s\n", i + 1, fileContents.get(i));
            }

            // To edit our file
            // 1. Read a file in.
            // First, let's try to replace a line the file
            fileContents = Files.readAllLines(dataFilePath);
            List<String> modifiedList = new ArrayList<>();
            for (String item : fileContents) {
                // TODO: Add my modified item
                if(item.equals("milks")) {
                    modifiedList.add("whole milk");
                } else {
                // TODO: Add the existing item bec it isn't what we want to replace.
                    modifiedList.add(item);
                    //System.out.println("did not find that item");
                }
                Files.write(dataFilePath, modifiedList);
                // Let's see what happens by printing it out
                System.out.println();
                fileContents = Files.readAllLines(dataFilePath);
                System.out.println();
                for (int i = 0; i < fileContents.size(); i++) {
                    System.out.printf("%d: %s\n", i + 1, fileContents.get(i));
                }
            }

            // Remove a line from the file
            fileContents = Files.readAllLines(dataFilePath);
            System.out.println();
            modifiedList = new ArrayList<>(); // cleared it out
            for (String item: fileContents) {
                // TODO I want to remove bread from the list
                if(!item.equals("bread")) {
                    modifiedList.add(item);
                }
            }
            Files.write(dataFilePath, modifiedList);
            fileContents = Files.readAllLines(dataFilePath);
            System.out.println();
            for (int i = 0; i < fileContents.size(); i++) {
                System.out.printf("%d: %s\n", i + 1, fileContents.get(i));
            }
        } catch (IOException ex) {
            System.out.println("Cannot create file");
            ex.printStackTrace();
        }

    }
}
