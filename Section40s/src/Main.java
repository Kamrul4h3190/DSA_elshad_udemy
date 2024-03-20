import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*ArrayList<Activity> activityList = new ArrayList<>();
        activityList.add(new Activity("A1",0,6));
        activityList.add(new Activity("A2",3,4));
        activityList.add(new Activity("A3",1,2));
        activityList.add(new Activity("A4",5,8));
        activityList.add(new Activity("A5",5,7));
        activityList.add(new Activity("A6",8,9));

        ActivitySelection.activitySelection(activityList);*/
        /*int[] coins = {1,2,5,10,20,50,100,1000};
        int amount = 2035;
        System.out.println("Coins available : "+ Arrays.toString(coins));
        System.out.println("Target amount : "+amount);
        CoinChangeProblem.coinChangeProblem(coins,amount);*/
        ArrayList<KnapsackItem> items = new ArrayList<>();
        int[] value = {100,120,60};
        int[] weight = {20,30,10};
        int capacity = 50;
        for (int i = 0; i < value.length; i++) {
            items.add(new KnapsackItem(i+1,value[i],weight[i] ));
        }
        FractionalKnapsack.knapSack(items,capacity);
    }
}