package cortex;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(findLPS(s));
    }
    static String findLPS(String s){
        String maxPalindrom = "";
        int maxLen = 0;
        //odd
        for(int i=0;i<s.length();i++){
            int left = i;
            int right = i;
            while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
                if(right-left+1 > maxLen){
                    maxLen = right-left+1;
                    maxPalindrom = s.substring(left,right+1);
                }
                left--;
                right++;
            }
        }

        //even
        for(int i=0;i<s.length();i++){
            int left = i;
            int right = i+1;
            while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
                if(right-left+1 > maxLen){
                    maxLen = right-left+1;
                    maxPalindrom = s.substring(left,right+1);
                }
                left--;
                right++;
            }
        }
        return maxPalindrom;
    }
}
