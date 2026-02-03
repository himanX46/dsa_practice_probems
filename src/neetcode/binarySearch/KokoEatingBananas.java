package neetcode.binarySearch;


public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int h = 8;
        int min = 1;
        int max = findMax(piles);
        System.out.println(findBinary(piles,min,max,h));
    }

    static int findBinary(int[] piles, int min, int max, int h){
        while(min<max){
            int mid = (min+max)/2;
            if(isValidRequiredTime(piles,mid,h)){
                max = mid;
            }else{
                min = mid+1;
            }
        }
        return min;
    }

    static boolean isValidRequiredTime(int[] piles, int mid, int h){
        int size = piles.length;
        int hoursPassed = 0;
        for(int i=0;i<size;i++){
            hoursPassed += piles[i]/mid;
            if(piles[i]%mid!=0){
                hoursPassed++;
            }
        }
        return hoursPassed <= h;
    }
    static int findMax(int[] piles){
        int size = piles.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            max = Math.max(piles[i],max);
        }
        return max;
    }
}
