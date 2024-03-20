import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //ce-1 calling
        /*int[] myArray = {1, 2,3,4};
        System.out.println(Arrays.toString(myArray));
        int[] middle = middle(myArray);
        System.out.println(Arrays.toString(middle));*/
        //ce-2 calling
        /*int[][] myArray2D = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("sum is : "+sumDiagonalElements(myArray2D));*/
        //ce-3 calling
        /*int[] myArray = {84, 85, 86, 87, 85, 90, 85, 83, 23, 45, 84, 1, 2, 0};
        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(findTopTwoScores(myArray)));*/
        //ce-4 caling
        /*int[] myArray = {1,2,3,4,6};
        System.out.println(Arrays.toString(myArray));
        System.out.println("Missing number : "+findMissingNumberInArray(myArray));*/
        //ce-5 calling
        /*int[] myArray = {1, 1, 2, 2, 3, 4, 5};
        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(removeDuplicates(myArray)));*/
        //ce-6 calling
        /*int[] myArray = {1, 1, 2};
        System.out.println(Arrays.toString(myArray));
        System.out.println("distinct elements : "+removeDuplicates2(myArray));*/
        //ce-7 caling
        /*int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(Arrays.toString(prices));
        System.out.println("Profit : "+maxProfit(prices));*/
        //ce-8 calling
        /*        int[] nums = {2,7,11,15};int target = 9;
        System.out.println(Arrays.toString(nums));
        System.out.println("indices : "+Arrays.toString(twoSum(nums,target)));*/
        //ce-10 calling
        /*int[]  intArray = {30,20,40,10,50};
        System.out.println(Arrays.toString(intArray));
        System.out.println("multiplicants : "+maxProduct(intArray));*/
        //ce-10 calling
        /*int[]  intArray = {1,1,2,3,4,4,5,6};
        System.out.println(Arrays.toString(intArray));
        System.out.println("isUnique : "+isUnique(intArray));*/
        //ce-12 calling
        /*int[] array1 = {1,2,3,4,5};
        int[] array2 = {5,1,2,3,4};
        System.out.println("is Permutation : "+permutation(array1,array2));*/
        //ce-13 calling
        //int matrix[][] = { {1,2,3}, {4,5,6} , {7,8,9} };
        int matrix[][] = { {1,2,3,4}, {5,6,7,8} , {9,10,11,12},{13,14,15,16} };
        System.out.println("Original matrix : ");
        for (int i = 0; i < matrix.length; i++) {for (int j = 0; j < matrix.length; j++) {System.out.print(matrix[i][j]+" " +"\t");}System.out.println();}
        System.out.println("Rotated matrix : ");
        int rotation[][] =  rotateMatrix(matrix);
        for (int i = 0; i < matrix.length; i++) {for (int j = 0; j < matrix.length; j++) {System.out.print(rotation[i][j]+" " +"\t");}System.out.println();}

    }


    //main ends












    //ce-1-my solution
    public static int[] middle(int[] array) {

        if (array.length >= 3) {
            int[] middle = new int[array.length - 2];
            for (int i = 0; i < middle.length; i++) {
                middle[i] = array[i + 1];
            }
            //System.out.println("mid len: "+middle.length);
            return middle;
        }

        return new int[0];
    }
    //ce-1-Provided solution
    /*public class Exercise {
        public static int[] middle(int[] array) {
            if (array.length <= 2) {
                return new int[0]; // Return an empty array if the input array has 2 or fewer elements
            }

            // Create a new array with a size of the input array length minus 2
            int[] middleArray = new int[array.length - 2];

            // Copy the elements from the input array, excluding the first and last elements
            int index = 1;
            while (index < array.length - 1) {
                middleArray[index - 1] = array[index];
                index++;
            }

            return middleArray;
        }
    }*/
    //ce-2-my solution
    public static int sumDiagonalElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += array[i][i];
        }
        return sum;
    }

    //ce-2-Provided solution
    /*public static int sumDiagonalElements(int[][] array) {
        int sum = 0;
        int numRows = array.length;

        for (int i = 0; i < numRows; i++) {
            sum += array[i][i];
        }

        return sum;
    }*/
    //ce-3 my solution
    public static int[] findTopTwoScores(int[] array) {
        //int[] firstSecond = new int[2];
        int first = 0;
        int second = 0;
        /*for (int i = 0; i < array.length; i++) {
            if (array[i] > first) {
                second = first;
                first = array[i];
            }
            firstSecond[0] = first;
            firstSecond[1] = second;
        }*/
        for (int curr_score : array) {
            if (curr_score > first) {
                second = first;
                first = curr_score;
            }
        }

        return new int[]{first, second};
    }

    //ce-3 provided solution
    /*public static int[] findTopTwoScores(int[] array) {
        int firstHighest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int score : array) {
            if (score > firstHighest) {
                secondHighest = firstHighest;
                firstHighest = score;
            } else if (score > secondHighest && score < firstHighest) {
                secondHighest = score;
            }
        }

        return new int[]{firstHighest, secondHighest};
    }*/
    //ce-4 my solution
    static int findMissingNumberInArray(int[] arr) {
        int n = arr[arr.length - 1];
        int inputSum = 0;
        int theoriticalSum = n * (n + 1) / 2;

        for (int num : arr) {
            inputSum += num;
        }
        return theoriticalSum - inputSum;
    }

    //ce-5 my solution
    public static int[] removeDuplicates(int[] arr) {
        int numOfDistinct = 0;
        int currNum = -1;
        for (int num : arr) {
            if (num != currNum) {
                currNum = num;
                numOfDistinct++;
            }
        }

        int[] temp = new int[arr.length+numOfDistinct];
        //int[] temp = new int[2*arr.length];
        int lastAdded = -1;
        int j=arr.length;
        for (int i = 0; i < arr.length; i++) {
            //int j=arr.length;
            if (arr[i] != lastAdded) {
                temp[j] = arr[i];
                lastAdded = temp[j];
                j++;
            }
        }j=arr.length;

        int[] distinctArray = new int[numOfDistinct];
        for (int i = 0; i <distinctArray.length ; i++) {
            distinctArray[i] = temp[j];
            j++;
        }
        return distinctArray;
    }
    //ce-5 provided solution
    /*public static int[] removeDuplicates(int[] array) {
        int n = array.length;
        int[] uniqueArray = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < n; j++) {
                if (array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueArray[index++] = array[i];
            }
        }

        return Arrays.copyOf(uniqueArray, index);
    }*/
    //ce-6 my solution
    public static int removeDuplicates2(int[] arr) {
        int numOfDistinct = 0;
        int currNum = -1;
        for (int num : arr) {
            if (num != currNum) {
                currNum = num;
                numOfDistinct++;
            }
        }
        return numOfDistinct;
    }
    //ce-7 my solution
    public static int maxProfit(int[] prices) {
        int profit = 0;
        int minPrice = Integer.MAX_VALUE;int minIndex = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
                minIndex = i;
            }
        }

        int maxPrice = Integer.MIN_VALUE;int maxIndex = Integer.MIN_VALUE;
        for (int i = minIndex; i < prices.length; i++) {
            if (prices[i] > maxPrice) {
                maxPrice = prices[i];
                maxIndex = i;
            }
        }
        profit = prices[maxIndex] - prices[minIndex];
        return profit;
    }
    //ce-7 provided solution
    /*public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }*/
    //ce-8 my solution
    public static int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        int j = -1;
        for (int i = 0; i < nums.length-1; i++) {
            j = i+1;
            if (nums[i]+nums[j] == target) {
                indices[0]=i;
                indices[1]=j;
            }
        }
        return indices;
    }
    //ce-10 my solution
    public static String maxProduct(int[] intArray) {
        int[] multiplicants = new int[2];
        int product = 0;int product2 ;
        for (int i = 0; i < intArray.length-1; i++) {

            for (int j = i+1; j <intArray.length ; j++) {
                product2 = intArray[i]*intArray[j];
                if (product2 > product) {
                    product = product2;
                    multiplicants[0] = intArray[i];
                    multiplicants[1] = intArray[j];
                }
            }

        }
        //return multiplicants;
        return multiplicants[0]+","+multiplicants[1];
    }
    //ce-11 my solution
    public static boolean isUnique(int[] intArray) {
        int numOfDistinct = 0;
        int currNum = -1;
        for (int num : intArray) {
            if (num != currNum) {
                currNum = num;
                numOfDistinct++;
            }
        }
        return (numOfDistinct==intArray.length);
    }
    //ce -12 my solution
    public static boolean permutation(int[] array1, int[] array2){
        int sum1=0,mul1=1;
        int sum2=0,mul2=1;
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            sum1+=array1[i];mul1*=array1[i];

            sum2+=array2[i];mul2*=array2[i];

        }
        return (sum1 == sum2 && mul1 == mul2);
    }
    //ce-13 my solution
    public static int[][] rotateMatrix(int[][] matrix) {
        int rotation[][] = new int[matrix.length][matrix.length];
        /*//transposed
        for (int j = matrix.length-1; j >= 0; j--) {
            for (int i = matrix.length-1; i >= 0; i--) {
                rotation[j][i] =  matrix[i][j];
            }
        }*/
        //clockwise 90 degree
        int n = rotation.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotation[i][j] = matrix[n-1-j][i];
            }
        }


        //anti clockwise 90 degree
        /*int n = rotation.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotation[i][j] = matrix[j][n-1-i];
            }
        }*/

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rotation[i][j];
            }
        }
        return matrix;
    }
    /*public static boolean rotateMatrix(int[][] matrix) {
if (matrix.length == 0 || matrix.length != matrix[0].length) {return false;}
        int rotation[][] = new int[matrix.length][matrix.length];

        //clockwise 90 degree
        int n = rotation.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotation[i][j] = matrix[n-1-j][i];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rotation[i][j];
            }
        }

        return true;
    }*/
}