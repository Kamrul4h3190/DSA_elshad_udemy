public class Exercise {
    //ce-33
    public int power(int base, int exponent) {
        if (exponent < 0)
            return -1;
        if (exponent == 0)
            return 1;
        return base * power(base, exponent - 1);
    }

    //ce-34
    public int factorial(int num) {
        if (num == 0)
            return 1;
        return num * factorial(num - 1);
    }
    //ce-35
    public int productofArray(int A[], int N) {
        if (N == 0)
            return 1;
        return A[N - 1] * productofArray(A, N - 1);
    }
    //ce-36
    public int recursiveRange(int num) {
        if (num==0)
            return 0;
        return num+recursiveRange(num-1);
    }
    //ce-37
    public int fib(int n) {
        if (n==0 || n==1)
            return n;
        return fib(n-1)+fib(n-2);
    }
    //ce-38
    public String reverse(String str)
    {
        if(str.length()==1)
            return str;
        return str.charAt(str.length()-1)+reverse(str.substring(0,str.length()-1));
    }
    //ce-39
    public  boolean isPalindrome(String s)
    {
        String reversed = reverse(s);
        return s.equals(reversed);
    }

}