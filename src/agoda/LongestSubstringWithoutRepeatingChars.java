package agoda;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChars {
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lenOfLongestSubstrWithoutRepeatChars(s));
    }

    static int lenOfLongestSubstr(String s){
        int len = s.length();
        int maxLen = 0;
        for(int i=0;i<len;i++){
            Set<Character> hset = new HashSet<>();
            hset.add(s.charAt(i));
            for(int j=i+1;j<len;j++){
                if(hset.contains(s.charAt(j))){
                    break;
                }
                hset.add(s.charAt(j));
            }
            maxLen = Math.max(maxLen,hset.size());
        }
        return maxLen;
    }
    static int lenOfLongestSubstrWithoutRepeatChars(String s){
        Set<Character> hset = new HashSet<>();
        int left = 0;
        int maxLen = 0;
        for(int right=0;right<s.length();right++){
            while(hset.contains(s.charAt(right))){
                hset.remove(s.charAt(left));
                left++;
            }
            hset.add(s.charAt(right));
            maxLen = Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}
