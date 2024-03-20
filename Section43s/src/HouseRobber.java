import java.util.HashMap;

public class HouseRobber {
    private int maxMoneyTopDownRecursive(int[] HouseNetWorth, int currentIndex, HashMap<Integer, Integer> profitMap) {
        if (currentIndex >= HouseNetWorth.length) {
            profitMap.put(currentIndex, 0);
        }
        if (profitMap.get(currentIndex) == null) {
            int stealCurrentHouse = HouseNetWorth[currentIndex] + maxMoneyTopDownRecursive(HouseNetWorth, currentIndex + 2, profitMap);
            int skipCurrentHouse = maxMoneyTopDownRecursive(HouseNetWorth, currentIndex + 1, profitMap);
            profitMap.put(currentIndex, Math.max(stealCurrentHouse, skipCurrentHouse));
        }
        return profitMap.get(currentIndex);
    }

    public int maxMoneyTopDown(int[] HouseNetWorth) {
        HashMap<Integer, Integer> profitMap = new HashMap<>();
        return maxMoneyTopDownRecursive(HouseNetWorth, 0, profitMap);
    }

    private int maxMoneyBottomUp(int index, int[] wealth, int[] profits) {

        for (int i = wealth.length - 1; i >= 0; i--) {
            int stealCurrentHouse = wealth[i] + profits[i + 2];
            int skipCurrentHouse = profits[i + 1];
            profits[i] = Math.max(stealCurrentHouse, skipCurrentHouse);
        }

        return profits[0];
    }

    public int maxMoneyBottomUp(int[] wealth) {
        int[] profits = new int[wealth.length + 2];
        return maxMoneyBottomUp(profits.length - 1, wealth, profits);
    }
    /*public int oneLoopSecondMax(int[] array){
        int max1 = array[0];
        int max2 = array[1];
        for (int i = 1; i < array.length-1; i++) {
            if (array[i]>max1){
                max1 = array[i];
            }
            if (array[i+1]<max2){
                max2 = max1;
                //max1 = array[i+1];
            } else if (array[i+1]>=max2) {
                max2 = max1;
                max1 = array[i+1];
            }
        }
        return max1;
    }*/
    public int oneLoopSecondMax(int[] array){
        int max1 = array[0];
        int max2 = array[1];
        for (int i = 1; i < array.length-1; i++) {
            if (array[i]>max1 && array[i]>max2){
                max1 = array[i];
            }
            if (array[i+1]>max2 && array[i+1] < max1) {
                max2= array[i+1];
            }
        }
        return max2;
    }
}
