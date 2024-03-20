public class MinCostToReachLastCell {
    public int findMinCost(int[][] cost,int row,int col){
        if (row==-1 || col ==-1){
            return Integer.MAX_VALUE;
        }
        if (row==0 && col== 0){
            return cost[0][0];
        }
        int fromLeft = findMinCost(cost,row,col-1);
        int fromUp = findMinCost(cost,row-1,col);
        int minCost = Math.min(fromUp,fromLeft);
        return minCost+cost[row][col];


    }

}
