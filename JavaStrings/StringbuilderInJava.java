
public class StringbuilderInJava {
    public static void main(String[] args) {
        
        //muttable 
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch<='z'; ch++) {
            sb.append(ch);

        }
        System.out.println(sb);
    }
}
