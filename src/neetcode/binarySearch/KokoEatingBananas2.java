package neetcode.binarySearch;

import java.util.Arrays;

public class KokoEatingBananas2 {
    public static void main(String[] args) {
        int min = 1;
        int[] piles = {3,6,7,11};
        int h = 8;
        int max = Arrays.stream(piles).max().getAsInt();
        int minVal =  max;
        while(min<=max){
            int mid = min+(max-min)/2;
            if(canBeEaten(piles,h,mid)){
                minVal = mid;
                max = mid-1;
            }else{
                min = mid+1;
            }
        }
        System.out.println(minVal);
    }
    public static boolean canBeEaten(int[] piles, int h, int k){
        long noOfHours = 0;
        for(int pile: piles){
            noOfHours += pile/k;
            if(pile%k!=0){
                noOfHours += 1;
            }
        }
        return noOfHours<=h;
    }
}
