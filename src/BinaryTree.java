public class BinaryTree<T> implements BinaryTreeInterface<T>
{
   private BinaryNode<T> root;

   public BinaryTree()
   {
      root = null;
   } // end default constructor

   public BinaryTree(T rootData)
   {
      root = new BinaryNode<>(rootData);
   } // end constructor

   public BinaryTree(T rootData, BinaryTree<T> leftTree, BinaryTree<T> rightTree)
   {
      initializeTree(rootData, leftTree, rightTree);
   } // end constructor


   public BinaryTree(String preOrder, String inOrder)
   {
      createTree(preOrder, inOrder);
   }

   /**
    * Private helper method that recursively calls itself. Takes preorder and inorder traversal strings for a binary
    * tree and builds it.
    * @param preorder String of the preorder traversal
    * @param inorder  String of the inorder traversal
    * @return The binary tree of letters.
    */
   @SuppressWarnings("unchecked")
   private BinaryNode<T> createTree(String preorder, String inorder)
   {

      // Base case
      if (inorder.length() == 1) // if its a leaf
      {
         // Get the left and right trees
         BinaryNode<T> leftTree = null;
         BinaryNode<T> rightTree = null;

         // Get the node data
         String [] preorderArray = preorder.split("");
         String rootData = preorderArray[0];

         // return the leaf node
         BinaryNode<T> leaf = new BinaryNode<>( (T) rootData, leftTree, rightTree);

         return leaf;
      }
      else if (inorder.length() < 1) // if it only has one child
      {
         return null;
      }
      else
      {
         // Initialize the root and character index
         char rootChar = preorder.charAt(0);
         int rootIndex = 0;

         // Convert the strings to an array of letters
         String[] splitInorder = inorder.split("");
         String[] splitPreorder = preorder.split("");

         // find the index of the root in the splitInorder array
         while (!splitInorder[rootIndex].equalsIgnoreCase(String.valueOf(rootChar))) { rootIndex ++; }

         // Split the inorder string into left and right strings
         String lInorder = "";
         String rInorder = "";

         for (int i = 0; i < rootIndex; i++) { lInorder += splitInorder[i]; }

         for (int i = rootIndex + 1; i < splitInorder.length; i++ ) {rInorder += splitInorder[i];}


         // Split the preOrder string into left and right strings
         String lPreOrder = "";
         String rPreOrder = "";

         for (int i = 1; i < rootIndex + 1; i++)
         {
            lPreOrder += splitPreorder[i];
         }

         for (int i = rootIndex + 1; i < splitPreorder.length; i++)
         {
            rPreOrder += splitPreorder[i];
         }


         // Get the left tree, right tree and rootdata
         BinaryNode<T> leftTree = createTree(lPreOrder, lInorder);
         BinaryNode<T> rightTree = createTree(rPreOrder, rInorder);
         String rootData = splitPreorder[0];

         root = new BinaryNode<>( (T) rootData, leftTree, rightTree);
      }

      // Return the root
      return root;
   }


   public void setTree(T rootData, BinaryTreeInterface<T> leftTree,
                                   BinaryTreeInterface<T> rightTree)
   {
      initializeTree(rootData, (BinaryTree<T>) leftTree,
                               (BinaryTree<T>) rightTree);
   } // end setTree

   public void setRootData(T rootData)
   {
      root.setData(rootData);
   } // end setRootData
   
   public T getRootData()
   {
      if (isEmpty())
         throw new EmptyTreeException();
      else
         return root.getData();
   } // end getRootData
   
   public boolean isEmpty()
   {
      return root == null;
   } // end isEmpty
   
   public void clear()
   {
      root = null;
   } // end clear
   
   protected void setRootNode(BinaryNode<T> rootNode)
   {
      root = rootNode;
   } // end setRootNode
   
   protected BinaryNode<T> getRootNode()
   {
      return root;
   } // end getRootNode
   
   private void initializeTree(T rootData, BinaryTree<T> leftTree, BinaryTree<T> rightTree)
   {
      root = new BinaryNode<>(rootData);
      
      if ((leftTree != null) && !leftTree.isEmpty())
         root.setLeftChild(leftTree.root);
      
      if ((rightTree != null) && !rightTree.isEmpty())
      {
         if (rightTree != leftTree)
            root.setRightChild(rightTree.root);
         else
            root.setRightChild(rightTree.root.copy());
      } // end if
      
      if ((leftTree != null) && (leftTree != this))
         leftTree.clear();
      
      if ((rightTree != null) && (rightTree != this))
         rightTree.clear();
   } // end initializeTree
   
   /** -------------------------------------------------------------------- */
   /** Task 1: Implement the 4 methods
    *     . In BinaryTree.java
    *          1. public void postorderTraverse();
    *          2. private void postorderTraverse(BinaryNode<T> node)
    *          3. public void postorderTraverse_callBinaryNodeMethod()
    *     . In BinaryNode.java
    *          4. public void postorderTraverse_binaryNodeMethod() */
   
   /** calls postorderTraverse(BinaryNode<T> node)
    * prints (using post-order traversal) all nodes in the "whole" tree */
   public void postorderTraverse()
   {
      // Calls postorderTraverse(BinaryNode<T> node) on root
      postorderTraverse(root);
   }
   
   /** A Recursive Method in the BinaryTree Class   
    * prints (using post-order traversal) all nodes in the subtree rooted at this node.*/
   private void postorderTraverse(BinaryNode<T> node)
   {
      // recursive method performs postorder traversal of a subtree rooted at a given node
      if (node != null)
      {
         postorderTraverse(node.getLeftChild());
         postorderTraverse(node.getRightChild());
         System.out.println(node.getData());
      }
   }
 
   /** The following calls postorderTraverse_binaryNodeMethod(), which is a recursive binaryNode class method   
    * prints (using post-order traversal) all nodes in the "whole" tree */
   public void postorderTraverse_callBinaryNodeMethod()
   {
      // Now, postorder traversal but using the binaryNode.java class
      if(isEmpty())
      {
	throw new EmptyTreeException();
      }
      root.postorderTraverse_binaryNodeMethod();
   }
   
   /** -------------------------------------------------------------------- */
   /** Task 2: Implement the 2 methods
    *     . In BinaryTree.java
    *          1. public int getHeight_callBinaryNodeMethod()
    *     . In BinaryNode.java
    *          2. public int getHeight_binaryNodeMethod()*/
   
   /** calls getHeight(BinaryNode<T> node)
   @return  The height of the "whole" tree */
   public int getHeight()
   {
	   return getHeight(root);
   } // end getHeight
   
   /** A Recursive Method in the BinaryTree Class  
    * Computes the height of the subtree rooted at this node.
   @return  The height of the subtree rooted at this node. */
   private int getHeight(BinaryNode<T> node) 
   {
      int height = 0;
      if (node != null)
         height = 1 + Math.max(getHeight(node.getLeftChild()),
                               getHeight(node.getRightChild()));
      return height;
   } // end getHeight
   
   /** The following calls getHeight_binaryNodeMethod() which is a recursive binaryNode class method
    * Computes the height of the "whole" tree.
   @return  The height of the "whole" tree. */
   public int getHeight_callBinaryNodeMethod()
   {
      // Call the getHeight_binaryNodeMethod() to compute the height of the whole tree (call on root of tree)
      if (isEmpty())
         return 0;
      int heightOfTree = root.getHeight_binaryNodeMethod();

	   return heightOfTree;
   } // end getHeight_callBinaryNodeMethod

   /** -------------------------------------------------------------------- */
   /** Task 3: Implement the 2 methods
    *     . In BinaryTree.java
    *          1. public int getNumberOfNodes()
    *          2. private int getNumberOfNodes(BinaryNode<T> node)*/
   
   /** calls getNumberOfNodes(BinaryNode<T> node) 
   @return  The number of nodes in the "whole" tree */
   public int getNumberOfNodes()
   {
      return getNumberOfNodes(root);
   } // end getNumberOfNodes
   
   /** A Recursive Method in the BinaryTree Class   
    * Counts the nodes in the subtree rooted at this node.
    * Counts the nodes in the subtree rooted at this node.
   @return  The number of nodes in the subtree rooted at this node. */
   private int getNumberOfNodes(BinaryNode<T> node)
   {
      // Thought process: The way we will approach this is in a preorder fashion by first looking at the number of nodes
      //    in the left branch and then the number of nodes in the right branch. This is recursive, so while the node
      //    is not null we will recursively look at the children of the node.

      if (isEmpty())
         return 0;
      // Initialize the number of left and right nodes
      int numberOfLeftNodes = 0;
      int numberOfRightNodes = 0;

      // Look at the left child of the current node
      if (node.getLeftChild() != null)
      {
         numberOfLeftNodes = getNumberOfNodes(node.getLeftChild());
      }

      // Look at the right child of the current node
      if (node.getRightChild() != null)
      {
         numberOfRightNodes = getNumberOfNodes(node.getRightChild());
      }

      // Return the sum of the number of left nodes and right nodes, plus 1 from the root
      return 1 + numberOfLeftNodes + numberOfRightNodes;


   } // end getNumberOfNodes
   
   /** The following calls getNumberOfNodes_binaryNodeMethod() which is a recursive binaryNode class method
    * Counts the nodes in the "whole" tree
   @return  The number of nodes in the "whole" tree. */
   public int getNumberOfNodes_callBinaryNodeMethod()
   {
	   int numberOfNodes = 0;
	   if (root != null)
		   numberOfNodes = root.getNumberOfNodes_binaryNodeMethod();
	   return numberOfNodes;
   } // end getNumberOfNodes_callBinaryNodeMethod

} // end BinaryTree
