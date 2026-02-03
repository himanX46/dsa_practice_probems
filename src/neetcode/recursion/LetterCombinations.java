package neetcode.recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {
    public static void main(String[] args) {
        Map<Character,String> hmap = new HashMap<>(Map.of(
                '2',"abc",
                '3',"def",
                '4',"ghi",
                '5',"jkl",
                '6',"mno",
                '7',"pqrs",
                '8',"tuv",
                '9',"wxyz"));
        List<String> result = new ArrayList<>();
        String slate="";
        int idx = 0;
        String digits = "2";
        helper(hmap,slate,idx,digits,result);
        System.out.println(result);
    }

    static void helper(Map<Character,String> hmap, String slate, int idx, String digits, List<String> result){
        if(idx == digits.length()){
            result.add(slate);
            return;
        }
        String keys = hmap.get(digits.charAt(idx));
        for(int i=0;i<keys.length();i++){
            slate = slate+keys.charAt(i);
            helper(hmap,slate,idx+1,digits,result);
            slate = slate.substring(0,slate.length()-1);
        }
    }
}
