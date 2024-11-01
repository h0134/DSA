class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
          
          Map<String,List<String>> mymap = new HashMap<>();
          List<List<String>> result = new ArrayList<>();
          
          for(int i =0; i<strs.length;i++){
             String  currentWord= strs[i];
             char[] chars = strs[i].toCharArray();
             Arrays.sort(chars);
             String sortedStr = new String(chars);
            
             if(mymap.containsKey(sortedStr)){
               List v = mymap.get(sortedStr);
               v.add(currentWord);
                }
             else{
                List<String> mylist = new ArrayList<>();
                mylist.add(currentWord);
                mymap.put(sortedStr, mylist);

  }}

              for(Map.Entry<String,List<String>> entry:mymap.entrySet()){
                result.add(entry.getValue());
              }
               return result;
     }
          }