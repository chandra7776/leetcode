import java.util.HashSet;
import java.util.Set;

class Solution {
    public int countVowelSubstrings(String word) {
        int count = 0;
        int n = word.length();
        
        for (int i = 0; i < n; i++) {
            Set<Character> vowels = new HashSet<>();
            
            for (int j = i; j < n; j++) {
                char ch = word.charAt(j);
                
                // If it's a vowel, add to set
                if (isVowel(ch)) {
                    vowels.add(ch);
                    
                    // If all 5 vowels are present, increment count
                    if (vowels.size() == 5) {
                        count++;
                    }
                } else {
                    // Non-vowel encountered, stop expanding from start index i
                    break;
                }
            }
        }
        
        return count;
    }
    
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
