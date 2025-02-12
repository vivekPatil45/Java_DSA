

import java.util.Scanner;

public class StringInJava {
    
    public static void main(String[] args) {
        
        String s1 = "abcd";
        String s2 = new String("Xyx");

        //string are immutable

        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.next(); //only word
        name = sc.nextLine(); // full line
       
        // length
        int n = s1.length();
        
        //concatenation
        String fname = "Vivek";
        String lname = "Patil";
        
        String fullName =  fname + " " + lname;
        System.out.println(fname.charAt(0));

    
    }
}
