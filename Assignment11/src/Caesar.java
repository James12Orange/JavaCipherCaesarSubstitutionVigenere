public class Caesar implements TranslationMatrix
{
    @Override
    public String translate(String[] words) {
        String message = "";

        for (String word: words)
        {
            message += leftShiftThree(word);
        }

        System.out.println(message);

        //return result
        return message;
    }

    /**
     *
     * @param input which is the string of text to be encrypted
     * @return an encrypted message as a string
     */
    public static String leftShiftThree(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'a' && c <= 'z')
            {
                c -= 3 % 26;
            }
            else if (c >= 'A' && c <= 'Z')
            {
                c -= 3 % 26;
            }

            sb.append(c < 'A' || c > 'Z' ? c += 26 : c);
        }
        return sb.toString();
    }
}
