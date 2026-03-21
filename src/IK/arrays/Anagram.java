package IK.arrays;

public class Anagram {
    public static void main(String[] args) {
        String s = "jar";
        String t = "jam";
        System.out.println(isAnagram(s,t));
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            System.out.println(i+":: "+s.charAt(i)+", "+t.charAt(i));
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
