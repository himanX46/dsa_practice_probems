package agoda;

public class ShipPackages {
    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.println(shipWithinDays(weights,days));
    }
    public static int shipWithinDays(int[] weights, int days) {
        int maxWeight=0, totalWeight=0;
        for(int w:weights){
            maxWeight = Math.max(maxWeight,w);
            totalWeight += w;
        }
        for(int cap=maxWeight;cap<=totalWeight;cap++){
            if(canShip(weights,days,cap)){
                return cap;
            }
        }
        return totalWeight;
    }

    static boolean canShip(int[] weights,int days,int cap){
        int daysNeeded = 1;
        int currLoad = 0;
        for(int w:weights){
            if(currLoad+w > cap){
                daysNeeded++;
                currLoad=0;
            }
            currLoad += w;
        }
        return daysNeeded <= days;
    }
}
