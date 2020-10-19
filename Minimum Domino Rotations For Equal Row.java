class Solution {
    public int minDominoRotations(int[] A, int[] B) {
        int[] cntA = new int[7], cntB = new int[7], cntSame = new int[7];
        int n = A.length;
        for (int i = 0; i < n; i++) {
            int a = A[i], b = B[i];
            cntA[a] += 1;
            cntB[b] += 1;
            if (a == b) cntSame[a] += 1;
        }
        int ans = n;
        for (int v = 1; v <= 6; v++) {
            if (cntA[v] + cntB[v] - cntSame[v] == n) {
                int minSwap = Math.min(cntA[v], cntB[v]) - cntSame[v];
                ans = Math.min(ans, minSwap);
            }
        }   
        return ans == n ? -1 : ans;
    }
}