import java.io.*;

public class Translator implements Serializable
{
    private TranslationMatrix translationType;

    //Constructor that takes in an object of type TranslationMatrix
    public Translator (TranslationMatrix m)
    {
        this.translationType = m; //will take an object of the correct cipher based on user input
    }

    //Method to do the actual translation
    public void translateText(String[] text)
    {
        translationType.translate(text); //calling the cipher's translate method
    }

}
