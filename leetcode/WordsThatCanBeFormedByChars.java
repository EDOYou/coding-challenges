package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordsThatCanBeFormedByChars {
    public static int countCharacters(String[] words, String chars) {
        var charMap = chars.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toMap(Function.identity(), c -> 1, Integer::sum));

        return Arrays.stream(words)
                .filter(w -> {
                    var tempMap = new HashMap<>(charMap);
                    for (Character c : w.toCharArray()) {
                        tempMap.put(c, tempMap.getOrDefault(c, 0) - 1);
                        if (tempMap.get(c) < 0) {
                            return false;
                        }
                    }
                    return true;
                })
                .mapToInt(String::length)
                .sum();
    }

    public static void main(String[] args) {
        String[] input = {"cat","bt","hat","tree"};
        String   chars = "atach";
        String[] input2 = {"hello","world","leetcode"};
        String   chars2 = "welldonehoneyr";
        System.out.println( countCharacters(input, chars) ); // 6
        System.out.println( countCharacters(input2, chars2) ); // 10
    }
}
