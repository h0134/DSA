class Solution {
    public boolean isValid(String s) {
        Stack<Character> mystack = new Stack<>();
        if(s.length()==1){

        }
        for(char ch : s.toCharArray()){
        
      if(ch=='(' || ch == '{'|| ch=='['){
                mystack.add(ch);
            }
            else if(mystack.isEmpty()){
return false;
            }
            
            else if(!mystack.isEmpty()) {
               char top = mystack.peek();
               if(ch==')' && top=='('){
                mystack.pop();
                   }
                   
                else if(ch=='}' && top=='{'){
                   mystack.pop();
                  }
                 else if(ch==']' && top=='['){
                    mystack.pop();
                   }
                   else{
                    return false;
                   }
             }
 }

 if(mystack.isEmpty()){
    return true;
 }

    return false;
 

            
        }

    }
