class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Set<List<Integer>> result = new HashSet<>();
        combinationSum(candidates, target, new ArrayList<>(), result);
        return new ArrayList<>(result);
    }

    private void combinationSum(int[] candidates, int target, List<Integer> list, Set<List<Integer>> result) {
        if (target < 0)
            return;
        if (target == 0) {
            Collections.sort(list);
            result.add(list);
        }

        for (int candidate : candidates) {
            List<Integer> copyList = new ArrayList<>(list);
            copyList.add(candidate);
            combinationSum(candidates, target - candidate, copyList, result);
        }
    }
}