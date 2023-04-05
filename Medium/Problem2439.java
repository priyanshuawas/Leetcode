package Medium;

class Problem2439 {
    public int minimizeArrayValue(int[] A) {
        long sums = 0, result = 0;
        for (int i = 0; i < A.length; ++i) {
            sums += A[i];
            result = Math.max(result, (sums + i) / (i + 1));
        }
        return (int)result;
    }
}