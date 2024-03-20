
public class Exercise {
    //ce-51
    public static int countZeroes(int[] array) {
        //   TODO
        return countZeros(array, 0);
    }

    private static int countZeros(int[] array, int index) {
        if (array[0] == 0) {
            return array.length;
        }
        if (array[array.length - 1] == 1) {
            return 0;
        }
        if (array[index] == 0) {
            return array.length - index;
        }
        return countZeros(array, ++index);
    }

    //ce-52
    public static int sortedFrequency(int[] arr, int num) {
        //   TODO
        return sortedFrequency(arr, num, 0, arr.length - 1);
    }

    private static int sortedFrequency(int[] arr, int num, int start, int end) {

        int count = 0;
        if (start>end) return -1;
        int middle = (start + end) / 2;
        if (arr[middle] == num) count++;
        for (int i = start; i < middle; i++) {
            if (arr[i] == num)
                count++;
        }
        for (int i = middle + 1; i < end; i++) {
            if (arr[i] == num)
                count++;
        }
        if (arr[middle]>num) return count+sortedFrequency(arr,num,start,middle-1);
        if (arr[middle]<num) return count+sortedFrequency(arr,num,middle+1,end);
        return count;
    }
    public static int findRotatedIndex(int[] arr, int num) {

        if (arr.length==0) return -1;
        int middle = (arr.length-1)/2;
        if (arr[middle]<num || arr[middle]>num){
            while (middle+1<=arr.length-1 &&  arr[middle+1]>=arr[middle])
                middle++;
        }
        if (arr[middle]==num) return middle;
        if ((num>=arr[0] && num<=arr[middle])) return binarySearch(arr,num,0,middle);
        else return binarySearch(arr,num,middle+1,arr.length-1);
    }
    public static int binarySearch(int[] arr, int num,int start,int end) {
        if (start>end) return -1;
        int middle = (start+end)/2;
        if (arr[middle]==num) return middle;
        if (num<arr[middle]) return binarySearch(arr, num, start, middle-1);
        if (num>arr[middle]) return binarySearch(arr, num, middle+1, end);
        return -1;
    }
}
