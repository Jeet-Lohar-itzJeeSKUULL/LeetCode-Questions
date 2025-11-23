class Solution(object):
    def groupAnagrams(self, strs):
        mp = {} #key : sorted string, value: list of anagrams

        # Loop through each word
        for s in strs:
            sorted_s = ''.join(sorted(s)) # sort characters to form key

            if sorted_s not in mp:
                mp[sorted_s] = []
            
            mp[sorted_s].append(s) #add original word to its group
        
        return list(mp.values())