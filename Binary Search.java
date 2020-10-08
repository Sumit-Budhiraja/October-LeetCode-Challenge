class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int n=nums.length;
        int high=n-1;
        int pos=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                pos=mid;
                break;
            }
            else if(target>nums[mid])
                low=mid+1;
            else
                high=mid-1;
        }
        return pos;
            
    }
}