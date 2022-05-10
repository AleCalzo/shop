package com.solvd.shop.exceptions;

public class InvalidOption extends RuntimeException {
    public String getMessage()
    {
        return "Invalid Option, please try again";
    }
}
