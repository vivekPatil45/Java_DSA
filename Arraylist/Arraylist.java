import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void swap(ArrayList<Integer>list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        //add O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        //getEle O(1)
        System.out.println(list.get(2));
        
        //remove O(n)
        list.remove(2);
        System.out.println(list);


        //setElem idx O(n)
        list.set(2, 10);
        System.out.println(list);

        //contain ele O(n)
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));
        list.add(9);
        System.out.println(list.size());
        System.out.println(list); 
        swap(list, 0, 3);
        System.out.println(list); 
        Collections.sort(list);//asc
        System.out.println(list); 

        Collections.sort(list, Collections.reverseOrder());//desc

        System.out.println(list); 





    }
}

/*
 * Array = fixed size
 * ArrayList = dynamic size
 * collection interface
 * collection class
 */
