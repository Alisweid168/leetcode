class Solution {
public:
    string longestPalindrome(string s) {
		//initial start and end indices
        int startIndex = 0, endIndex = 0;
        
        for(int i = 0; i < s.size(); i++) {
            int min1 = i, max1 = i;
            int min2 = i, max2 = i + 1;
            
			//expand around the center passing in the min and maxes consistent with a double center and a single center separately
            int len1 = longestPalindromeRecursive(s, i, min1, max1);
            int len2 = longestPalindromeRecursive(s, i, min2, max2);
            
			//set the end and start accordingly
            if(len1 > (endIndex - startIndex)) {
                startIndex = min1;
                endIndex = max1;
            }
            
            if(len2 > (endIndex - startIndex)) {
                startIndex = min2;
                endIndex = max2;
            }
        }
        
		//construct the string and return
        return std::string(s.begin() + startIndex, s.begin() + endIndex + 1);
    }
    
    int longestPalindromeRecursive(const std::string& s, int index, int& start, int& end) {
        if(start < 0 || end >= s.size()) {
            end--;
            start++;
            return end - start;
        }
        
        if(s[start] == s[end]) {
            start--;
            end++;
            return longestPalindromeRecursive(s, index, start, end);
        }
        
        end--;
        start++;
        return end - start;
    }
};