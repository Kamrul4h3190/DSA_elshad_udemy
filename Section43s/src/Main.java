import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        /*HashMap<Integer,Integer> memo = new HashMap<>();
        System.out.println(fibMemo(6,memo));
        System.out.println(fibTab(6));*/
        //System.out.println(new NumberFactor().waysToGetNTopDown(7));
        //System.out.println(new NumberFactor().waysToGetNBottomUp(7));
        HouseRobber hr = new HouseRobber();
        int[] HouseNetWorth = {6,7,1,30,8,2,4};
        //System.out.println(hr.maxMoneyTopDown(HouseNetWorth));
        System.out.println(hr.maxMoneyBottomUp(HouseNetWorth));
        /*//int[] nums = {3,1,6,-2,8,11,9};
        int[] nums = {6,7,1,30,8,2,4};
        HouseRobber hr2 = new HouseRobber();
        System.out.println(hr2.oneLoopSecondMax(nums));*/
    }
    public static int fibMemo(int n, HashMap<Integer,Integer> memo){
        if (n==1){
            return 0;
        }if (n==2){
            return 1;
        }
        if (!memo.containsKey(n)){
            memo.put(n,fibMemo(n-1,memo)+fibMemo(n-2,memo));
        }
        return memo.get(n);
    }
    public static int fibTab(int n){
        ArrayList<Integer> tb = new ArrayList<>();
        tb.add(0);
        tb.add(1);
        for (int i = 2; i <n ; i++) {
            tb.add(tb.get(i-1)+tb.get(i-2 ));
        }
        return tb.get(n-1);
    }
}