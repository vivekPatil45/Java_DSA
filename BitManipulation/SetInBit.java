

public class SetInBit {
    
    public static int setInBit(int n,int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }
    public static void main(String[] args) {
        
        System.out.println(setInBit(10, 2));
    }
}
