class Solution {

public String leastEqualsPrefix(String s1 ,String s2){
    String app ="";
    int s1Length = s1.length();
    int s2Length = s2.length();
    int idx =0;

   while(idx<s1Length && idx<s2Length  ){
        if(s1.charAt(idx)!=s2.charAt(idx)){
            break;
        }
        else{
            app=app+s1.charAt(idx);
        }
        idx++;
    }
    return app;

}

    public String longestCommonPrefix(String[] strs) {
        String answer = strs[0];
        for(int i=1; i <strs.length;i++){
         answer =  leastEqualsPrefix(answer,strs[i]);
        }
     
      return answer;
    }
}