package cortex;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstrWithoutRepeating {
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(longestSubstr(s));
    }

    static int longestSubstr(String s){
        if(s.length()==0){
            return 0;
        }
        int maxLen = 0;
        Map<Character,Integer> hMap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(hMap.containsKey(s.charAt(i))){
                maxLen = Math.max(maxLen,i-hMap.get(s.charAt(i)));
            }else{
                maxLen = Math.max(maxLen,i+1);
                hMap.put(s.charAt(i),i);
            }
        }
        return maxLen;
    }
}
