
public class RemoveDuplicate {
    
    public static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean map[] ){ // 2*n (floor size)
        
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        } 

        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            removeDuplicate(str, idx+1, newStr, map);
        }else{
            map[currChar - 'a'] = true;
            removeDuplicate(str, idx+1, newStr.append(currChar), map);
        }
        

        

    }

    public static void main(String[] args) {
        
        // int n = 4;
        // System.out.println(tilingProblem(n));
        String str = "appnnacollege";
        removeDuplicate(str, 0, new StringBuilder(""),new boolean[26]);
    }
}
