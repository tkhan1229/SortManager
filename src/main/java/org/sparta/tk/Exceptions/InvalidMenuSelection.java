package org.sparta.tk.Exceptions;

public class InvalidMenuSelection extends Exception{
    public String getInvalidMenuOptionMessage(){
        return "Value must be a positive integer and non zero value";
    }
}
