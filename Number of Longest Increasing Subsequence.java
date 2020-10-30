class Solution {
    public int findNumberOfLIS(int[] nums) {
        if(nums.length == 0)
            return 0;
        int n = nums.length;
        int[] length = new int[n], count = new int[n];
        Arrays.fill(length, 1);
        Arrays.fill(count, 1);
        
        int lis = 1;
        for(int i = 1; i < n; i++) {
            for(int j = 0; j < i; j++) {
                if(nums[j] < nums[i]) {
                    if(length[j] + 1 > length[i]) {
                        length[i] = length[j] + 1;
                        count[i] = count[j];
                    } else if(length[j] + 1 == length[i]) {
                        count[i] += count[j];
                    }
                }
            }
            lis = Math.max(lis, length[i]);
        }
        
        int numLis = 0;
        for(int i = 0; i < n; i++)
            if(length[i] == lis)
                numLis += count[i];
        
        return numLis;
    }
}