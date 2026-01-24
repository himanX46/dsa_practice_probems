package neetcode.sorting;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = new int[]{2,5,6};
        int n = 3;
        merge(nums1,m,nums2,n);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int start = 0, end = 0, k = 0;
        int size = nums1.length;
        int[] aux = new int[size];
        while(start<m && end<n && k<size){
            if(nums1[start]<=nums2[end]){
                aux[k]=nums1[start];
                start++;
                k++;
            }else{
                aux[k]=nums2[end];
                end++;
                k++;
            }
        }
        while(start<m){
            aux[k]=nums1[start];
            start++;
            k++;
        }
        while(end<n){
            aux[k]=nums2[end];
            end++;
            k++;
        }
        for(int i=0;i<size;i++){
            nums1[i] = aux[i];
        }
        for(int i=0;i<size;i++){
            System.out.println(nums1[i]);
        }
    }
}
