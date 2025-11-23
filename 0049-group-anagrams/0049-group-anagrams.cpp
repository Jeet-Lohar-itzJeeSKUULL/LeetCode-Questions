class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<string, vector<string>> mp;

        //Loop through each word
        for (string s : strs) {
            string sorted_s = s;
            sort(sorted_s.begin(), sorted_s.end()); //sort characters

            mp[sorted_s].push_back(s); //group by sorted key
        }

        //Extract all grouped anagrams
        vector<vector<string>> result;
        for (auto& entry : mp) {
            result.push_back(entry.second);
        }

        return result;
    }
};