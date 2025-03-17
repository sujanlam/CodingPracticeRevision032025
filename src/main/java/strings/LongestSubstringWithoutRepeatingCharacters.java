package strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(longestSubstringWoRepChar(str));
        System.out.println(longestSubstringWoRepChar("bbbbb"));
        Map<String, Integer> mapp = new HashMap<>();
    }

    public static int longestSubstringWoRepChar(String str) {
        Set<Character> set = new HashSet<>();
        int n = str.length();
        int maxCount = 0;
        int left = 0;
        for (int right = 0; right < str.length(); right++) {
                while (set.contains(str.charAt(right))) {
                    set.remove(str.charAt(left));
                    left++;
                }
            set.add(str.charAt(right));
            maxCount = Math.max(set.size(), maxCount);
        }

        return maxCount;
    }
}
