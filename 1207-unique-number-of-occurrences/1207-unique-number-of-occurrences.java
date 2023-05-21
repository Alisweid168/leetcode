class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(mp.get(arr[i])!=null)
                mp.put(arr[i],mp.get(arr[i])+1);
            else    mp.put(arr[i],1);
        }
            if(hasDuplicateValues(mp)) return false;
            return true;
       
    }
     public static boolean hasDuplicateValues(Map<?, ?> map) {
        Set<Object> uniqueValues = new HashSet<>();
        for (Object value : map.values()) {
            if (!uniqueValues.add(value)) {
                return true; // Found a duplicate value
            }
        }
        return false; // No duplicate values found
    }
    }