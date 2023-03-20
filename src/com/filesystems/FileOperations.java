package com.filesystems;

import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;

public class FileOperations
{
    static String path;
    File file;
    
    static {
        FileOperations.path = "E://storage/file4.txt";
    }
    
    public static void main( String[] args) {
         FileOperations fileOperations = new FileOperations();
        try {
            fileOperations.creatingFile();
            fileOperations.writingFile();
            fileOperations.readingFile();
            fileOperations.deletingFile();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void deletingFile() {
        if (this.file.delete()) {
            System.out.println("File deleted successfully");
        }
        else {
            System.out.println("Failed to delete the file");
        }
    }
    
    public void creatingFile() throws IOException {
        System.out.println("Fun: creatingFile");
        this.file = new File(FileOperations.path);
        if (this.file.createNewFile()) {
            System.out.println("File Created successfully");
        }
        else {
            System.out.println("File Already exists");
        }
    }
    
    protected void readingFile() throws FileNotFoundException {
        if (this.file.length() != 0L) {
            try {
                final FileReader fileReader = new FileReader(this.file);
                fileReader.read();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        else {
            System.out.println("File is empty");
        }
    }
    
    public void writingFile() throws IOException {
        try {
            Throwable t = null;
            try {
                 FileWriter fileWriter = new FileWriter(this.file);
                try {
                    if (this.file.length() != 0L) {
                        System.out.println("File is empty");
                    }
                    else {
                        fileWriter.write("Write operation on File");
                        System.out.println("Performed Write Operation successfully");
                    }
                }
                finally {
                    if (fileWriter != null) {
                        fileWriter.close();
                    }
                }
            }
            finally {
                if (t == null) {
                    final Throwable exception = null;
                    t = exception;
                }
                else {
                    final Throwable exception = null;
                    if (t != exception) {
                        t.addSuppressed(exception);
                    }
                }
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
