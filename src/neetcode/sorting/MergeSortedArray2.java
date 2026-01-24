package neetcode.sorting;

public class MergeSortedArray2 {
    public static void main(String[] args) {
        int[] nums1 = new int[]{4,0,0,0,0,0};
        int[] nums2 = new int[]{1,2,3,5,6};
        int m = 1;
        int n = 5;
        merge(nums1,m,nums2,n);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        //in place
        if(m==0){
            for(int i=0;i<n;i++){
                nums1[i]=nums2[i];
            }
        }
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while(j>=0){
            if(i>=0 && nums1[i]>=nums2[j]){
                nums1[k--] = nums1[i--];
            }else{
                nums1[k--] = nums2[j--];
            }
        }
        for(int p=0;p<m+n;p++){
            System.out.println(nums1[p]);
        }
    }
}
