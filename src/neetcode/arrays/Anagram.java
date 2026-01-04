package neetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
        String s = "ggii";
        String t = "eekk";
        System.out.println(isAnagram(s,t));
    }
    public static boolean isAnagram(String s, String t) {
        /*
        Map<Character,Integer> hmap = new HashMap<>();
        Map<Character,Integer> hmapt = new HashMap<>();
        int lens = s.length();
        int lent = t.length();
        if(lens!=lent){
            return false;
        }
        for(int i=0;i<lens;i++){
            if(hmap.containsKey(s.charAt(i))){
                hmap.put(s.charAt(i),hmap.get(s.charAt(i))+1);
            }else{
                hmap.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<lent;i++){
            if(hmapt.containsKey(t.charAt(i))){
                hmapt.put(t.charAt(i),hmapt.get(t.charAt(i))+1);
            }else{
                hmapt.put(t.charAt(i),1);
            }
        }
        for(int i=0;i<lent;i++){
            if(!hmap.containsKey(t.charAt(i))){
                return false;
            }
            if(hmap.get(t.charAt(i)) != hmapt.get(t.charAt(i))){
                return false;
            }
        }
        return true;

         */
        if(s.length()!=t.length()){
            return false;
        }
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                return false;
            }
        }
        return true;
    }
}
