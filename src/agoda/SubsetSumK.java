package agoda;

import java.util.HashMap;

public class SubsetSumK {
    public static void main(String[] args) {
        int[] num = {1,1,1};
        int k = 2;
        System.out.println(findSubsetSumOptimal(num,k));
    }

    static int findSubsetSumOptimal(int[] nums, int k){
        int count = 0;
        int prefixSum = 0;
        HashMap<Integer,Integer> prefixCount = new HashMap<>();
        prefixCount.put(0,1);

        for(int num : nums){
            prefixSum += num;
            count += prefixCount.getOrDefault(prefixSum-k, 0);
            prefixCount.put(prefixSum, prefixCount.getOrDefault(prefixSum,0)+1);
        }
        return count;
    }
    static int findSubsetSum(int[] num, int k){
        int count = 0;
        for(int i=0;i<num.length;i++){
            int sum = num[i];
            if(sum==k) count++;
            for(int j=i+1;j<num.length;j++){
                sum += num[j];
                if(sum==k) count++;
            }
        }
        return count;
    }
}
