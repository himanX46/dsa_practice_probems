package agoda;

public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int h = 8;
        System.out.println(findMinTime(piles,h));
    }
    static int findMinTime(int[] piles, int h){
        int maxTime = 0;
        int minTime = 1;
        for(int i=0;i<piles.length;i++){
            maxTime = Math.max(maxTime,piles[i]);
        }
        while(minTime<maxTime){
            int mid = minTime+(maxTime-minTime)/2;
            long totalHours = 0;
            for(int pile : piles){
                totalHours += Math.ceil(pile/mid);
            }
            if(totalHours < h){
                maxTime = mid;
            }else{
                minTime = mid+1;
            }
        }
        return minTime;
    }
}
