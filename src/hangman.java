import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;

public class hangman {
    public static void main(String[] args) {
         int försök = 10;
         int längd;
         int dator;
         boolean solved;
         Scanner userInput = new Scanner(System.in);

        JFrame parent = new JFrame();

        String svar = JOptionPane.showInputDialog(null, "1.Spelar själv \n2.Spelar mot kompis");

         if (svar .equals("1")) {
             JOptionPane.showMessageDialog(null, "Datorn väljer nu ditt ord.");
             Scanner file = null;
             try {
                 file = new Scanner(new File("wordlist.md"));
             } catch (FileNotFoundException e) {
                 e.printStackTrace();
                 String temp = "";
                 Random slump = new Random();
                 int r = slump.nextInt(854) + 1;
                 System.out.println(slump);
             }
         }
         if (svar .equals("2")) {
             JOptionPane.showInputDialog("Välj ett ord din motståndare ska gissa.");
         }
String ord = userInput.next();
         for (int i = 1; i <= 20; i++);
         System.out.println("/n");

             }



    }

