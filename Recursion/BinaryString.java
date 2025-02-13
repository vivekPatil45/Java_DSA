// print all binary string of size N without consecutive ones
public class BinaryString {
    
    public static int friendsPairing(int n){ // 2*n (floor size)
        
        if(n==1 || n==2){
            return n;
        }


        //choice single
        int fnm1 = friendsPairing(n-1);
        
        //pair 
        int fnm2 = friendsPairing(n-2);
        int pairways = (n-1) * fnm2;

        //totalways
        int totWays = fnm1 + pairways;
        return totWays;
    }

    public static void main(String[] args) {
        
        int n = 3;
        System.out.println(friendsPairing(n));

    }
}
