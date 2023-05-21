class Solution {
    public String reverseVowels(String s) {
        char arr[]=s.toCharArray();
        int l=0,r=s.length()-1;
        Set<Character> st=Set.of('A','E','O','I','U','a','e','i','o','u');
        while(l<r){
            if(st.contains(arr[l]) && st.contains(arr[r])){
                char temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
                r--;
            }
            else if(!st.contains(arr[l]) && !st.contains(arr[r])){
                l++;
                r--;
            }
            else if(!st.contains(arr[l]) && st.contains(arr[r]))
                l++;
            else r--;
        }
         return String.valueOf(arr);
    }
}