class BinaryNode<T>
{
   private T             data;
   private BinaryNode<T> leftChild;  // Reference to left child
   private BinaryNode<T> rightChild; // Reference to right child

   public BinaryNode()
   {
      this(null); // Call next constructor
   } // end default constructor

   public BinaryNode(T dataPortion)
   {
      this(dataPortion, null, null); // Call next constructor
   } // end constructor

   public BinaryNode(T dataPortion, BinaryNode<T> newLeftChild,
                                    BinaryNode<T> newRightChild)
   {
      data = dataPortion;
      leftChild = newLeftChild;
      rightChild = newRightChild;
   } // end constructor

   /** Retrieves the data portion of this node.
       @return  The object in the data portion of the node. */
   public T getData()
   {
      return data;
   } // end getData

   /** Sets the data portion of this node.
       @param newData  The data object. */
   public void setData(T newData)
   {
      data = newData;
   } // end setData

   /** Retrieves the left child of this node.
       @return  A reference to this node's left child. */
   public BinaryNode<T> getLeftChild()
   {
      return leftChild;
   } // end getLeftChild

   /** Sets this node’s left child to a given node.
       @param newLeftChild  A node that will be the left child. */
   public void setLeftChild(BinaryNode<T> newLeftChild)
   {
      leftChild = newLeftChild;
   } // end setLeftChild

   /** Detects whether this node has a left child.
       @return  True if the node has a left child. */
   public boolean hasLeftChild()
   {
      return leftChild != null;
   } // end hasLeftChild

   /** Retrieves the right child of this node.
    @return  A reference to this node's right child. */
   public BinaryNode<T> getRightChild()
   {
      return rightChild;
   } // end getRightChild
   
   /** Sets this node’s right child to a given node.
    @param newRightChild  A node that will be the right child. */
   public void setRightChild(BinaryNode<T> newRightChild)
   {
      rightChild = newRightChild;
   } // end setRightChild
   
   /** Detects whether this node has a right child.
    @return  True if the node has a right child. */
   public boolean hasRightChild()
   {
      return rightChild != null;
   } // end hasRightChild

   /** Detects whether this node is a leaf.
    @return  True if the node is a leaf. */
   public boolean isLeaf()
   {
      return (leftChild == null) && (rightChild == null);
   } // end isLeaf
  
   /**A Recursion Example in the BinaryNode Class  
    * Copies the subtree rooted at this node.
       @return  The root of a copy of the subtree rooted at this node. */
   public BinaryNode<T> copy()
   {
      BinaryNode<T> newRoot = new BinaryNode<>(data);
      if (leftChild != null)
         newRoot.setLeftChild(leftChild.copy());
      
      if (rightChild != null)
         newRoot.setRightChild(rightChild.copy());
      
      return newRoot;
   } // end copy

   /** --------------------------------------------------------------------
    * Part of Task 1 */
   /** A Recursive Method in the BinaryNode Class   
    * prints (using post-order traversal) all nodes of the subtree rooted at "this" node */
   public void postorderTraverse_binaryNodeMethod()
   {
      // Recursive method performs postorder traversal of a subtree rooted at a BinaryNode object which calls the method
      if ( !this.isLeaf() )
      {
         // Process the nodes in the left subtree
         if (this.hasLeftChild())
         {
            this.getLeftChild().postorderTraverse_binaryNodeMethod();
         }

         // Process the nodes in the right subtree
         if (this.hasRightChild())
         {
            this.getRightChild().postorderTraverse_binaryNodeMethod();
         }

         // Print out the subtree
         System.out.println(this.getData());
      }
      else
      {
         System.out.println(this.getData());
      }
   }


   // ----- TEST METHODS FOR TASK 1 -----
   public String postorderTraverse_binaryNodeMethod_test()
   {
      // Initialize result
      String result = "";

      // Recursive method performs postorder traversal of a subtree rooted at a BinaryNode object which calls the method
      if ( !this.isLeaf() )
      {
         // Process the nodes in the left subtree
         if (this.hasLeftChild())
         {
            this.getLeftChild().postorderTraverse_binaryNodeMethod();
         }

         // Process the nodes in the right subtree
         if (this.hasRightChild())
         {
            this.getRightChild().postorderTraverse_binaryNodeMethod();
         }

         // Append to result
         result += this.getData();
      }
      else
      {
         // Append to result
         result += this.getData();
      }

      return result;
   }
   
   /**-------------------------------------------------------------------- 
    * Part of Task 2*/
   /** A Recursive Method in the BinaryNode Class   
    * Computes the height of the subtree rooted at "this" node.
   @return  The height of the subtree rooted at "this" node. */
   public int getHeight_binaryNodeMethod()
   {
      // Initialize height to 1
      int height = 1;

      // These two values will remain as 1 if they are leaves (recall that a tree with one node has a height of 1)
      int leftChildHeight = 1;
      int rightChildHeight = 1;

      if (!this.isLeaf())
      {
         // Check to see if the node has a left child
         if (this.hasLeftChild())
         {
            // If it has a left child, get the height of that child
            leftChildHeight = this.getLeftChild().getHeight_binaryNodeMethod();
         }

         // Check if the node has a right child
         if (this.hasRightChild())
         {
            // If it has a right child, get the height of that child
            rightChildHeight = this.getRightChild().getHeight_binaryNodeMethod();
         }

         // Add one to the height
         height = 1 + Math.max(leftChildHeight,
                               rightChildHeight);
      }

      
      return height;
   } // end getHeight
   
   /** -------------------------------------------------------------------- */
   /** A Recursive Method in the BinaryNode Class  
    * Counts the nodes in the subtree rooted at "this" node.
   @return  The number of nodes in the subtree rooted at "this" node. */
	public int getNumberOfNodes_binaryNodeMethod()
	{
	  int leftNumber = 0;
	  int rightNumber = 0;
	  if (leftChild != null)
	     leftNumber = leftChild.getNumberOfNodes_binaryNodeMethod();
	  if (rightChild != null)
	     rightNumber = rightChild.getNumberOfNodes_binaryNodeMethod();
	  return 1 + leftNumber + rightNumber;
	} // end getNumberOfNodes
	
} // end BinaryNode
