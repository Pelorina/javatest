import java.util.*;

public class question3 {
    public static void main(String[] args) {
        String[] words = {"actors", "altered", "costar", "related"};
        List<List<String>> anagramGroups = groupAnagrams(words);

        for (List<String> group : anagramGroups) {
            System.out.println(group);
        }
    }

    public static List<List<String>> groupAnagrams(String[] words) {
        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String word : words) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            anagramMap.putIfAbsent(sortedWord, new ArrayList<>());
            anagramMap.get(sortedWord).add(word);
        }

        return new ArrayList<>(anagramMap.values());
    }
}
