//MUHAMMED SHAJAHAN AM.EN.U4AIE21144
class BinarySearchTree
{
    class Node 
    {
        int data;
        Node left, right;
 
        public Node(int item)
        {
            data = item;
            left = right = null;
        }
    }
 
  
    Node root;
 

    BinarySearchTree()
    { 
    	root = null;
    }
 
    BinarySearchTree(int value) 
    {
    	root = new Node(value);
    }
 

    void insert(int key) 
    { 
    	root = insertRec(root, key); 
    }
    void delete(int key) 
    {
    	root = deleteRec(root, key);
    }
 

    Node insertRec(Node root, int key)
    {

        if (root == null) 
        {
            root = new Node(key);
            return root;
        }
 
    
        if (key < root.data)
            root.left = insertRec(root.left, key);
        else if (key > root.data)
            root.right = insertRec(root.right, key);
 

        return root;
    }
    Node deleteRec(Node root, int key)
    {
        
        if (root == null)
            return root;
 
       
        if (key < root.data)
            root.left = deleteRec(root.left, key);
        else if (key > root.data)
            root.right = deleteRec(root.right, key);
        else {
            
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            root.data = minValue(root.right);
            root.right = deleteRec(root.right, root.data);
        }
        return root;
    }
    int minValue(Node root)
    {
        int minv = root.data;
        while (root.left != null)
        {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }
    public Node search(Node root, int key)
    {
        
        if (root==null || root.data==key)
            return root;
     
        
        if (root.data < key)
           return search(root.right, key);
     
        
        return search(root.left, key);
    }
     void ReturnSearch(int key)
    {
    	Node node = search(root,key);
    	if (node != null) {
    		System.out.println(node.data+" is present in tree");
    	}else {
    		System.out.println("Not present in tree");
    	}
    	
    }
 
    void inorder() 
    { 
    	inorderRec(root); 
    }
 

    void inorderRec(Node root)
    {
        if (root != null)
        {
            inorderRec(root.left);
            System.out.println(root.data);
            inorderRec(root.right);
        }
    }
 
  
    public static void main(String[] args)
    {
        BinarySearchTree tree = new BinarySearchTree();
        System.out.println("Insertion: ");
        tree.insert(100);
        tree.insert(150);
        tree.insert(200);
        tree.insert(250);
        tree.insert(300);
        tree.insert(350);
        tree.insert(400);
        tree.inorder();
        System.out.println("Deletion: ");
        tree.delete(100);
        tree.delete(400);
        tree.inorder();
        System.out.println("Searching...");
        tree.ReturnSearch(250);
    }
}
