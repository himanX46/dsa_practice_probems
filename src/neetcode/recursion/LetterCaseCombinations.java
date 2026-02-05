package neetcode.recursion;

import java.util.ArrayList;
import java.util.List;

public class LetterCaseCombinations {
    public static void main(String[] args) {
        String s = "a1b2";
        System.out.println(letterCasePermutation(s));
    }
    public static List<String> letterCasePermutation(String s) {
        String slate = "";
        int idx = 0;
        List<String> result = new ArrayList<>();
        helper(s,idx,slate,result);
        return result;
    }
    public static void helper(String s, int idx, String slate, List<String> result){
        if(idx == s.length()){
            result.add(slate);
            return;
        }
        if(Character.isDigit(s.charAt(idx))){
            helper(s,idx+1,slate+s.charAt(idx),result);
        }else{
            helper(s,idx+1,slate+(s.charAt(idx)+"").toUpperCase(),result);
            helper(s,idx+1,slate+(s.charAt(idx)+"").toLowerCase(),result);
        }
    }
}
