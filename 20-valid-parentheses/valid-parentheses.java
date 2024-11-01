class Solution {
    public boolean isValid(String s) {
                Stack<Character> stack = new Stack<>();
                for(int i=0; i <s.length();i++){
                    if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
                        stack.add(s.charAt(i));
                    }
                    else{

                    if(stack.isEmpty()){
                       return false;

                        }
                    char top= stack.peek();

                    if(top=='(' && s.charAt(i)!=')'){
                        return false;

                        }
                    if(top=='[' && s.charAt(i)!=']'){
                        return false;
                          }
                  
                    if(top=='{' && s.charAt(i)!='}'){
                        return false;
                          }
                          stack.pop();

                    }
                 
                }
                return stack.isEmpty()?true:false;
                
   
    }
}