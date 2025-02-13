
public class PrintXpowerN {
    
    //brute force
    public static int pow1(int x, int n){
        
        if(n==0){
            return 1;

        }
        return x * pow1(x,n-1);

        
    }

    // O(logn)
    public static int pow2(int x, int n){
        
        int halfPower = pow2(x, n/2);
        halfPower = halfPower * halfPower; 

        if(n%2 != 0){
            halfPower = x * halfPower;
        }
        return halfPower;
        
    }

    public static void main(String[] args) {
        
        System.out.println(pow1(2, 10));
        System.out.println(pow1(2, 5));

    }
}

