public class DriverBT
{
	public static void main(String[] args)
	{
		System.out.println("1st Testing Example:");
		BinaryTree<String> aTree = new BinaryTree<>();
		createTree1(aTree);
		
		System.out.println("(binaryTree) post-order: ");
		aTree.postorderTraverse();
		
		System.out.println("(binaryNode) post-order: ");
		aTree.postorderTraverse_callBinaryNodeMethod();
		
		System.out.println();
		
		System.out.println("(BinaryTree) Height of tree is " + aTree.getHeight());
		System.out.println("(BinaryNode) Height of tree is " + aTree.getHeight_callBinaryNodeMethod());
		
		System.out.println();
		
		System.out.println("(BinaryTree) # nodes of tree is " + aTree.getNumberOfNodes());
		System.out.println("(BinaryNode) # nodes of tree is " + aTree.getNumberOfNodes_callBinaryNodeMethod());

		System.out.println("==========================================");
		System.out.println();
		
		System.out.println("2nd Testing Example:");
		BinaryTree<String> aTree2 = new BinaryTree<>();
		createTree2(aTree2);
		
		System.out.println("(binaryTree) post-order: ");
		aTree2.postorderTraverse();
		
		System.out.println("(binaryNode) post-order: ");
		aTree2.postorderTraverse_callBinaryNodeMethod();
		
		System.out.println();
		
		System.out.println("(BinaryTree) Height of tree is " + aTree2.getHeight());
		System.out.println("(BinaryNode) Height of tree is " + aTree2.getHeight_callBinaryNodeMethod());
		
		System.out.println();
		
		System.out.println("(BinaryTree) # nodes of tree is " + aTree2.getNumberOfNodes());
		System.out.println("(BinaryNode) # nodes of tree is " + aTree2.getNumberOfNodes_callBinaryNodeMethod());
		
		System.out.println("Done.");

		// Try out extra credit work
		System.out.println("Starting Extra credit testing: ");
		System.out.println("For preorder: ABC and inorder: BAC, we get postorder: ");
		BinaryTree<String> test1 = new BinaryTree("ABC", "BAC");
		test1.postorderTraverse();

		System.out.println("\n");
		System.out.println("For preorder: ABC and inorder: BAC, we get postorder: ");
		BinaryTree<String> test2 = new BinaryTree("ABDEC", "DBEAC");
		test2.postorderTraverse();

		System.out.println("\n");
		System.out.println("For preorder: ABC and inorder: BAC, we get postorder: ");
		BinaryTree<String> test3 = new BinaryTree("ABCDE", "BADCE");
		test3.postorderTraverse();

		System.out.println("\n");
		System.out.println("For preorder: ABC and inorder: BAC, we get postorder: ");
		BinaryTree<String> test4 = new BinaryTree<>("ABDC", "DBAC");
		test4.postorderTraverse();
	}  // end main

	public static void createTree1(BinaryTree<String> tree)
	{ 
		// Leaves
		BinaryTree<String> dTree = new BinaryTree<>("D");
		BinaryTree<String> eTree = new BinaryTree<>("E");
		BinaryTree<String> gTree = new BinaryTree<>("G");

		// Subtrees:
		BinaryTree<String> fTree = new BinaryTree<>("F", null, gTree);
		BinaryTree<String> bTree = new BinaryTree<>("B", dTree, eTree);
		BinaryTree<String> cTree = new BinaryTree<>("C", fTree, null);

		tree.setTree("A", bTree, cTree);
		
      System.out.println("\nGiven Tree:\n");
      System.out.println("     A      ");
      System.out.println("   /   \\  ");
      System.out.println("  B     C  ");
      System.out.println(" / \\   /  ");
      System.out.println("D   E  F   ");
      System.out.println("        \\ ");
      System.out.println("         G ");
      System.out.println();
	} // end createTree


	/**-------------------------------------------------------------------- */
	/**Task 4: Create a tree case as shown in assignment 3*/
	public static void createTree2(BinaryTree<String> tree)
	{ 
		// Create leaves first
		BinaryTree<String> bTree = new BinaryTree<>("B");
		BinaryTree<String> fTree = new BinaryTree<>("F");
		BinaryTree<String> gTree = new BinaryTree<>("G");
		BinaryTree<String> hTree = new BinaryTree<>("H");

		// Create subtrees:
		BinaryTree<String> dTree = new BinaryTree<>("D", fTree, null);
		BinaryTree<String> eTree = new BinaryTree<>("E", gTree, hTree);
		BinaryTree<String> cTree = new BinaryTree<>("C", dTree, eTree);

		// Create new tree
		tree.setTree("A", bTree, cTree);


		// Print out the tree
		System.out.println("\nGiven Tree:\n");
		System.out.println("      A      ");
		System.out.println("     / \\  ");
		System.out.println("    B    C");
		System.out.println("        / \\");
		System.out.println("       D    E");
		System.out.println("      /    / \\");
		System.out.println("     F    G    H");



	} // end createTree2


	/**
	 * Extra Credit: Take in two strings ( a preordertraversal string and an InOrderTraversal String) and create a
	 * binary tree from taking in the two strings
	 */
//	public static BinaryTree<String> newBinaryTree(String preOrder, String inOrder)
//	{
////		// Recursive method will call itself
////		// 1st. Find the root in the in-order string
//
////
////		// 2nd. Split the in-order and pre-order strings into left and right strings
////
////
////		// 3rd. Call the method newBinaryTree on the left and right string
//
//
//		// Second attempt
//		BinaryTree<String> tree = new BinaryTree<>();
//
//		// Initialize the root character and index
//		char rootChar =  preOrder.charAt(0);
//		int rootIndex = 0;
//
//		// Convert the strings to an array of letters
//		String [] splitInOrder = inOrder.split("");
//		String [] splitPreOrder = preOrder.split("");
//
//		// Find the index of the root in the splitInOrder array
//		while (!splitInOrder[rootIndex].equalsIgnoreCase(String.valueOf(rootChar)))
//		{
//			rootIndex ++;
//		}
//
//		// Split the inOrder string into left and right strings
//		String lInOrder = "";
//		String rInOrder = "";
//
//
//		for (int i = 0; i < rootIndex; i++)
//		{
//			lInOrder += splitInOrder[i];
//
//		}
//
//		for (int i = rootIndex + 1; i < splitInOrder.length; i++ )
//		{
//			rInOrder += splitInOrder[i];
//		}
//
//
//		// Split the preOrder string into left and right strings
//		String lPreOrder = "";
//		String rPreOrder = "";
//
//		for (int i = 1; i < rootIndex + 1; i++)
//		{
//			lPreOrder += splitPreOrder[i];
//		}
//
//		for (int i = rootIndex + 1; i < splitPreOrder.length; i++)
//		{
//			rPreOrder += splitPreOrder[i];
//		}
//
//
//
//		// Create the binary tree
//		if (inOrder.length() == 1)  // i.e., if it is a leaf
//		{
//			tree.setTree(splitInOrder[rootIndex], null, null);
//		}
//		else // if it has children
//		{
//			tree.setTree(splitInOrder[rootIndex], newBinaryTree(lPreOrder, lInOrder), newBinaryTree(rPreOrder, rInOrder));
//		}
//
//		return tree;
//	}
}  // end DriverBT
