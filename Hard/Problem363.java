package Hard;

class Problem363{ 
    public int maxSumSubmatrix(int[][] matrix, int k) {
        int m = matrix.length, n = matrix[0].length;
        int res = Integer.MIN_VALUE;
        for (int r1 = 0; r1 < m; r1++) {
            int[] presum = new int[n];
            for (int r2 = r1; r2 < m; r2++) {
                TreeSet<Integer> set = new TreeSet<Integer>();
                set.add(0);
                int val = 0;
                for (int c = 0; c < n; c++) {
                    presum[c] += matrix[r2][c];
                    val += presum[c];
                    Integer prev = set.ceiling(val - k);
                    if (prev != null) {
                        res = Math.max(res, val - prev);
                    }
                    set.add(val);
                }
            }
        }
        return res;
    }
}