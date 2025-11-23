class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        //Freq array for 26 lowercase letters
        int[] freq = new int[26];

        //Count characters in s
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        //Substract counts using t
        for (char c : t.toCharArray()) {
            freq[c - 'a']--;
        }

        for (int val : freq) {
            if (val != 0) {
                return false;
            }
        }

        return true;
    }
}