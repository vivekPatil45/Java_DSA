// print all binary string of size N without consecutive ones
public class BinaryString {
    
    public static void printBinaryString(int n, int lastPlace, String str ){
        
        if (n==0) {
            System.out.println(str);
            return;
        }


        // if(lastPlace == 0){
        //     // sit 0 on chair n
        //     // str.append("0");
        //     printBinaryString(n-1, 0, str.append("0"));
        //     printBinaryString(n-1, 1, str.append("1"));
        // }else{
        //     printBinaryString( n-1 , 0, str.append("0"));
        // }
        printBinaryString(n-1, 0, str+"0");
        if(lastPlace == 0){
                // sit 0 on chair n
                // str.append("0");
            printBinaryString(n-1, 1, str+"1");
        }
    }

    public static void main(String[] args) {
        
        printBinaryString(3, 0, "");
        

    }
}
