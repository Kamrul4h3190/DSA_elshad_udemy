public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        //System.out.println(main.sumOfDigits(111));
        //System.out.println(main.powerOf(2,4));
        //System.out.println(main.GCD(48,18));
        System.out.println(main.decimalToBinary(13));
    }
    public int sumOfDigits(int n){
        if (n>=0 && n%10==0)
            return n/10;
        return n%10+sumOfDigits(n/10);
    }
    public int powerOf(int n, int p){
        if (p<0)
            return -1;
        if (p==0)
            return 1;
        return n* powerOf(n,p-1);
    }

    int GCD(int a,int b){
        if (a<0 || b<0)
            return -1;
        if (b%a==0)
            return a;
        return GCD(b%a,a);
    }
    public int decimalToBinary(int n){
        if (n==0)
            return 0;
        return n%2+10*decimalToBinary(n/2);
    }
}