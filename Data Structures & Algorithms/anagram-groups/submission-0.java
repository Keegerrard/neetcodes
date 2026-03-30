class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> result = new HashMap<>();
        for(String s : strs){
            int[] alfa = new int[26];
            for(char c : s.toCharArray()){
                alfa[c-'a']++;
            }
            String key = Arrays.toString(alfa);
            if(result.containsKey(key)){
                result.get(key).add(s);
            }
            else{
                List<String> newList = new ArrayList<>();
                newList.add(s);
                result.put(key, newList);
            }
        }
        List<List<String>> finalresult = new ArrayList<>();
        for(List<String> lis : result.values()){
            finalresult.add(lis);
        }
        return finalresult;
    }
}
