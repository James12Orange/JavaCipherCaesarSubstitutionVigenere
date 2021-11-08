public class Substitution implements  TranslationMatrix {
    /**
     * @param words
     * @return string of new message that is translated using the substitution method
     */
    @Override
    public String translate(String[] words) {
        String message = "";

        for (String word : words) {
            message += rot13(word) ;
        }

        //print out to console result
        System.out.println(message);

        //return result
        return message;
    }

    /**
     *
     * @param input -- the input will be the string of words
     * @return the encrypted message as a string
     */
    public static String rot13(String input)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++)
        {
            char c = input.charAt(i);
            if(c >= 'a' && c <= 'm')
            {
              c += 13;
            }
            else if (c >= 'A' && c <= 'M')
            {
                c += 13;
            }
            else if (c >= 'n' && c <= 'z')
            {
                c -= 13;
            }
            else if (c >= 'N' && c <= 'Z')
            {
                c -= 13;
            }
            sb.append(c);
        }
        return sb.toString();
    }
}