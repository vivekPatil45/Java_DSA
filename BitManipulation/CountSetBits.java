




public class CountSetBits {
    
    public static int countSetBits(int n){
        int c =0;
        while (n>0) {
            if((n&1) != 1){
                c++;
            }
            n = n>>1;
        }
        return c;
    }
    public static void main(String[] args) {
        
        System.out.println(countSetBits(10));
    }
}

