class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mymap = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        
        for(String word:strs){
        char [] charArray = word.toCharArray();
        Arrays.sort(charArray);
        String str = new String(charArray);


            if(mymap.containsKey(str)){
                mymap.get(str).add(word);

                }
            else{
                List<String> resultt = new ArrayList<>();
                resultt.add(word);
                mymap.put(str, resultt );
            }
        }

        for(Map.Entry<String,List<String>> entry: mymap.entrySet()){
            List<String> values = entry.getValue();
            result.add(values);
        }
        return result;

     }

}