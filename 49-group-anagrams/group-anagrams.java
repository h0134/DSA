class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result= new ArrayList<>();
        HashMap<String , List<String>> mymap = new HashMap<>();

for(String word: strs){
            char[] charArr= word.toCharArray();
            Arrays.sort(charArr);
            String sg= new String(charArr);
            if(!mymap.containsKey(sg)){
            List<String> re= new ArrayList<>();
            re.add(word);
            mymap.put(sg,re);
            }
            else{
                mymap.get(sg).add(word);
            }
        }
for(Map.Entry<String,List<String>> entry: mymap.entrySet()){
  List<String> arr =  entry.getValue();
  result.add(arr);

}
return result;

    }



}