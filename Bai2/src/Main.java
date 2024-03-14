import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<String> wordBreak(String s, List<String> wordDict) {
        List<String> result = new ArrayList<>();
        backtrack(s, wordDict, result, "", 0);
        return result;
    }

    private static void backtrack(String s, List<String> wordDict, List<String> result, String current, int index) {
        if (index == s.length()) {
            result.add(current.trim());
            return;
        }

        for (int i = index; i < s.length(); i++) {
            String word = s.substring(index, i + 1);
            if (wordDict.contains(word)) {
                backtrack(s, wordDict, result, current + word + " ", i + 1);
            }
        }
    }

    public static void main(String[] args) {
        String s = "catsanddog";
        List<String> wordDict = List.of("cat", "cats", "and", "sand", "dog");
        List<String> result = wordBreak(s, wordDict);
        for (String sentence : result) {
            System.out.println(sentence);
        }
    }
}
