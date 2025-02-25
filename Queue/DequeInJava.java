import java.util.Deque;
import java.util.LinkedList;

public class DequeInJava {
    
    // Dequeue -> verb action remove element
    // enqueue -> verb action add element

    // Deque -> Double Ended queue
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(3);
        System.out.println(deque);
        deque.removeFirst();
        System.out.println(deque);


    }
}
