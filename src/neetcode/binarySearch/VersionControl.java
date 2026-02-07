package neetcode.binarySearch;

public class VersionControl {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(binarySearch(n));
    }
    static int binarySearch(int n){
        int left = 1;
        int right = n;
        int firstBad = 1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(isBadVersion(mid)){
                firstBad = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return firstBad;
    }
    static boolean isBadVersion(int version){
        if (version>=2){
            return true;
        }
        return false;
    }
}
