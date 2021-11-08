import java.io.*;
import java.util.Scanner;

/**
 * @author jmo5660
 */

public class Cipher {
    private static String inputFilePath;
    private static String outputFilePath;
    private static int cipherType;
    public static String vigenereKey;

    public static void main(String[] args) throws IOException {
        TranslationMatrix t = null;
        String fileContents = "";
        String[] message;

        askUserQuestions(); //asks the questions

        //set input
        File f = new File(inputFilePath);
        FileInputStream fis = new FileInputStream(f);
        int c;
        while ((c = fis.read()) != -1)
            fileContents += ((char)c);

        //create a string list, with words seperated by a space
        message = fileContents.split(" ");

        //get cipher type
        int cipherMethod = cipherType;

        //run if/then statement to utilize user input and run the appropriate cipher method
        if (cipherMethod == 1)
        {
            t = new Substitution();
        }
        else if (cipherMethod == 2)
        {
            t = new Caesar();
        }
        else if (cipherMethod == 3)
        {
            t = new Vigenere();
        }
        else
        {
            System.out.println("ERROR. you chose poorly.");
        }

        //call translator method
        Translator translate = new Translator(t);
        translate.translateText(message);

        //write to file
        //File o = new File(outputFilePath);
        //FileOutputStream fos = new FileOutputStream(o);
        //fos.write(translate.translateText(message));
    }

    /**
     * Asking the users questions and storing their input
     */
    public static void askUserQuestions()
    {
        Scanner t = new Scanner(System.in);
        System.out.println("What Cipher do you want to use (select number)? [1 - Substitution 2 - Caesar 3 - Vignere]");
        cipherType = t.nextInt();

        Scanner s = new Scanner(System.in);
        System.out.println("Enter Input File with full file path: ");
        inputFilePath = s.nextLine();

        Scanner o = new Scanner(System.in);
        System.out.println("Enter output File with full file path: ");
        outputFilePath = o.nextLine();

        if (cipherType == 3)
        {
            Scanner i = new Scanner(System.in);
            System.out.println("Input Vigenere Cipher Key");
            vigenereKey = i.nextLine();
        }
    }

}
//C:\Users\jmo5660\Assignment11\resources\fox.txt
//C:\Users\jmo5660\Assignment11\resources\Vigenere_execution.txt