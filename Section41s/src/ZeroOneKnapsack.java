public class ZeroOneKnapsack {
    private int knapSack(int[] profits,int[] weights,int capacity, int currentIndex){
        if (capacity<=0 || currentIndex <0 || currentIndex >= profits.length){
            return 0;
        }
        int taken = 0;int left = 0;
        if (weights[currentIndex] <= capacity){
            taken = profits[currentIndex] + knapSack(profits,weights,capacity-weights[currentIndex],currentIndex+1);
            left = knapSack(profits,weights,capacity,currentIndex+1);
        }
        return Math.max(taken,left);
    }
    public int knapSack(int[] profits,int[] weights,int capacity){
        return this.knapSack(profits,weights,capacity,0);
    }
}
