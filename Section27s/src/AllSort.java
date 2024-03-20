public class AllSort {
    void bubbleSort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    void selectionSort(int[] a){
        for (int j= 0; j<a.length; j++){
            int minIndex = j;
            for (int i = j+1; i < a.length; i++) {
                if (a[i]<a[minIndex]){
                    minIndex = i;
                }
            }
            if (minIndex!=j){
                int temp = a[j];
                a[j] = a[minIndex];
                a[minIndex] = temp;
            }
        }
    }
    void insertionSort(int[] arr){
        for (int i = 1; i <arr.length ; i++) {
            int temp = arr[i], j=i;
            while (j>0 && arr[j-1]>temp){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
    }
    void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    void merge(int[] A,int left,int middle,int right){
        int[] leftTmpArray = new int[middle-left+2];
        int[] rightTmpArray  = new int[right-middle+1];
        for (int i = 0; i < middle - left; i++) {
            leftTmpArray[i] = A[left+i];
        }
        for (int i = 0; i < right - middle; i++) {
            rightTmpArray[i] = A[middle+i];
        }
        leftTmpArray[middle-left+1] = Integer.MAX_VALUE;
        rightTmpArray[right-middle] = Integer.MAX_VALUE;
        
        int i=0;int j=0;
        for (int k = left; k <= right; k++) {
            if (leftTmpArray[i]<rightTmpArray[j]){
                A[k] = leftTmpArray[i];
                i++;
            }else {
                A[k] = rightTmpArray[j];
                j++;
            }
        }
    }
    void mergeSort(int[] Array,int left,int right){
        if (right>left){
            int m = (left+right)/2;
            mergeSort(Array,left,m);
            mergeSort(Array,m+1,right);
            merge(Array,left,m,right);
        }
    }
    public int slideToRight(int[] arr,int from,int to,int  pivot){
        for (int i = from; i <=to ;i++) {
            if (arr[i] >= pivot){
                System.out.println("left marker now at : "+i);
                return i;
            }
        }
        return -1;
    }
    /*public int slideToLeft(int[] arr,int left,int right,int  pivot){
        int i;
        for ( i = right; i > left; i--) {
            if (arr[i]<pivot){
                break;
            }
        }
        return i;
    }*/
    public int slideToLeft(int[] arr,int left,int right,int  pivot){
        int i=right;
        while (i!=left){
            if (arr[i]<pivot){
                break;
            }
            i--;
        }
        System.out.println("right marker now at : "+i);
        return i;
    }
    public void swap(int[] arr,int marker1,int marker2){
        int temp = arr[marker1];
        arr[marker1] = arr[marker2];
        arr[marker2] = temp;
    }
    public void quickSort(int[] arr){
        int pivotIndex = arr.length-1;
        int pivotValue = arr[pivotIndex];
        int left = 0;
        int right = arr.length-2;

        left = slideToRight(arr,left,right,pivotValue);
        right = slideToLeft(arr,left,right,pivotValue);

        swap(arr,left,right);

        left = slideToRight(arr,left,pivotIndex,pivotValue);
        right = slideToLeft(arr,left,right,pivotValue);

        if (left==right) {
            swap(arr,left,pivotIndex);

        }
    }
}
