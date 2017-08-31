package ua.pp.avmelnyk.anagramsapp;


public class DifferentLengthException extends Exception{
    public DifferentLengthException() {
    }

    public DifferentLengthException(String message) {
        super(message);
    }
}
