
public class Node{
    int data;
    Node left;
    Node right;
    public Node(int inf) {
        this.data = inf;
        left=null;
        right=null;
    }
   
    public void Preorder(Node root){
        if(root==null){
            return ;
        }
        System.out.print(root.data+" ");
        Preorder(root.left);
        Preorder(root.right);
        
    }
    
    public void Inorder(Node root){
        if(root==null){
            return ;
        }
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }

    public void Postorder(Node root){
        if(root==null){
            return ;
        }
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.data + " ");
    }

}

public class Traverse_Tree {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.right.right=new Node(5);

        System.out.println("Preorder Traversal : ");
        root.Preorder(root);
        System.out.println();
        System.out.println("Inorder Traversal : ");
        root.Inorder(root);
        System.out.println();
        System.out.println("Postorder Traversal : ");
        root.Postorder(root);
        System.out.println();
    }
    
}
