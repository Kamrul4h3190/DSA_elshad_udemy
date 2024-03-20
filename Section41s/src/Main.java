public class Main {
    public static void main(String[] args) {
        /*NumberFactor nf = new NumberFactor();
        System.out.println(nf.waysToGetN(4));
        System.out.println(nf.waysToGetN(5));
        System.out.println(nf.waysToGetN(6));*/
        HouseRobber hr = new HouseRobber();
        int[] HouseNetWorth = {6,7,1,30,8,2,4};
        System.out.println(hr.maxMoney(HouseNetWorth));
        /*ConvertOneStringToAnother cv = new ConvertOneStringToAnother();
        System.out.println(cv.findMinOperations("table","tbres"));*/
        /*ZeroOneKnapsack zok  = new ZeroOneKnapsack();
        int[] profits = {31,26,17,72};
        int[] weights = {3,1,2,5};
        int maxProfit = zok.knapSack(profits,weights,7);
        System.out.println(maxProfit);*/
        /*int[][] array = {  {4,7,8,6,4},
                           {6,7,3,9,2},
                           {3,8,1,2,4},
                           {7,1,7,3,7},
                           {2,9,8,9,3},
                        };
        MinCostToReachLastCell minCost = new MinCostToReachLastCell();
        System.out.println(minCost.findMinCost(array,array.length-1,array[0].length-1));*/
    }
}