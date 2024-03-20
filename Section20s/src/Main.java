public class Main {
    public static void main(String[] args) {
        Exercise exercise = new Exercise();
        //System.out.println(exercise.power(2,4));
        //System.out.println(exercise.factorial(8));
        /*int[] arr = {1,2,3,4,5};
        System.out.println(exercise.productofArray(arr,5));*/
        //System.out.println(exercise.recursiveRange(10));
        //System.out.println(exercise.fib(10));
        //System.out.println(exercise.isPalindrome("foobar"));
        //System.out.println(exercise.isPalindrome("amanaplanacanalpanama"));
        //System.out.println(first("appmillerS"));
        System.out.println(capitalizeWord("i love java"));
    }
    //ce-41
    static char first(String str) {
        int startIndex=0;
        if (Character.isUpperCase(str.charAt(startIndex)))
            return str.charAt(startIndex);
        return first(str.substring(++startIndex));
    }

    //ce-42
    public static String capitalizeWord(String str){
        int spaceIndex=str.indexOf(" ");
        String capString="";
        int startIndex=0;
        String firstCapital = Character.toString(str.charAt(startIndex)).toUpperCase();
        if (spaceIndex==-1 ){
            capString = firstCapital +str.substring(++startIndex);
            return capString;
        }
        capString = firstCapital +str.substring(++startIndex,spaceIndex);
        return capString+" "+capitalizeWord(str.substring(spaceIndex+1));
    }
}