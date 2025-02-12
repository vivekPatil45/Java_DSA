public class Fibonacci {
    
    //calculate nth term in fibonacci
    public static int fib(int n){
        if(n==1 || n==0){
            return n;
        }

        return fib(n-1) + fib(n-2);

    }

    public static void main(String[] args) {
        
        int n = 26;
        System.out.println(fib(n));
        
    }
}
