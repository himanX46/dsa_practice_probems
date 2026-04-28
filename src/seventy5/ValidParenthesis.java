package seventy5;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s = ")))";
        System.out.println(validParenthesis(s));
    }

    static boolean validParenthesis(String s){
        if( s==null || s.isEmpty()){
            return true;
        }
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> hmap = Map.of('(',')','[',']','{','}');
        for(int i=0;i<s.length();i++){
            if(hmap.containsKey(s.charAt(i))){
                stack.push(s.charAt(i));
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                if(stack.size()>0 && hmap.get(stack.pop())!=s.charAt(i)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
