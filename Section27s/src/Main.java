public class Main {
    public static void main(String[] args) {
        AllSort as  = new AllSort();
        int[] arr = {3,5,8,1,2,9,4,7,6};
        //BucketSort bs = new BucketSort(arr);
        //as.bubbleSort(arr);
        //as.selectionSort(arr);
        /*as.insertionSort(arr);
        as.printArray(arr);*/
        /*bs.bucketSort();
        bs.printArray(arr);*/
        //as.mergeSort(arr,0,arr.length-1);
        //as.printArray(arr);
        /*as.slideToRight(arr,0,arr.length-2,6);
        as.slideToLeft(arr,0,arr.length-2,6);*/
        //as.swap(arr,2,6);
        //as.quickSort(arr);
        //System.out.println(as.slideToLeft(arr,5,6,6));
        //System.out.println(as.slideToLeft(arr,0,7,6));
        QuckSort qs = new QuckSort();
        qs.printArray(arr);
        QuckSort.quickSort(arr,0,arr.length-1);
        qs.printArray(arr);
    }
}