package Aufgabe4;

public class WrongEmailFormatException extends Exception
{
    public WrongEmailFormatException(){

        super("Die E-Mail Adresse hat ein falsches Format!");
    }
}