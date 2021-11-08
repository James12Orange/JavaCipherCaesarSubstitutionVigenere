public class Vigenere implements TranslationMatrix
{
    //initiate variable to store the shift key
    private static String shiftKey = Cipher.vigenereKey;

    @Override
    public String translate(String[] words) {
        String message = "";

        for (String word: words)
        {
            message += shiftByKey(word);
        }

        System.out.println(message);

        //return result
        return message;
    }

    /**
     *
     * @param input which is the string of text to be encrypted
     * @return an encrypted message as a string using the Vigenere cipher
     */
    public static String shiftByKey(String input) {
        StringBuilder sb = new StringBuilder();
        input.toUpperCase();

        for (int i = 0, j = 0; i < input.length(); i++)
        {
            char c = input.charAt(i);

            if (c >= 'A' && c <= 'Z')
            {
                c -= shiftKey.charAt(j) % 26;
            }
            j++;
            sb.append(c < 'A' || c > 'Z' ? c += 26 : c);
        }
        return sb.toString();
    }
}