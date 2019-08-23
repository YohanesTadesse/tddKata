public class StringAddition {

    String calculateStrings(final String numbers) {
        if (numbers == null || numbers.length() < 2) return numbers;

        final String[] splitString = splitString(numbers);
        final int a = Integer.parseInt(splitString[0]);
        final int b = Integer.parseInt(splitString[1]);
        return Integer.toString(a+b);

    }

    String[] splitString(String number) {
        return number.split("\\+");
    }

}
