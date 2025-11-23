class Solution(object):
    def isAnagram(self, s, t):
        if len(s) != len(t):
            return False
        
        freq = [0] * 26

        for c in s:
            freq[ord(c) - ord('a')] += 1
        
        for c in t:
            freq[ord(c) - ord('a')] -= 1
        
        for val in freq:
            if val != 0:
                return False
        
        return True