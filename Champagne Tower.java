public double champagneTower(int poured, int query_row, int query_glass) {
        double[][] grid = new double[101][101];
        
        grid[0][0] = poured;
        
        for (int r = 0; r <= query_row; r++) {
            for (int c = 0; c <= r; c++) {
                double res = (grid[r][c] - 1.0) / 2.0;
                
                if (res > 0) {
                    grid[r + 1][c] += res;
                    grid[r + 1][c + 1] += res;
                }
            }
        }
        
        return Math.min(1, grid[query_row][query_glass]);
    }