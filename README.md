# JavaCipherCaesarSubstitutionVigenere
An encryption cipher using OOP 
**Objectives

By completing this assignment students should be able to:

    Write programs using arrays
    Write programs using String methods

 

Background
The art of encrypting text so your message cannot be read by someone else has lived for centuries.  In this homework, you will use your knowledge of arrays, ArrayList, and the String class to implement some basic cyphers.  The three cyphers you will implement are:

    A Caesar Cipher with a left shift of 3.
    A Substitution Cipher using the setup available in the notes.
    The Vigenere Cipher

 

Assignment
In this assignment, you will need to create a program that starts by getting the type of cipher from the command line.  You will then based off of that read in text from the user one line at a time.  When the user enters “quit” as the line of text then you must translate and output the text to the screen.

 

Resources
To complete this assignment, the following textfile can be used but it is recommended that you further test your program.

    fox.txt Download fox.txt  

 

Implementation
To begin, in the video above I have given you an interface called "TranslationMatrix".  This interface has a single method called Translate which takes in an array of String objects.  Each string object should be a single word.  Using this interface you will need to make a class to handle each of the three cipher’s listed above.  If you need some resources to help you get started on this assignment then I would recommend you use the links in the Notes section as a starting point.

Once you have the three classes set up using the interface, you will need to create a class called Translator with the following methods:
public Translator( TranslationMatrix m): A constructor that takes in an object of type TranslationMatrix.

public String translateText(String text): This method will do the actual translation.  The text will need to be broken up into individual words.  To help with this, you should take a look at the split() method in the String class.  Once you have the text broken up into single words in an ArrayList, you should send the array list to be translated by a class that acts as a TranslationMatrix.  Finally, you should return the translated text as a string.

The last class you create will be Cipher.java which will serve as your main.  This class should ask the user which cipher they want and once a cipher is selected instruct them to enter the file path to the text to be translated.  The main will then call the translateText method of the Translator class and then output whatever this method returns.  The program will then ask for another file to translate and repeat the process of translating the text with the same cipher.  This loop will end when the filepath is "quit" (without the quotes).

 

Notes

    Your class for the Vigenere Cipher will need to ask for the key as keyboard input.
    For information on the Caesar Cipher, click here (Links to an external site.).
    To get the Substitution Cipher we are using in this assignment, click here (Links to an external site.).
    To learn about the Vigenere Cipher, click here (Links to an external site.).
**
