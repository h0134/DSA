class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch :s.toCharArray()){
            if(ch== '(' || ch=='[' || ch =='{'){
             stack .add(ch) ;  
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char topmost = stack.peek();

                
            if(topmost=='(' &&  ch ==')'){
                stack.pop();
            }
            else if(topmost=='[' &&  ch ==']'){
stack.pop();
                }
           else if(topmost=='{' &&  ch =='}'){
stack.pop();
                }
                else{
                    return false;
                }
            
            
        }
    
    }
       if(stack.isEmpty()){
            return true;
        }
    
            return false;
    

    }

}