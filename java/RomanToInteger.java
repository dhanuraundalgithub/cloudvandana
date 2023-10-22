import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String romanNumeral = "IX"; // Replace with your Roman numeral input

        int result = romanToInt(romanNumeral);
        System.out.println("Roman numeral " + romanNumeral + " is equivalent to " + result);
    }

    public static int romanToInt(String s) {
        // Create a map to store the values of Roman numerals
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        int previousValue = 0;

        // Iterate through the Roman numeral from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int value = romanValues.get(s.charAt(i));

            // If the current value is smaller than the previous one, subtract it
            if (value < previousValue) {
                result -= value;
            } else {
                result += value;
            }

            previousValue = value;
        }

        return result;
    }
}
