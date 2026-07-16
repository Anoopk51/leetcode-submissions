class Solution {
    public long gcdSum(int[] nums) {
        
        int[] prefixGcd = new int[nums.length];
        int currentMax = nums[0];
        for(int i = 0 ;i<nums.length;i++){
            if(currentMax<nums[i]){
                currentMax=nums[i];
            }
            int mx = currentMax;
            int a = nums[i];
            while(a!=0){
                int temp = a;
                a = mx % a;
                mx = temp;
            }
            prefixGcd[i] = mx;
        }

        Arrays.sort(prefixGcd);
        int low = 0;
        int high = prefixGcd.length - 1;
        long sum =0;
        while(low < high){
             while(prefixGcd[low]!=0){
                int temp = prefixGcd[low];
                prefixGcd[low] = prefixGcd[high] % prefixGcd[low];
                prefixGcd[high] = temp;
            }
            sum += prefixGcd[high];
            low++;
            high--;
        }
        return sum;
    }
}