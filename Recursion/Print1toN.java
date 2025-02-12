public class Print1toN {
    
    public static void printAsc(int n){
        if(n==0){
            return;
        }

        printAsc(n-1);
        System.out.println(n+" ");
    }

    public static void main(String[] args) {
        
        int n = 10;
        printAsc(n);
    }
}
