import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
    int[] arr;

    public BucketSort(int[] arr) {
        this.arr = arr;
    }
    void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    public void printBucket(ArrayList<Integer>[] buckets){
        for (int i = 0; i < buckets.length; i++) {
            System.out.println("\nBucket#"+i+":");
            for (int j = 0; j < buckets[i].size(); j++) {
                System.out.print(buckets[i].get(j)+" ");
            }
        }
    }
    public void bucketSort(){
        int numberOfBuckets = (int)Math.ceil(Math.sqrt(arr.length));
        int maxValue = Integer.MIN_VALUE;
        for (int value :
                arr) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        ArrayList<Integer>[] buckets  = new ArrayList[numberOfBuckets];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }
        for (int value :
                arr) {
            int bucketNumber = (int) Math.ceil(((float) value * numberOfBuckets) / (float) maxValue);
            buckets[bucketNumber-1].add(value);
        }
        for (ArrayList<Integer> bucket :
                buckets) {
            Collections.sort(bucket);
        }
        int index = 0;
        for (ArrayList<Integer> bucket:
        buckets){
            for (int value: bucket){
                arr[index] = value;
                index++;
            }
        }
    }
}
