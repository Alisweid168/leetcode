class Solution {
    public boolean isIsomorphic(String s, String t) {
    HashMap<String, String> hs = new HashMap<String,String>();
        
        if(s.length() != t.length())
            return false;
        else
        {
            for(int i = 0; i<s.length(); i++)
            {  
                if(hs.containsKey(s.charAt(i)+""))
                {   String a = hs.get(s.charAt(i)+"");
                    if(!a.equals(t.charAt(i)+""))
                        return false;
                }
                else if(hs.containsValue(t.charAt(i)+""))
                { String a  = hs.get(s.charAt(i)+"");
                 if(a == null)
                     return false;
                 else if (!a.equals(t.charAt(i)+""))
                  return false;
                    
                    
                }
                else
                hs.put(s.charAt(i)+"", t.charAt(i)+"");
                
            }
        }
    
    return true;
    }
}