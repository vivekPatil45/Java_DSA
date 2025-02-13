
/*
 * Given n friends each one can remain single or can be paired up with some other
 * friend each friend can be paired only onece find out the total number of ways in which
 * friends can remain single or can be paired up
 */
public class FriendsPairing {
    
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
