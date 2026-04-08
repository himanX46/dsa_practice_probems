package agoda;

public class RepeatedCharacterReplcement {
    public static void main(String[] args) {
        String s = "ABCD";
        int k = 0;
        System.out.println(characterReplacement(s,k));
    }
    static int characterReplacement(String s, int k){
        if(k==0) return 1;
        int len = s.length();
        int maxLen = 0;
        for(int i=0;i<len;i++){
            int count = k;
            for(int j=i+1;j<len;j++){
                if(s.charAt(j)!=s.charAt(i)){
                    if(count==0){
                        break;
                    }
                    count--;
                }
                maxLen = Math.max(maxLen,j-i+1);
            }
        }
        return maxLen;
    }
}
