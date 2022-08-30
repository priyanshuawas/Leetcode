package Medium;

class Problem1329 {
    public int[][] diagonalSort(int[][] M) {
        int y = M.length, x = M[0].length - 1;
        int[] diag = new int[y];
        for (int i = 2 - y; i < x; i++) {
            int k = 0;
            for (int j = 0; j < y; j++)
                if (i+j >= 0 && i+j <= x)
                    diag[k++] = M[j][i+j];
            Arrays.sort(diag, 0, k);
            k = 0;
            for (int j = 0; j < y; j++)
                if (i+j >= 0 && i+j <= x)
                    M[j][i+j] = diag[k++];
        }
        return M;
    }
}