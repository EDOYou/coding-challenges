package leetcode;

import java.util.Map;
import java.util.HashMap;

class RomanToInt {
    private static final Map<Character, Integer> ROMAN_TO_INT_MAP = new HashMap<>();

    static {
        ROMAN_TO_INT_MAP.put('I', 1);
        ROMAN_TO_INT_MAP.put('V', 5);
        ROMAN_TO_INT_MAP.put('X', 10);
        ROMAN_TO_INT_MAP.put('L', 50);
        ROMAN_TO_INT_MAP.put('C', 100);
        ROMAN_TO_INT_MAP.put('D', 500);
        ROMAN_TO_INT_MAP.put('M', 1000);
    }

    public int romanToInt(String s) {
        int strSize = s.length();
        int result = 0;
        int i = 0;
        int prev = ROMAN_TO_INT_MAP.get(s.charAt(0));
        while (i != strSize) {
            int current = ROMAN_TO_INT_MAP.get(s.charAt(i));
            if (prev < current) {
                int diff = current - 2 * prev;
                result += diff;
            } else {
                result += current;
            }
            prev = current;
            i++;
        }
        return result;
    }
}