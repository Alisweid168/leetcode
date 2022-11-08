class Solution {
public:
    string makeGood(string s) {
        string s2;
        for(int i=0;i<s.size();i++){
            s2.push_back(s[i]);
            while(s2.size() && ((s[i+1]==32+s2.back()) ||(s[i+1]==s2.back()-32)) ){
                s2.pop_back();
                i++; 
            }
        }
        return s2;
    }
};
                 
       