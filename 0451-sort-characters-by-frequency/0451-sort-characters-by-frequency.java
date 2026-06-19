import java.util.*;

class Solution {
    public String frequencySort(String s) {

        Map<Character, Integer> map = new HashMap<>();

        // Count frequencies
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Convert map entries to a list
        List<Map.Entry<Character, Integer>> list =
                new ArrayList<>(map.entrySet());

        // Sort by frequency descending
        list.sort((a, b) -> b.getValue() - a.getValue());

        // Build answer
        StringBuilder sb = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : list) {
            char ch = entry.getKey();
            int count = entry.getValue();

            for (int i = 0; i < count; i++) {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}