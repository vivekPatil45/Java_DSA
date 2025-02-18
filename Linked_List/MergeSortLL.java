
public class MergeSortLL {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){ //TC - O(1) 
        // create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return; 
        }


        // newnode next = head;
        newNode.next = head; //link

        // head = newnode
        head = newNode;

    }

    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    private Node merge(Node head1, Node head2){
        Node mergedL = new Node(-1);
        Node temp = mergedL;
        while (head1 != null && head2 != null) {
            if (head.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedL.next;
    }

    public Node mergeSort(Node head){
        
        if(head == null || head.next == null){
            return head;
        }

        //find mid
        Node mid = getMid(head); 

        //left & right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        //merge
        return merge(newLeft , newRight);

    }
    public void print(){
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void zigZag(){
        // find mid
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        Node mid = slow;

        // reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev= curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        Node nextL, nextR;
        
        //zigzag merge
        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }

    }

    public static void main(String[] args) {
        
        MergeSortLL l1 = new MergeSortLL();
        l1.addFirst(1);
        l1.addFirst(2);
        l1.addFirst(3);
        l1.addFirst(4);
        l1.addFirst(5);
        l1.print();
        l1.head = l1.mergeSort(l1.head);
        l1.print();
        l1.zigZag();
        l1.print();
 
    }

}
