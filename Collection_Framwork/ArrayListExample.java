import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // 1. add(E e) - Adds an element to the list
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // 2. add(int index, E element) - Inserts an element at a specified index
        list.add(1, "Blueberry");

        // 3. get(int index) - Retrieves the element at the specified index
        System.out.println("Element at index 2: " + list.get(2));

        // 4. set(int index, E element) - Replaces element at the given index
        list.set(2, "Mango");

        // 5. remove(int index) - Removes element at specified index
        list.remove(3);

        // 6. remove(Object o) - Removes the first occurrence of the specified element
        list.remove("Apple");

        // 7. contains(Object o) - Checks if an element is in the list
        System.out.println("Contains 'Banana': " + list.contains("Banana"));

        // 8. size() - Returns the number of elements in the list
        System.out.println("Size of list: " + list.size());

        // 9. isEmpty() - Checks if the list is empty
        System.out.println("Is list empty? " + list.isEmpty());

        // 10. indexOf(Object o) - Returns the index of the first occurrence of element
        System.out.println("Index of 'Mango': " + list.indexOf("Mango"));

        // 11. lastIndexOf(Object o) - Returns index of last occurrence of element
        list.add("Banana");
        System.out.println("Last index of 'Banana': " + list.lastIndexOf("Banana"));

        // 12. toArray() - Converts list into an array
        Object[] arr = list.toArray();
        System.out.println("Array elements: " + Arrays.toString(arr));

        // 13. iterator() - Returns an iterator over elements
        Iterator<String> iterator = list.iterator();
        System.out.print("Iterating list using Iterator: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // 14. Using ListIterator to iterate in both directions
        ListIterator<String> listIterator = list.listIterator();
        System.out.print("Iterating forward using ListIterator: ");
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }
        System.out.println();
        
        System.out.print("Iterating backward using ListIterator: ");
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }
        System.out.println();

        // 15. clear() - Removes all elements from the list
        list.clear();
        System.out.println("List after clear(): " + list);
    }
}
