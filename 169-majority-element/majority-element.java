class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int half = n/2;
        
        HashMap<Integer,Integer> mymap = new HashMap<>();
        for(int i =0 ; i <nums.length;i++){
           mymap.put(nums[i],mymap.getOrDefault(nums[i],0)+1);
    }

    for(Map.Entry<Integer,Integer> entry:mymap.entrySet()){
        if(entry.getValue()>half){
                return  entry.getKey();
        }
    }

return 0;
}
}