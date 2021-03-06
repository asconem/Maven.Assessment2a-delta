package rocks.zipcode.assessment2.fundamentals;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2) {

        return string1 + string2;
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) {
        String reversed = "";
        for (int i = string1.length() - 1; i >= 0; i--) {
            reversed += string1.charAt(i);
        }
        return reversed;
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        String reverse = reverse(string1) + reverse(string2);
        return reverse;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {
        String str = "";
        boolean check = true;
        char[] charArray = charactersToRemove.toCharArray();
        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < charArray.length; j++) {
                if (string.charAt(i) == charArray[j]) {
                    check = false;
                }
            }
            if (check == true) {
                str += string.charAt(i);
            } else {
                check = true;
            }
        }
        return str;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {
        return reverse(removeCharacters(string, charactersToRemove));
    }
}
