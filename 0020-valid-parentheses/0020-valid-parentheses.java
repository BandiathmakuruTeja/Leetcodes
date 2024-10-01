class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0){
        return false;
        }
        Stack<Character> obj = new Stack<Character>();
        for(char i: s.toCharArray()){
            if(i=='(' || i=='{'|| i=='['){
                obj.push(i);
            }
            else if(i==')'  && !obj.isEmpty() && obj.peek()=='(') {
                obj.pop();
            }
            else if(i=='}'  && !obj.isEmpty() && obj.peek()=='{') {
                obj.pop();
            }
            else if(i==']'  && !obj.isEmpty() && obj.peek()=='[') {
                obj.pop();
            }
            else{
                return false;
            }
        }
        return obj.isEmpty();
        
        
    }

}