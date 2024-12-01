class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String ,List<String>> mymap = new HashMap<>();
        List<List<String>> y = new ArrayList<>();
        for(String word:strs){
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String st = new String(arr);
            if(!mymap.containsKey(st)){
                List<String> re= new ArrayList<>();
                re.add(word);
                 mymap.put(st,re);
            }
            else{
           List<String> r=  mymap.get(st);
           r.add(word);
            mymap.put(st,r);

            }

        }
 
 for(Map.Entry<String,List<String>> entry: mymap.entrySet()){
    y.add(entry.getValue());

 }
 return y;
     
    }
}