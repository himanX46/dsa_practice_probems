package neetcode.sorting;

public class SortColor {
    public static void main(String[] args) {
        int[] arr = {1,2,0};
        sort(arr);
    }
    public static void sort(int[] arr){
        int len = arr.length;
        int start = 0;
        int mid = start;
        int end = len-1;
        for(int i=0;i<len;i++){
            if(mid<=end)
            if(arr[mid]==2){
                int tmp = arr[end];
                arr[end] = arr[mid];
                arr[mid] = tmp;
                //mid++;
                end--;
            }else if(arr[mid]==1){
                mid++;
            }else{
                int tmp = arr[start];
                arr[start] = arr[mid];
                arr[mid] = tmp;
                mid++;
                start++;
            }
        }
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+",");
        }
    }
}