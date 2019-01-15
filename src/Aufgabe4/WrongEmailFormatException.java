package Aufgabe4;

public class WrongEmailFormatException extends Exception
{
    public WrongEmailFormatException(){

        super("Die E-Mail Adresse beeinhaltet ein falsches Format!");
    }
}