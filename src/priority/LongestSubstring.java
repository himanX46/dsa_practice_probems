package priority;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLSubstr(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        int maxCount = Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            Set<Character> hset = new HashSet<>();
            for(int j=i;j<s.length();j++){
                System.out.println("i:: "+s.charAt(i)+", j:: "+s.charAt(j));
                if(hset.contains(s.charAt(j))){
                    break;
                }
                hset.add(s.charAt(j));
            }
            maxCount = Math.max(maxCount,hset.size());
            System.out.println("count:: "+hset.size()+", maxCount:: "+maxCount);
        }
        return maxCount;
    }

    public static int lengthOfLSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        int left = 0;
        int maxLength = Integer.MIN_VALUE;
        for(int right=0;right<s.length();right++){
            while(hs.contains(s.charAt(right))){
                hs.remove(s.charAt(left));
                left++;
            }
            hs.add(s.charAt(right));
            maxLength = Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }

    public static int lengthOfLSubstr(String s) {
        HashMap<Character,Integer> window = new HashMap<>();
        int left = 0;
        int maxLength = Integer.MIN_VALUE;
        for(int right=0;right<s.length();right++){
            char c = s.charAt(right);
            if(window.containsKey(c) && window.get(c)<=right){
                left = window.get(c)+1;
            }
            window.put(c,right);
            maxLength = Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }
}
