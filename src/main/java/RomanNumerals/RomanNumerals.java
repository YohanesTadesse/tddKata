package RomanNumerals;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by tadessey on 3/16/18.
 */
public class RomanNumerals {
    final static Map<Character, Integer> romanNumbers = new HashMap<>();
    final static List<ArabicNumerals> arabicNumbers = new ArrayList<>();
    static class ArabicNumerals {
        private int number;
        private Character ch;

        ArabicNumerals(final int number, final Character ch) {
            this.number = number;
            this.ch = ch;
        }

        public void setNumber(final int number) {
            this.number = number;
        }

        public void setCh(final Character ch) {
            this.ch = ch;
        }

        public int getNumber() {
            return number;
        }

        public Character getCh() {
            return ch;
        }

    }
    static {
        romanNumbers.put('I', 1);
        romanNumbers.put('V', 5);
        romanNumbers.put('X', 10);
        romanNumbers.put('L', 50);
        arabicNumbers.addAll(Arrays.asList(new ArabicNumerals(1, 'I'),
                new ArabicNumerals(5, 'V'),
                new ArabicNumerals(10, 'X'),
                new ArabicNumerals(50, 'L')));
    }

    public static String getSumOfRomanNumbers(final String numOne, final String numTwo) throws NullPointerException {
        int sumOne = 0;
        for (final char ch : numOne.toCharArray()) {
            validate(ch);
            sumOne += romanNumbers.get(ch);
        }
        int sumTwo = 0;
        for (final char ch : numTwo.toCharArray()) {
            validate(ch);
            sumTwo += romanNumbers.get(ch);
        }
        sumOne += sumTwo;
        return addRomanNumeral(sumOne);
    }

    private static String addRomanNumeral(final int input) {
        int min = 0;
        int remainder = 0;
        String result = "";


//        for (int i = 0; i < arabicNumbers.size(); i++) {
//            final Integer key = entry.getNumber();
//            if (key == input)
//                return result + entry.getCh();
//            else if (key < input) {
//                min = key;
//                continue;
//            }
//            else if (key > input) {
//                remainder = input - min;
//                result = result + arabicNumbers.get(min) + addRomanNumeral(remainder);
//            }
//        }
        return result;
    }

    private static void validate(final char ch) {
        romanNumbers.get(ch);
    }

}
