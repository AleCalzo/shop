package com.solvd.shop.exceptions;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class InvalidFileLocation {

    private static final Logger LOG = LogManager.getLogger("");
    private final Scanner scanner = new Scanner(System.in);
public static void show(){
    try {
        var reader = new FileReader("file.txt");
        LOG.debug("File Opened");
    }catch (FileNotFoundException e){
        LOG.debug("Sorry the file does not exist.");
    }
}


}
