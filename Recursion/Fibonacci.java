package Recursion;

public class Fibonacci {
    public static int fibo(int n)
    {
        if(n<=1){
            return n;
        }
        
        return fibo(n-1)+fibo(n-2);

    }
    public static void main(String[] args) {
        int n=25;
        int x=fibo(n);
        System.out.println(x);
    }
}
