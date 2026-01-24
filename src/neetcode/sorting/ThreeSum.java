package neetcode.sorting;

public class ThreeSum {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,5,7,9};
        int target = 16;
        int len = numbers.length;
        int[] res = new int[3];
        for(int i=0;i<len;i++){
            int diff = target-numbers[i];
            int start = i+1;
            int end = len-1;
            while(start<end){
                int diff_new = diff-numbers[start];
                if(diff_new==numbers[end]){
                    res[0] = i;
                    res[1] = start;
                    res[2] = end;
                    break;
                }else if(diff_new<numbers[end]){
                    end--;
                }else{
                    start++;
                }
            }
            break;
        }
        for(int i: res){
            System.out.println(i);
        }
    }
}
