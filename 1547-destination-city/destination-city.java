class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String> source = new HashSet<>();
        HashSet<String> destination= new HashSet<>();
        for(List<String> val : paths){
            source.add(val.get(0));
            destination.add(val.get(1));
        }
        for(String entr: destination){
            if(!source.contains(entr)){
                return entr;
            }
          
        }
        return "";
         
    }
}