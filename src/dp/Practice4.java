package dp;

public class Practice4 {
    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";
        System.out.println(findLCS(s1,s2));
    }
    private static int findLCS(String s1, String s2){
        if(s1.length()==0 || s2.length()==0){
            return 0;
        }
        if(s1.charAt(s1.length()-1) == s2.charAt(s2.length()-1)){
            return 1+findLCS(s1.substring(0,s1.length()-1),s2.substring(0,s2.length()-1));
        } else{
            return Math.max(findLCS(s1.substring(0,s1.length()-1),s2),findLCS(s1,s2.substring(0,s2.length()-1)));
        }

    }
}
