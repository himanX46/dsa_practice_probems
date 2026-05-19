package cortex;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstrWithoutRepeating {
    public static void main(String[] args) {
        String s = "pwwkew";
        //System.out.println(longestSubstr(s));
        System.out.println(longestUniqueSubstr(s));
    }

    static int longestSubstr(String s){
        if(s.length()==0){
            return 0;
        }
        int maxLen = 0;
        Map<Character,Integer> hMap = new HashMap<>(26);
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(hMap.containsKey(s.charAt(j)) && hMap.get(s.charAt(j))!=-1){
                    int count=0;
                    for(Map.Entry<Character,Integer> entry : hMap.entrySet()){
                        if(entry.getValue()!=-1){
                            count++;
                        }
                        entry.setValue(-1);
                    }
                    maxLen = Math.max(maxLen,count);

                    break;
                }else{
                    hMap.put(s.charAt(j),j);
                }
            }
        }
        return maxLen;
    }

    static int longestUniqueSubstr(String s){
        if(s==null || s.length()==0){
            return 0;
        }
        Set<Character> hSet = new HashSet<>();
        int maxLen=0;
        int start=0, end=0;
        for(end=0;end<s.length() && start<s.length();end++){
            while(hSet.contains(s.charAt(end))){
                hSet.remove(s.charAt(start));
                start++;
            }
            hSet.add(s.charAt(end));
            maxLen = Math.max(maxLen,end-start+1);
        }
        return maxLen;
    }
}
