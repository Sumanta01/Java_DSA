public class Node {
    public int data;
    public Node left;
    public Node right;

    
    public Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
    void Postorder(Node root){
        if(root==null){
            return;
        }
        Postorder(root.left);
        Postorder(root.right);
        System.out.println(root.data);

    }
    void Preorder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        Preorder(root.left);
        Preorder(root.right);
    }
    void Inorder(Node root){
        if(root==null){
            return;
        }
        Inorder(root.left);
        System.out.println(root.data);
        Inorder(root.right);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.println("Postorder");
        root.Postorder(root);
        System.out.println("Preorder");
        root.Preorder(root);
        System.out.println("Inorder");
        root.Inorder(root);
    }
    
}
    
