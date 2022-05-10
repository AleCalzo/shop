package com.solvd.shop.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InvalidData extends RuntimeException{

    public String getMessage() {
        return "Insert only letters please";
    }
}
