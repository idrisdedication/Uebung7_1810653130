import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aufgabe3
{
    public static void main(String[] args){

        try {

            String email = JOptionPane.showInputDialog("Bitte geben Sie eine E-Mail Adresse ein!");

            checkEmail(email);

            JOptionPane.showMessageDialog(null, "Ihre E-Mail Adresse lautet: " + email);

        } catch(Exception ex){

            JOptionPane.showMessageDialog(null, "Sie haben ein falsches E-Mail Format eingegeben!", "Fehler!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void checkEmail(String email) throws Exception {

        Pattern pattern = Pattern.compile("[\\w|-]+@\\w[\\w|-]*\\.[a-z]{2,3}$");
        Matcher m = pattern.matcher(email);

        if (!m.find()){
            throw new Exception();
        }
    }
}