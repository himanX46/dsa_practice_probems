package agoda;

public class RepeatedCharacterReplcement {
    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        System.out.println(characterReplacement2Pointer(s,k));
    }

    static int characterReplacement2Pointer(String s, int k){
        int[] freq = new int[26];
        int left = 0, maxLength = 0;

        for(int right=0;right<s.length();right++){
            freq[s.charAt(right)-'A']++;
            while((right-left+1)-maxFeq(freq)>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            maxLength = Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }

    static int maxFeq(int[] freq){
        int max = 0;
        for(int i : freq){
            max = Math.max(max,i);
        }
        return max;
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
