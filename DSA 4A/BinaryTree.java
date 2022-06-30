//MUHAMMED SHAJAHAN.AM.U4AIE21144
class node{
	int data;
	node left; 
	node right;
	node parent;
	node(int data){
		this.data = data;
		this.left = null;
		this.right = null;
		this.parent = null;
	}
	
}

public class BinaryTree {
	node root;
	BinaryTree(int key){
		root  = new node(key);
	}
	BinaryTree() { 
		root = null; 
	}
	public void preorderTraversal(node v) {
		if(v==null) return;
		else {
			System.out.print(v.data+" ");
			preorderTraversal(v.left);
			preorderTraversal(v.right);
		}	
	}
	public void postorderTraversal(node v) {
		if(v == null) return;
		else {
			
			postorderTraversal(v.left);
			postorderTraversal(v.right);
			System.out.print(v.data+" ");
		}
	}
	public void inorderTraversal(node v) {
		if(v == null) return;
		else {
			
			inorderTraversal(v.left);
			System.out.print(v.data+" ");
			inorderTraversal(v.right);
		}
	}
	public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
 
        // create root
        tree.root = new node(1);
        tree.root.left = new node(2);
        tree.root.right = new node(3);
        tree.root.left.left = new node(4);
        tree.root.left.right=new node(5);
        tree.root.right.left=new node(6);
        System.out.println("\n Preorder:");
        tree.preorderTraversal(tree.root);
        System.out.println("\n Postorder:");
        tree.postorderTraversal(tree.root);
        System.out.println("\n Inorder:");
        tree.inorderTraversal(tree.root);
        
        
    }
}
