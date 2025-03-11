import java.util.*;

public class ArrayDequeExample {
    public static void main(String[] args) {
        // Creating an ArrayDeque
        ArrayDeque<String> deque = new ArrayDeque<>();

        // 1. add(E e) - Adds an element to the deque
        deque.add("Apple");
        deque.add("Banana");
        deque.add("Cherry");

        // 2. addFirst(E e) - Adds element at the front
        deque.addFirst("Pineapple");

        // 3. addLast(E e) - Adds element at the end
        deque.addLast("Grapes");

        // 4. offer(E e) - Adds element without exception if full
        deque.offer("Mango");

        // 5. offerFirst(E e) - Adds element at the front
        deque.offerFirst("Strawberry");

        // 6. offerLast(E e) - Adds element at the end
        deque.offerLast("Peach");

        // 7. peek() - Retrieves the head element without removal
        System.out.println("Head element (peek): " + deque.peek());

        // 8. peekFirst() - Retrieves first element without removal
        System.out.println("First element: " + deque.peekFirst());

        // 9. peekLast() - Retrieves last element without removal
        System.out.println("Last element: " + deque.peekLast());

        // 10. poll() - Retrieves and removes the head
        System.out.println("Removed element (poll): " + deque.poll());

        // 11. pollFirst() - Retrieves and removes the first element
        System.out.println("Removed first element: " + deque.pollFirst());

        // 12. pollLast() - Retrieves and removes the last element
        System.out.println("Removed last element: " + deque.pollLast());

        // 13. remove() - Removes and returns the head
        System.out.println("Removed head element: " + deque.remove());

        // 14. removeFirst() - Removes the first element
        deque.removeFirst();

        // 15. removeLast() - Removes the last element
        deque.removeLast();

        // 16. contains(Object o) - Checks if element exists
        System.out.println("Contains 'Banana': " + deque.contains("Banana"));

        // 17. size() - Returns the number of elements
        System.out.println("Size of deque: " + deque.size());

        // 18. isEmpty() - Checks if deque is empty
        System.out.println("Is deque empty? " + deque.isEmpty());

        // 19. toArray() - Converts deque to an array
        Object[] arr = deque.toArray();
        System.out.println("Array elements: " + Arrays.toString(arr));

        // 20. iterator() - Returns an iterator
        Iterator<String> iterator = deque.iterator();
        System.out.print("Iterating deque using Iterator: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // 21. descendingIterator() - Returns reverse order iterator
        Iterator<String> descendingIterator = deque.descendingIterator();
        System.out.print("Iterating deque in reverse: ");
        while (descendingIterator.hasNext()) {
            System.out.print(descendingIterator.next() + " ");
        }
        System.out.println();

        // 22. clear() - Removes all elements from the deque
        deque.clear();
        System.out.println("Deque after clear(): " + deque);
    }
}
