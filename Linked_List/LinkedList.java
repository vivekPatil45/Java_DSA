
public class LinkedList {
    
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

    public void addLast(int data){ //TC - O(1) 
        // create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return; 
        }
        tail.next = newNode;
        tail = newNode;

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

    public void add(int idx, int data){

        if(idx == 0){
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx -1) {
            temp = temp.next;
            i++;
        }
        //  i = idx - 1 temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE; 
        }else if(size==1){
            int val = head.data;
            head = tail = null;
            size =0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    } 

    public int removeLast(){
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE; 
        }else if(size==1){
            int val = head.data;
            head = tail = null;
            size =0;
            return val;
        }
        // prev i = size - 2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data; //tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    } 

    public int itrSearch(int key){
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++; 
        }

        return -1;

    }
    public int helper(Node head, int key){
        if(head == null)
            return -1;
        if(head.data == key){
            return 0;
        }
        int idex = helper(head.next, key);
        if(idex == -1){
            return -1;
        }
        return idex+1;
        
    }

    public int recSearch(int key){
        return helper(head, key);
    }

    public void rverese(){
        Node prev = null;
        Node curr = tail =  head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        
    }

    public void deleteNthfromEnd(int n){
        //calculate size;
        int sz = 0;
        Node temp = head;
        while (temp!=null) {
            temp = temp.next;
            sz++;
        }
        if(n==sz){
            head = head.next; //remove first
            return;
        }

        //size -n;
        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while (i < iToFind) {
            prev= prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; //+2
        }
        return slow; // slow is mid node
    }

    public boolean checkPalindrome(){
        if(head == null || head.next != null)
            return true;

        //step 1 find mid
        Node midNode = findMid(head);

        //step 2 reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr!= null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; // right half head
        Node left = head;

        //step3 check left half and right half
        while (right != null) {
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;

    }


    public static void main(String[] args) {
        // LinkedList l1 = new LinkedList();
        // l1.print();
        // l1.addFirst(2);
        // l1.print();
        // l1.addFirst(1);
        // l1.print();
        // l1.addLast(3);
        // l1.print();
        // l1.addLast(4);
        // l1.print();
        // l1.add(2, 9);
        // l1.print();

        // System.out.println("Size of LL "+ l1.size);
        // l1.removeFirst();
        // l1.print();

        // l1.removeLast();
        // l1.print();

        // System.out.println("Size of LL "+ l1.size);
        // System.out.println(l1.itrSearch(3));
        // System.out.println(l1.itrSearch(10));
        // l1.rverese();
        // l1.print();
        // l1.addLast(4);
        // l1.addLast(6);
        // l1.print();
        // l1.deleteNthfromEnd(3);
        // l1.print();

        LinkedList l2 = new LinkedList();
        l2.addLast(1);
        l2.addLast(2);
        l2.addLast(2);
        l2.addLast(1);
        l2.print();
        System.out.println(l2.checkPalindrome());





    }
}


/*
 * slow and fast pointer
 * slow  +1
 * fast +2
 * 
 * in even case length if fast reach nulll then slow at mid of list
 * in odd case length if fast reach node that that next is null then slow at mid of list
 * 
 * palindrom
 * 1) find mid node
 * 2) 2nd half reverse
 * 3) check if 1st half = 2nd half
 */