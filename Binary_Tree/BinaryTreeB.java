import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeB {
    
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

    static class BinaryTree{
        /*we will treverse the whole tree index wise and at first only 
        we will increase the index so basical we will start with zero*/
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;

        }

        public static void preorder(Node root){ //o(n)
            // root
            // left subtree
            // right subtree
            // root node always is first ele

            if(root == null)
                return;
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void postorder(Node root){ //o(n)
            // left subtree
            // right subtree
            // root
            // root node always is last ele


            if(root == null)
                return;
            preorder(root.left);
            preorder(root.right);
            System.out.print(root.data + " ");
        }


        public static void levelorder(Node root){
            // using queue
            // level wise traverse
            if(root == null)
                return;
            Queue<Node>q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data + " ");
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }
        }
    
         //#2 In ORDER
         public static void inOrder(Node root){
            //base case
            if(root == null){
                return;
            }

            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    

    }



    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree  tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        tree.preorder(root);
        System.out.println();
        tree.postorder(root);
        System.out.println();
        tree.levelorder(root);
        System.out.println();
        tree.inOrder(root);

    }
}

/*
 *          1
 *         / \
 *        2   3
 *       / \   \
 *      4   5   6
 */
