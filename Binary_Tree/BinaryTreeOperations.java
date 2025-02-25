

public class BinaryTreeOperations {
    
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }


     // height of tree - max distance from root to leaf node (edge or node)
    public static int height(Node root){
        if(root == null)
            return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }
    public static int countNode(Node root){
        if(root == null)
            return 0;
        int lc = countNode(root.left);
        int rc = countNode(root.right);
        return lc + rc + 1;
    }

    // no. of nnodes in longest path between 2 leaves
    // approach 1 O(n^2)
    public static int diameter1(Node root){

        if(root == null)
            return 0;
        int leftDiam = diameter1(root.left);
        int leftHeight = height(root.left);

        int rightDiam = diameter1(root.right);
        int rightHeight = height(root.right);

        int selfDiam = leftHeight + rightHeight + 1;
        return Math.max(selfDiam, Math.max(rightDiam, leftDiam));

    }
    


    // approach 1 O(n)
    //function to calculate diameter //T.C = O(n)
    public static Info diameter2(Node root){

        //base case 
        if(root == null){
            return new Info(0,0);
        }

        Info leftInfo = diameter2(root.left);
        Info rightInfo = diameter2(root.right);

        int diam = Math.max(leftInfo.ht+rightInfo.ht+1,Math.max(leftInfo.diam,rightInfo.diam));
        int ht = Math.max(leftInfo.ht,rightInfo.ht)+1;

        return new Info(diam,ht);

    }
    //we will need a class for above function
    static class Info{

        int diam;
        int ht;

        //constructor 
        public Info(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }


    
    public static int sum(Node root){

        //base case
        if(root == null){
            return 0;
        }

        int leftSum = sum(root.left);
        int rightSum = sum(root.right);

        int sum = leftSum+rightSum+ root.data;

        return sum;
    }

    public static void main(String[] args) {
        
/*
 *          1
 *         / \
 *        2   3
 *      / \  / \
 *     4   5 6  7
 */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(height(root));

        System.out.println("Total nodes = "+countNode(root));

        System.out.println("Sum of the tree is = "+ sum(root));

        System.out.println("Diameter of tree is = "+diameter1(root));

        System.out.println("Diameter of tree optimized way is = "+diameter2(root).diam);



    }
}
