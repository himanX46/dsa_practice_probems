package neetcode.recursion;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    public static void main(String[] args) {
        String s = "aab";
        System.out.println(partition(s));
    }
    public static List<List<String>> partition(String s) {
        List<String> partitions = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();
        getAllParts(s,partitions, ans);
        return ans;
    }
    static void getAllParts(String s, List<String> partitions, List<List<String>> ans){
        if(s.length()==0){
            ans.add(partitions);
            return;
        }
        for(int i=0;i<s.length();i++){
            String part = s.substring(0,i+1);
            if(isPalindrome(part)){
                partitions.add(part);
                getAllParts(s.substring(i+1),partitions,ans);
                partitions.remove(partitions.size()-1);
            }
        }
    }

    static boolean isPalindrome(String part){
        int left = 0, right = part.length()-1;
        while(left<right){
            if(part.charAt(left)!=part.charAt(right)){
                return false;
            }
        }
        return true;
    }
}
