class Solution {
    public int romanToInt(String s) {
        // the key observation is the order of the numbers (C will come only before M if we need to substract it)
      Map<Character, Integer> map = new HashMap<>();
        map.put('M', 1000);
        map.put('D', 500);
        map.put('C', 100);
        map.put('L', 50);
        map.put('X', 10);
        map.put('V', 5);
        map.put('I', 1);

        int sum = 0;
        int n = s.length();
        for(int i = 0; i < n; i++){
            if (i != n - 1 && map.get(s.charAt(i)) <map.get(s.charAt(i + 1))){
                sum += map.get(s.charAt(i + 1)) -map.get(s.charAt(i));
                i++;
            }
            else{
                sum += map.get(s.charAt(i));
            }
        }
        
    return sum;
    }
    
}