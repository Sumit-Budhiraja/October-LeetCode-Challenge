class Solution {
    public int findPairs(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
		int count = 0;
		
		HashSet<Integer> duplicateset = new HashSet<>();
		
		
		for (int n : nums) {
			if (set.contains(n)) {
				if(k==0 && !duplicateset.contains(n)) {
					count++;
					duplicateset.add(n);
				}
			}else {
				//check diff of that number exist to find pair. 
				// It will not count (a,b) and (b,a) as 1 set of number is not added to set yet.
				if(k!=0 && set.contains(n-k)) {
					count++;
				}
				if(k!=0 && set.contains(n+k)) {
					count++;
				}
				set.add(n);
			}
		}
		
		return count;
    }
}v