package neetcode.recursion;

import java.util.ArrayList;

public class GenerateAllSubsets {
    public static void main(String[] args) {
        String s = "ab";
        ArrayList<String> result = new ArrayList<>();
        helper(s,0,"",result);
        System.out.println(result);
    }

    static void helper(String s, int i, String slate, ArrayList<String> result){
        if(i==s.length()){
            result.add(slate);
            return;
        }
        //exclude case
        helper(s,i+1,slate,result);
        slate+=s.charAt(i);
        //include case
        helper(s,i+1,slate,result);
        slate = slate.substring(0,slate.length()-1);
    }
}
