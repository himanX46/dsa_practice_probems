package training.IK.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class WordBreakCount {
    public static void main(String[] args) {
        ArrayList<String> dictionary = new ArrayList<>(Arrays.asList("kick", "start", "kickstart", "is", "awe", "some", "awesome"));
        String txt = "kickstartisawesome";
        System.out.println(word_break_count(dictionary,txt));
    }

    static Integer word_break_count(ArrayList<String> dictionary, String txt) {
        // Write your code here.
        HashSet<String> set = new HashSet<>(dictionary);
        int n = txt.length();
        int[] dp = new int[n+1];
        dp[0] = 1;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                if(dp[j]>0 && set.contains(txt.substring(j,i))){
                    dp[i] += dp[j];
                }
            }
        }
        return (int)(dp[n]%(Math.pow(10,9) + 7));
    }
}
