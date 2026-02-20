class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> m1=new HashMap<>();


        for(String str:strs){
            char arr[]=str.toCharArray();
            Arrays.sort(arr);
            String key=new String(arr);
            m1.putIfAbsent(key,new ArrayList<>());
            m1.get(key).add(str);
        }
        return new ArrayList<>(m1.values());
    }
}