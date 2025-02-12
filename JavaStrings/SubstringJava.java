

public class SubstringJava {
    
    public static void main(String[] args) {
        
        String str = "HelloWorld";
        System.out.println(str.substring(0,5));

        String fruits[] = {"apple","mango","banana"};
        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if(largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
