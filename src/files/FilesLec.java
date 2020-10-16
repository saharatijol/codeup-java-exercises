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

        // This will create grocery_list.txt in the project folder directly
        //Path dataFilePath = Paths.get(fileName);

        // OUTPUT the path - DON'T DO THIS
        // dataFilePath.getFileName();

        // Files.createFile(dataFilePath);
        // This will break bec Java does not know we are creating a file, it does not recognize it

        // We have to create a directory or folder first BEFORE we get to create our file
        try { // Try to catch exception if we are out of disk space
           Path dataFilePath = FileIO.createDirectoryAndFile(directoryName, fileName);

            // Let's write to our file
            List<String> groceryList = Arrays.asList("milks", "eggs", "bacon");
            Files.write(dataFilePath, groceryList);

            // Let's read our file
//            List<String> fileContents = Files.readAllLines(dataFilePath);
//            for (int i = 0; i < fileContents.size(); i++) {
//                System.out.printf("%d: %s\n", i + 1, fileContents.get(i));
//            }
            // Now, let's refactor the loop above
            FileIO.printFileContents(dataFilePath);

            // Append to the file. StandardOpenOption.APPEND will prevent overwriting
            Files.write(dataFilePath, Arrays.asList("cereal", "bread"), StandardOpenOption.APPEND);
            FileIO.printFileContents(dataFilePath);

            // To edit our file
            // 1. Read a file in.
            // 2. then, replace a line on file
            FileIO.updateLine(dataFilePath, "milks", "whole milk");
            FileIO.printFileContents(dataFilePath);

            // Remove a line from the file
            FileIO.deleteLine(dataFilePath, "bread");
            FileIO.printFileContents(dataFilePath);

            // To Empty List
            Files.write(dataFilePath, new ArrayList<>());
            System.out.println("After empty");
            FileIO.printFileContents(dataFilePath);

        } catch (IOException ex) {
            System.out.println("Cannot create file");
            ex.printStackTrace();
        }

    }
}
