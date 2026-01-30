package neetcode.recursion;

import java.util.ArrayList;

public class BinaryPossibilities {
    public static void main(String[] args) {
        System.out.println(find_all_possibilities("1?10"));
    }
    static ArrayList<String> find_all_possibilities(String s) {
        // Write your code here.
        String slate = "";
        int i=0;
        ArrayList<String> result = new ArrayList<>();
        helper(s,slate,i,result);
        return result;
    }

    static void helper(String s, String slate, int i, ArrayList<String> result){
        if(i == s.length()){
            result.add(slate);
            return;
        }
        if(s.charAt(i)!='?'){
            slate = slate+s.charAt(i);
            helper(s,slate,i+1,result);
            if(slate.length()==1){
                return;
            }
            slate = slate.substring(0,s.length()-1);
        }else{
            slate = slate+'0';
            helper(s,slate,i+1,result);
            slate = slate.replace("0","");
            slate = slate+'1';
            helper(s,slate,i+1,result);
            slate = slate.replace("0","");
        }
    }
}
