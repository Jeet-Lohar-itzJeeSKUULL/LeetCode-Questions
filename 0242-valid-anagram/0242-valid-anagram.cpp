class Solution {
public:
    bool isAnagram(string s, string t) {
        //If lengths differ, they can't be anagrams
        if(s.length() != t.length()) {
            return false;
        }

        //Frequency array for 26 lowercase letters
        int freq[26] = {0};

        //Count characters in s
        for (char c : s) {
            freq[c - 'a']++;
        }

        //Substract characters from t
        for (char c : t) {
            freq[c - 'a']--;
        }

        //Check if all counts cancel out
        for (int i = 0; i < 26; i++) {
            if(freq[i] != 0) {
                return false; //mismatch -> not an anagram
            }
        }

        return true;
    }
};