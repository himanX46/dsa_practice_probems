package binarySearch;

public class Practice1 {
    public static void main(String[] args) {
        int[] A = new int[]{1};
        int B = 1;
        if(A.length==1){
            if(A[0]==B){
                System.out.println(0);
            }else{
                System.out.println(1);
            }
        }
        int mid = findMid(A,B);
        System.out.println(mid);

    }
    private static int findMid(int[] A, int B){
        int min = 0;
        int max = A.length-1;
        while(min<max){
            int mid =(min+max)/2;
            if(A[mid]==B){
                return mid;
            } else if(A[mid]>B){
                max = mid-1;
            } else{
                min = mid+1;
            }
        }
        if(A[max]>B){
            return A[max];
        } else{
            return max+1;
        }
    }
}
