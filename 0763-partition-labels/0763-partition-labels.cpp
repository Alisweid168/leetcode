class Solution {
public:
    vector<int> partitionLabels(string s) {
        vector<int> v(26),v2;
        for(int i=0;i<s.size();i++)
            v[s[i]-'a']=i;
        int k=0,anchor=0;
        for(int i=0;i<s.size();i++){
            k=max(k,v[s[i]-'a']);
            if(i==k){
                v2.push_back(i-anchor+1);
                anchor=i+1;
            }
        }
        return v2;
    }
};