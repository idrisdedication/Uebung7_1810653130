package Aufgabe4;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aufgabe4
{
    public static void main(String[] args){

        try {

            String email = JOptionPane.showInputDialog("Bitte geben Sie eine E-Mail Adresse ein!");

            checkEmail(email);

            JOptionPane.showMessageDialog(null, "Ihre E-Mail Adresse lautet: " + email);

        } catch(WrongEmailFormatException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Fehler!", JOptionPane.ERROR_MESSAGE);
        }
    }
    public static void checkEmail(String email) throws WrongEmailFormatException {

        Pattern pattern = Pattern.compile("[\\w|-]+@\\w[\\w|-]*\\.[a-z]{2,3}$");
        Matcher m = pattern.matcher(email);

        if (!m.find()){
            throw new WrongEmailFormatException();
        }
    }
}