class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mymap = new HashMap<>();
        for(String s : strs){
         String sortedWord= sortWord(s);
         if(!mymap.containsKey(sortedWord)){
            List<String> res=new ArrayList<>();;
            res.add(s);
            mymap.put(sortedWord,res);
          }
          else{
            List<String> val = mymap.get(sortedWord);
            val.add(s);
            mymap.put(sortedWord,val);
  }
 }

List<List<String>> result = new ArrayList<>();
for(Map.Entry<String ,List<String>> entry : mymap.entrySet() ){
List<String> res= entry.getValue();
result.add(res);
}
return result;

    }

    public String sortWord(String str){
        char[] charA=str.toCharArray();
        Arrays.sort(charA);
       String s = new String(charA);
       return s;


    }
}