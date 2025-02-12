

public class ClearRangeIthBit {
    
    public static int clearRangeIthBit(int n,int i,int j){
        
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        // b = 2^i -1;
        // 011 = 2^2-1

        
        int bitMask = a | b;
        return n & bitMask;
    }
    public static void main(String[] args) {
        
        System.out.println(clearRangeIthBit(10, 2,4));
    }
}
