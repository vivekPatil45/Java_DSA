

// Floyd's cycle findinf algo
/*
 * slow +1
 * fast +2
 * move     distance betwn slow fast
 * 0 move - 0
 * 1 move - 1
 * 2 move - 2
 * 3 move - 3
 * if slow == fast cycle true
 * 
 * 
 */
public class LoopInLL {
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

    public static boolean isCyle(){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true; //cycle exit
            }
        }
        return false;
    }
    public static void removeCyle(){
        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                cycle = true;
                break;
            }
        }
        if(cycle == false)
            return;

        // find meeting point
        slow = head;
        Node prev = null; // last node
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        //remove cyle - last.next - null
        prev.next = null;
    }

    public static void main(String[] args) {
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        // 1->2->3->2


        System.out.println(isCyle());
        removeCyle();
        System.out.println(isCyle());


    }
}


/*
 * when slow and fast pointer same they meet at any one node of cycle
 * after make slow head and move slow and fast by 1 distance when they agian meet
 * that node is strting pint  of cyle
 */