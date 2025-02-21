import java.util.Stack;

public class DuplicateParentheses {
    
  

    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // opening
            if(ch==')'){
                int c  = 0;
                while (s.peek() != '(') {
                    s.pop();
                    c++;
                }
                if(c<1)
                    return true; //duplicate
                else  
                    s.pop(); //opening pair
            }else{
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        
        String s1  = "((a+b))"; //true
        String s2  = "(a-b)"; //false
        System.out.println(isDuplicate(s1));
        System.out.println(isDuplicate(s2));



    }
}
