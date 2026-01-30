package neetcode.recursion;

import java.util.ArrayList;

public class PalindromicDecomposition {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(generate_palindromic_decompositions(s));
    }
    static ArrayList<String> generate_palindromic_decompositions(String s) {
        // Write your code here.
        String slate = "";
        slate = slate+s.charAt(0);
        String lastString = "";
        lastString = lastString+s.charAt(0);
        ArrayList<String> result = new ArrayList<>();
        helper(s,slate,1,lastString,result);
        return result;
    }

    static void helper(String s, String slate, int i, String lastString, ArrayList<String> result){
        if(i==s.length()){
            if(isPalindrome(lastString)){
                result.add(slate);
            }
            return;
        }
        slate = slate+s.charAt(i);
        lastString = lastString+s.charAt(i);
        helper(s,slate,i+1,lastString,result);
        slate = slate.substring(0,slate.length()-1);
        lastString = lastString.substring(0,lastString.length()-1);

        if(!isPalindrome(lastString)){
            return;
        }

        slate = slate+"|"+s.charAt(i);
        lastString = s.charAt(i)+"";
        helper(s,slate,i+1,lastString,result);
        slate = slate.substring(0,slate.length()-1);
        slate = slate.substring(0,slate.length()-1);
    }

    static boolean isPalindrome(String s){
        int left = 0;
        int right = s.length()-1;
        if(s.length()==1){
            return true;
        }
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
