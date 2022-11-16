class Solution {
public:
    vector<int> partitionLabels(string s) {
     vector<int> v(26),v2;
        for(int i=0;i<s.length();i++){
          v[s[i]-'a']=i;
      }  
        int f=0,e=0;
      for(int j=0;j<s.length();j++){
          f=max(f,v[s[j]-'a']);
          if(f==j){
             v2.push_back(f-e+1);
             e=f+1;
        } 
      }  
        
        return v2;
    }
};