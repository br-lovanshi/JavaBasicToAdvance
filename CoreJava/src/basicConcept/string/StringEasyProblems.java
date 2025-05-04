package basicConcept.string;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/**
 * String Easy Problems
 * 1. Remove duplicate characters from a string
 * 2. Count the number of vowels in a string
 * 3. Check if a string is a palindrome
 * 4. Check if two strings are anagrams of each other
 */

public class StringEasyProblems {
    public static void main(String[] args) {
        StringEasyProblems stringEasyProblems = new StringEasyProblems();
        String str = "Hello";
        System.out.println("Remove Duplicate: " + stringEasyProblems.removeDuplicate("aabbccddeeffgghhii")); // abcdefghi
        System.out.println("Count Vowel: " + countVowel("Hello World")); // 3
        System.out.println("Is Palindrome: " + isPalindrom("madam")); // true
    }
   
    public String removeDuplicate(String str){ // we can use HashSet also
        StringBuilder sb = new StringBuilder();
        for(char c : str.toCharArray()){
            if(sb.indexOf(String.valueOf(c)) == -1){
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static int countVowel(String str){
        int vowels = 0;
        for(char c: str.toLowerCase().toCharArray()){
            if("aeiou".indexOf(c) != -1){
                vowels++;
            }
        }
        return vowels;
    }

    public static boolean isPalindrom(String str){
        int i = 0, j = str.length() - 1;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static boolean isAnagram(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }

        // Convert strings to char arrays and sort them o(n long n) time complexity
        // Then compare the sorted arrays
        char[] str1Chars = str1.toCharArray();
        char[] str2Chars = str2.toCharArray();
        Arrays.sort(str1Chars);
        Arrays.sort(str2Chars);
        // return Arrays.equals(str1Chars, str2Chars);

        // Alternative approach using HashMap o(n) time complexity
        Map<Character, Integer> charCountMap = new HashMap<>();
        Map<Character, Integer> charCountMap1 = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            char c1 = str2.charAt(i);
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            charCountMap1.put(c1, charCountMap1.getOrDefault(c1, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();
            if (!entry.getValue().equals(charCountMap1.get(entry.getKey()))) return false;

        }
        return true;
    }
}
