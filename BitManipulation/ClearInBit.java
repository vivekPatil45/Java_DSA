public class ClearInBit {
    
    public static int clearInBit(int n,int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static void main(String[] args) {
        
        System.out.println(clearInBit(10, 1));
    }
}
