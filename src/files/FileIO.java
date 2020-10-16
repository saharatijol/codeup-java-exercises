package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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
}
