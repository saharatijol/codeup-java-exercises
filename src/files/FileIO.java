package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileIO {
    public static Path createDirectoryAndFile(String directoryName, String fileName) throws IOException {
        Path directoryPath = Paths.get(directoryName);
        Path dataFilePath = Paths.get(directoryName, fileName);

        // We have to create a directory or folder first BEFORE we get to create our file
        if (Files.notExists(directoryPath)) { //1. checks if directory does NOT exists
            Files.createDirectories(directoryPath); // Create Path
        }

        if (!Files.exists(dataFilePath)) { //2. checks if filename itself does NOT exists
            Files.createFile(dataFilePath); // Create File
        }
        return dataFilePath;
    }

    public static void printFileContents(Path filePath) throws IOException {
        System.out.println();
        List<String> fileContents = Files.readAllLines(filePath);
        for (int i = 0; i < fileContents.size(); i++) {
            System.out.printf("%d: %s\n", i + 1, fileContents.get(i));
        }
    }

    public static void updateLine(Path filePath, String oldValue, String newValue) throws IOException {
        List<String> fileContents = Files.readAllLines(filePath);
        List<String> modifiedList = new ArrayList<>();
        for (String item : fileContents) {
            // TODO: Add my modified item
            if (item.equals("milks")) {
                modifiedList.add("whole milk");
            } else {
                // TODO: Add the existing item bec it isn't what we want to replace.
                modifiedList.add(item);
                //System.out.println("did not find that item");
            }
            Files.write(filePath, modifiedList);
        }
    }
}
