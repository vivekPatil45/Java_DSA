import java.util.*;

public class PriorityQueueExample {
    public static void main(String[] args) {
         /*
         * PriorityQueue properties:
         * - It is based on a priority heap (Min Heap by default).
         * - The head of the queue is always the smallest element.
         * - Elements are ordered according to their natural ordering or a custom comparator.
         * - Does not allow null elements.
         * - It is not thread-safe.
         */
        // Creating a PriorityQueue
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        // 1. add(E e) - Adds an element to the queue
        queue.add(10);
        queue.add(20);
        queue.add(15);

        // 2. offer(E e) - Adds an element without exception if full
        queue.offer(25);

        // 3. peek() - Retrieves the head element without removal
        System.out.println("Head element (peek): " + queue.peek());

        // 4. poll() - Retrieves and removes the head
        System.out.println("Removed element (poll): " + queue.poll());

        // 5. remove() - Removes and returns the head
        System.out.println("Removed head element: " + queue.remove());

        // 6. contains(Object o) - Checks if element exists
        System.out.println("Contains 20: " + queue.contains(20));

        // 7. size() - Returns the number of elements
        System.out.println("Size of queue: " + queue.size());

        // 8. isEmpty() - Checks if queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty());

        // 9. toArray() - Converts queue to an array
        Object[] arr = queue.toArray();
        System.out.println("Array elements: " + Arrays.toString(arr));

        // 10. iterator() - Returns an iterator
        Iterator<Integer> iterator = queue.iterator();
        System.out.print("Iterating queue using Iterator: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // 11. clear() - Removes all elements from the queue
        queue.clear();
        System.out.println("Queue after clear(): " + queue);
    }
}
