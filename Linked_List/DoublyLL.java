

public class DoublyLL {
    public class Node {
        int data;
        Node next;
        Node prev;
        
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;

        }
        
        
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //add 
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;

    }

    // remove
     //add 
    public int removeFirst(){
        
        if(head == null){
            System.out.println("DLL is emprty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head.next.prev = null;
        head = head.next;
        size--;

        return val;
    }


    public void print(){
        Node temp = head;
        System.out.print("null<->");
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.addFirst(4);

        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        dll.removeFirst();
        dll.print();
        dll.addFirst(1);
        dll.print();
        dll.reverse();
        dll.print();




    }
}
