import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class BinaryTreeTest {
    @Test
    public void postOrderBinaryTreeTraverseFullTree() {
        BinaryTree<Integer> binaryTree1 = new BinaryTree<>(1);
        BinaryTree<Integer> binaryTree2 = new BinaryTree<>(2);
        BinaryTree<Integer> binaryTree3 = new BinaryTree<>(3);
        BinaryTree<Integer> binaryTree4 = new BinaryTree<>(4);
        BinaryTree<Integer> binaryTree5 = new BinaryTree<>(5, binaryTree1, binaryTree3);
        BinaryTree<Integer> binaryTree6 = new BinaryTree<>(6, binaryTree2, binaryTree4);
        BinaryTree<Integer> binaryTree7 = new BinaryTree<>(7, binaryTree5, binaryTree6);
        /*                  7
                        5       6
                     1    3   2    4
        */

        // Create string of postorder traversal
        String postString = binaryTree7.postorderTraverse_test();

        // Assert the equals
        assertEquals("1352467", postString);
        // Output should be 1, 3, 5, 2, 4, 6, 7
    }

    @Test
    public void postOrderBinaryTreeTraverseCompleteTree() {
        BinaryTree<Integer> binaryTree1 = new BinaryTree<>(1);
        BinaryTree<Integer> binaryTree2 = new BinaryTree<>(2);
        BinaryTree<Integer> binaryTree3 = new BinaryTree<>(3);
        BinaryTree<Integer> binaryTree5 = new BinaryTree<>(5, binaryTree1, binaryTree3);
        BinaryTree<Integer> binaryTree6 = new BinaryTree<>(6, binaryTree2, null);
        BinaryTree<Integer> binaryTree7 = new BinaryTree<>(7, binaryTree5, binaryTree6);
        /*                  7
                        5       6
                     1    3   2
        */

        // Create string of postorder traversal
        String postString = binaryTree7.postorderTraverse_test();

        // Assert the equals
        assertEquals("135267", postString);
        // Output should be 1, 3, 5, 2, 6, 7
    }

    @Test
    public void postOrderBinaryTreeTraverseNonBalancedTree() {
        BinaryTree<Integer> binaryTree1 = new BinaryTree<>(1);
        BinaryTree<Integer> binaryTree3 = new BinaryTree<>(3);
        BinaryTree<Integer> binaryTree5 = new BinaryTree<>(5, binaryTree1, binaryTree3);
        BinaryTree<Integer> binaryTree7 = new BinaryTree<>(7, binaryTree5, null);
        /*                  7
                        5
                     1    3
        */

        // Create string of postorder traversal
        String postString = binaryTree7.postorderTraverse_test();

        // Assert the equals
        assertEquals("1357", postString);
        // Output should be 1, 3, 5, 7
    }

    @Test
    public void postOrderBinaryTreeTraverseEmptyTree() {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.postorderTraverse();

        // Create string of postorder traversal
        String postString = binaryTree.postorderTraverse_test();

        // Assert the equals
        assertEquals("", postString);
        // Output should be
    }

    @Test
    public void postOrderBinaryTreeWithBinaryNodeMethodTraverseFullTree() {
        BinaryTree<Integer> binaryTree1 = new BinaryTree<>(1);
        BinaryTree<Integer> binaryTree2 = new BinaryTree<>(2);
        BinaryTree<Integer> binaryTree3 = new BinaryTree<>(3);
        BinaryTree<Integer> binaryTree4 = new BinaryTree<>(4);
        BinaryTree<Integer> binaryTree5 = new BinaryTree<>(5, binaryTree1, binaryTree3);
        BinaryTree<Integer> binaryTree6 = new BinaryTree<>(6, binaryTree2, binaryTree4);
        BinaryTree<Integer> binaryTree7 = new BinaryTree<>(7, binaryTree5, binaryTree6);
        /*                  7
                        5       6
                     1    3   2    4
        */

        // Create string of postorder traversal
        String postString = binaryTree7.postorderTraverse_callBinaryNodeMethod_test();

        // Assert the equals
        assertEquals("1352467", postString);
        // Output should be 1, 3, 5, 2, 4, 6, 7
    }

    @Test
    public void postOrderBinaryTreeWithBinaryNodeMethodTraverseCompleteTree() {
        BinaryTree<Integer> binaryTree1 = new BinaryTree<>(1);
        BinaryTree<Integer> binaryTree2 = new BinaryTree<>(2);
        BinaryTree<Integer> binaryTree3 = new BinaryTree<>(3);
        BinaryTree<Integer> binaryTree5 = new BinaryTree<>(5, binaryTree1, binaryTree3);
        BinaryTree<Integer> binaryTree6 = new BinaryTree<>(6, binaryTree2, null);
        BinaryTree<Integer> binaryTree7 = new BinaryTree<>(7, binaryTree5, binaryTree6);
        /*                  7
                        5       6
                     1    3   2
        */
        // Create string of postorder traversal
        String postString = binaryTree7.postorderTraverse_callBinaryNodeMethod_test();

        // Assert the equals
        assertEquals("135267", postString);
        // Output should be 1, 3, 5, 2, 6, 7
    }

    @Test
    public void postOrderBinaryTreeWithBinaryNodeMethodTraverseNonBalancedTree() {
        BinaryTree<Integer> binaryTree1 = new BinaryTree<>(1);
        BinaryTree<Integer> binaryTree3 = new BinaryTree<>(3);
        BinaryTree<Integer> binaryTree5 = new BinaryTree<>(5, binaryTree1, binaryTree3);
        BinaryTree<Integer> binaryTree7 = new BinaryTree<>(7, binaryTree5, null);
        /*                  7
                        5
                     1    3
        */

        // Create string of postorder traversal
        String postString = binaryTree7.postorderTraverse_callBinaryNodeMethod_test();

        // Assert the equals
        assertEquals("1357", postString);
        // Output should be 1, 3, 5, 7
    }

    /**
     * Note: Throws EmptyTreeException
     */
    @Test
    public void postOrderBinaryTreeWithBinaryNodeMethodTraverseEmptyTree() {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
//        binaryTree.postorderTraverse_callBinaryNodeMethod();

        // Output should throw an exception
        assertThrows(EmptyTreeException.class, () -> {
            binaryTree.postorderTraverse_callBinaryNodeMethod();
        });

    }


    @Test
    public void postOrderBinaryTreeGetHeightFullTree() {
        BinaryTree<Integer> binaryTree1 = new BinaryTree<>(1);
        BinaryTree<Integer> binaryTree2 = new BinaryTree<>(2);
        BinaryTree<Integer> binaryTree3 = new BinaryTree<>(3);
        BinaryTree<Integer> binaryTree4 = new BinaryTree<>(4);
        BinaryTree<Integer> binaryTree5 = new BinaryTree<>(5, binaryTree1, binaryTree3);
        BinaryTree<Integer> binaryTree6 = new BinaryTree<>(6, binaryTree2, binaryTree4);
        BinaryTree<Integer> binaryTree7 = new BinaryTree<>(7, binaryTree5, binaryTree6);
        /*                  7
                        5       6
                     1    3   2    4
        */
        int height = binaryTree7.getHeight_callBinaryNodeMethod();
        assertEquals(3, height);
    }

    @Test
    public void postOrderBinaryTreeGetMiddleHeightFullTree() {
        BinaryTree<Integer> binaryTree1 = new BinaryTree<>(1);
        BinaryTree<Integer> binaryTree2 = new BinaryTree<>(2);
        BinaryTree<Integer> binaryTree3 = new BinaryTree<>(3);
        BinaryTree<Integer> binaryTree4 = new BinaryTree<>(4);
        BinaryTree<Integer> binaryTree5 = new BinaryTree<>(5, binaryTree1, binaryTree3);
        BinaryTree<Integer> binaryTree6 = new BinaryTree<>(6, binaryTree2, binaryTree4);
        BinaryTree<Integer> binaryTree7 = new BinaryTree<>(7, binaryTree5, binaryTree6);
        /*                  7
                        5       6
                     1    3   2    4
        */
        int height = binaryTree5.getHeight_callBinaryNodeMethod();
        assertEquals(2, height);
    }

    @Test
    public void postOrderBinaryTreeGetBottomHeightFullTree() {
        BinaryTree<Integer> binaryTree1 = new BinaryTree<>(1);
        BinaryTree<Integer> binaryTree2 = new BinaryTree<>(2);
        BinaryTree<Integer> binaryTree3 = new BinaryTree<>(3);
        BinaryTree<Integer> binaryTree4 = new BinaryTree<>(4);
        BinaryTree<Integer> binaryTree5 = new BinaryTree<>(5, binaryTree1, binaryTree3);
        BinaryTree<Integer> binaryTree6 = new BinaryTree<>(6, binaryTree2, binaryTree4);
        BinaryTree<Integer> binaryTree7 = new BinaryTree<>(7, binaryTree5, binaryTree6);
        /*                  7
                        5       6
                     1    3   2    4
        */
        int height = binaryTree1.getHeight_callBinaryNodeMethod();
        assertEquals(1, height);
    }

    @Test
    public void postOrderBinaryTreeGetHeightCompleteTree() {
        BinaryTree<Integer> binaryTree1 = new BinaryTree<>(1);
        BinaryTree<Integer> binaryTree2 = new BinaryTree<>(2);
        BinaryTree<Integer> binaryTree3 = new BinaryTree<>(3);
        BinaryTree<Integer> binaryTree5 = new BinaryTree<>(5, binaryTree1, binaryTree3);
        BinaryTree<Integer> binaryTree6 = new BinaryTree<>(6, binaryTree2, null);
        BinaryTree<Integer> binaryTree7 = new BinaryTree<>(7, binaryTree5, binaryTree6);
        /*                  7
                        5       6
                     1    3   2
        */
        int height = binaryTree7.getHeight_callBinaryNodeMethod();
        assertEquals(3, height);
    }

    @Test
    public void postOrderBinaryTreeGetMiddleHeightCompleteTree() {
        BinaryTree<Integer> binaryTree1 = new BinaryTree<>(1);
        BinaryTree<Integer> binaryTree2 = new BinaryTree<>(2);
        BinaryTree<Integer> binaryTree3 = new BinaryTree<>(3);
        BinaryTree<Integer> binaryTree5 = new BinaryTree<>(5, binaryTree1, binaryTree3);
        BinaryTree<Integer> binaryTree6 = new BinaryTree<>(6, binaryTree2, null);
        BinaryTree<Integer> binaryTree7 = new BinaryTree<>(7, binaryTree5, binaryTree6);
        /*                  7
                        5       6
                     1    3   2
        */
        int height = binaryTree6.getHeight_callBinaryNodeMethod();
        assertEquals(2, height);
    }

    @Test
    public void postOrderBinaryTreeGetHeightNonBalancedTree() {
        BinaryTree<Integer> binaryTree1 = new BinaryTree<>(1);
        BinaryTree<Integer> binaryTree3 = new BinaryTree<>(3);
        BinaryTree<Integer> binaryTree5 = new BinaryTree<>(5, binaryTree1, binaryTree3);
        BinaryTree<Integer> binaryTree7 = new BinaryTree<>(7, binaryTree5, null);
        /*                  7
                        5
                     1    3
        */
        int height = binaryTree7.getHeight_callBinaryNodeMethod();
        assertEquals(3, height);
    }

    /**
     * Should be equal to 0
     */

    @Test
    public void postOrderBinaryTreeGetHeightEmptyTree() {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        int height = binaryTree.getHeight_callBinaryNodeMethod();
        assertEquals(0, height);
    }

    /**
     * Should be equal
     */
    @Test
    public void createNewBinaryTreeFromString() {
        BinaryTree<String> apple = new BinaryTree<>("ABC", "BAC");
        apple.postorderTraverse();
    }


    @Test
    public void postOrderBinaryTreeGetNodesFullTree() {
        BinaryTree<Integer> binaryTree1 = new BinaryTree<>(1);
        BinaryTree<Integer> binaryTree2 = new BinaryTree<>(2);
        BinaryTree<Integer> binaryTree3 = new BinaryTree<>(3);
        BinaryTree<Integer> binaryTree4 = new BinaryTree<>(4);
        BinaryTree<Integer> binaryTree5 = new BinaryTree<>(5, binaryTree1, binaryTree3);
        BinaryTree<Integer> binaryTree6 = new BinaryTree<>(6, binaryTree2, binaryTree4);
        BinaryTree<Integer> binaryTree7 = new BinaryTree<>(7, binaryTree5, binaryTree6);
        /*                  7
                        5       6
                     1    3   2    4
        */
        int nodes = binaryTree7.getNumberOfNodes();
        assertEquals(7, nodes);
    }

    @Test
    public void postOrderBinaryTreeGetMiddleNodesFullTree() {
        BinaryTree<Integer> binaryTree1 = new BinaryTree<>(1);
        BinaryTree<Integer> binaryTree2 = new BinaryTree<>(2);
        BinaryTree<Integer> binaryTree3 = new BinaryTree<>(3);
        BinaryTree<Integer> binaryTree4 = new BinaryTree<>(4);
        BinaryTree<Integer> binaryTree5 = new BinaryTree<>(5, binaryTree1, binaryTree3);
        BinaryTree<Integer> binaryTree6 = new BinaryTree<>(6, binaryTree2, binaryTree4);
        BinaryTree<Integer> binaryTree7 = new BinaryTree<>(7, binaryTree5, binaryTree6);
        /*                  7
                        5       6
                     1    3   2    4
        */
        int nodes = binaryTree5.getNumberOfNodes();
        assertEquals(3, nodes);
    }

    @Test
    public void postOrderBinaryTreeGetBottomNodesFullTree() {
        BinaryTree<Integer> binaryTree1 = new BinaryTree<>(1);
        BinaryTree<Integer> binaryTree2 = new BinaryTree<>(2);
        BinaryTree<Integer> binaryTree3 = new BinaryTree<>(3);
        BinaryTree<Integer> binaryTree4 = new BinaryTree<>(4);
        BinaryTree<Integer> binaryTree5 = new BinaryTree<>(5, binaryTree1, binaryTree3);
        BinaryTree<Integer> binaryTree6 = new BinaryTree<>(6, binaryTree2, binaryTree4);
        BinaryTree<Integer> binaryTree7 = new BinaryTree<>(7, binaryTree5, binaryTree6);
        /*                  7
                        5       6
                     1    3   2    4
        */
        int nodes = binaryTree1.getNumberOfNodes();
        assertEquals(1, nodes);
    }

    @Test
    public void postOrderBinaryTreeGetNodesCompleteTree() {
        BinaryTree<Integer> binaryTree1 = new BinaryTree<>(1);
        BinaryTree<Integer> binaryTree2 = new BinaryTree<>(2);
        BinaryTree<Integer> binaryTree3 = new BinaryTree<>(3);
        BinaryTree<Integer> binaryTree5 = new BinaryTree<>(5, binaryTree1, binaryTree3);
        BinaryTree<Integer> binaryTree6 = new BinaryTree<>(6, binaryTree2, null);
        BinaryTree<Integer> binaryTree7 = new BinaryTree<>(7, binaryTree5, binaryTree6);
        /*                  7
                        5       6
                     1    3   2
        */
        int nodes = binaryTree7.getNumberOfNodes();
        assertEquals(6, nodes);
    }

    @Test
    public void postOrderBinaryTreeGetMiddleNodesCompleteTree() {
        BinaryTree<Integer> binaryTree1 = new BinaryTree<>(1);
        BinaryTree<Integer> binaryTree2 = new BinaryTree<>(2);
        BinaryTree<Integer> binaryTree3 = new BinaryTree<>(3);
        BinaryTree<Integer> binaryTree5 = new BinaryTree<>(5, binaryTree1, binaryTree3);
        BinaryTree<Integer> binaryTree6 = new BinaryTree<>(6, binaryTree2, null);
        BinaryTree<Integer> binaryTree7 = new BinaryTree<>(7, binaryTree5, binaryTree6);
        /*                  7
                        5       6
                     1    3   2
        */
        int nodes = binaryTree6.getNumberOfNodes();
        assertEquals(2, nodes);
    }

    @Test
    public void postOrderBinaryTreeGetNodesNonBalancedTree() {
        BinaryTree<Integer> binaryTree1 = new BinaryTree<>(1);
        BinaryTree<Integer> binaryTree3 = new BinaryTree<>(3);
        BinaryTree<Integer> binaryTree5 = new BinaryTree<>(5, binaryTree1, binaryTree3);
        BinaryTree<Integer> binaryTree7 = new BinaryTree<>(7, binaryTree5, null);
        /*                  7
                        5
                     1    3
        */
        int nodes = binaryTree7.getNumberOfNodes();
        assertEquals(4, nodes);
    }

    @Test
    public void postOrderBinaryTreeGetNodesEmptyTree() {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        int nodes = binaryTree.getNumberOfNodes();
        assertEquals(0, nodes);
    }

    @Test
    public void postOrderBinaryTreeWithBinaryNodeMethodGetNodesFullTree() {
        BinaryTree<Integer> binaryTree1 = new BinaryTree<>(1);
        BinaryTree<Integer> binaryTree2 = new BinaryTree<>(2);
        BinaryTree<Integer> binaryTree3 = new BinaryTree<>(3);
        BinaryTree<Integer> binaryTree4 = new BinaryTree<>(4);
        BinaryTree<Integer> binaryTree5 = new BinaryTree<>(5, binaryTree1, binaryTree3);
        BinaryTree<Integer> binaryTree6 = new BinaryTree<>(6, binaryTree2, binaryTree4);
        BinaryTree<Integer> binaryTree7 = new BinaryTree<>(7, binaryTree5, binaryTree6);
        /*                  7
                        5       6
                     1    3   2    4
        */
        int nodes = binaryTree7.getNumberOfNodes_callBinaryNodeMethod();
        assertEquals(7, nodes);
    }

    @Test
    public void postOrderBinaryTreeWithBinaryNodeMethodGetMiddleNodesFullTree() {
        BinaryTree<Integer> binaryTree1 = new BinaryTree<>(1);
        BinaryTree<Integer> binaryTree2 = new BinaryTree<>(2);
        BinaryTree<Integer> binaryTree3 = new BinaryTree<>(3);
        BinaryTree<Integer> binaryTree4 = new BinaryTree<>(4);
        BinaryTree<Integer> binaryTree5 = new BinaryTree<>(5, binaryTree1, binaryTree3);
        BinaryTree<Integer> binaryTree6 = new BinaryTree<>(6, binaryTree2, binaryTree4);
        BinaryTree<Integer> binaryTree7 = new BinaryTree<>(7, binaryTree5, binaryTree6);
        /*                  7
                        5       6
                     1    3   2    4
        */
        int nodes = binaryTree5.getNumberOfNodes_callBinaryNodeMethod();
        assertEquals(3, nodes);
    }

    @Test
    public void postOrderBinaryTreeWithBinaryNodeMethodGetBottomNodesFullTree() {
        BinaryTree<Integer> binaryTree1 = new BinaryTree<>(1);
        BinaryTree<Integer> binaryTree2 = new BinaryTree<>(2);
        BinaryTree<Integer> binaryTree3 = new BinaryTree<>(3);
        BinaryTree<Integer> binaryTree4 = new BinaryTree<>(4);
        BinaryTree<Integer> binaryTree5 = new BinaryTree<>(5, binaryTree1, binaryTree3);
        BinaryTree<Integer> binaryTree6 = new BinaryTree<>(6, binaryTree2, binaryTree4);
        BinaryTree<Integer> binaryTree7 = new BinaryTree<>(7, binaryTree5, binaryTree6);
        /*                  7
                        5       6
                     1    3   2    4
        */
        int nodes = binaryTree1.getNumberOfNodes_callBinaryNodeMethod();
        assertEquals(1, nodes);
    }

    @Test
    public void postOrderBinaryTreeWithBinaryNodeMethodGetNodesCompleteTree() {
        BinaryTree<Integer> binaryTree1 = new BinaryTree<>(1);
        BinaryTree<Integer> binaryTree2 = new BinaryTree<>(2);
        BinaryTree<Integer> binaryTree3 = new BinaryTree<>(3);
        BinaryTree<Integer> binaryTree5 = new BinaryTree<>(5, binaryTree1, binaryTree3);
        BinaryTree<Integer> binaryTree6 = new BinaryTree<>(6, binaryTree2, null);
        BinaryTree<Integer> binaryTree7 = new BinaryTree<>(7, binaryTree5, binaryTree6);
        /*                  7
                        5       6
                     1    3   2
        */
        int nodes = binaryTree7.getNumberOfNodes_callBinaryNodeMethod();
        assertEquals(6, nodes);
    }

    @Test
    public void postOrderBinaryTreeWithBinaryNodeMethodGetMiddleNodesCompleteTree() {
        BinaryTree<Integer> binaryTree1 = new BinaryTree<>(1);
        BinaryTree<Integer> binaryTree2 = new BinaryTree<>(2);
        BinaryTree<Integer> binaryTree3 = new BinaryTree<>(3);
        BinaryTree<Integer> binaryTree5 = new BinaryTree<>(5, binaryTree1, binaryTree3);
        BinaryTree<Integer> binaryTree6 = new BinaryTree<>(6, binaryTree2, null);
        BinaryTree<Integer> binaryTree7 = new BinaryTree<>(7, binaryTree5, binaryTree6);
        /*                  7
                        5       6
                     1    3   2
        */
        int nodes = binaryTree6.getNumberOfNodes_callBinaryNodeMethod();
        assertEquals(2, nodes);
    }

    @Test
    public void postOrderBinaryTreeWithBinaryNodeMethodGetNodesNonBalancedTree() {
        BinaryTree<Integer> binaryTree1 = new BinaryTree<>(1);
        BinaryTree<Integer> binaryTree3 = new BinaryTree<>(3);
        BinaryTree<Integer> binaryTree5 = new BinaryTree<>(5, binaryTree1, binaryTree3);
        BinaryTree<Integer> binaryTree7 = new BinaryTree<>(7, binaryTree5, null);
        /*                  7
                        5
                     1    3
        */
        int nodes = binaryTree7.getNumberOfNodes_callBinaryNodeMethod();
        assertEquals(4, nodes);
    }

    @Test
    public void postOrderBinaryTreeWithBinaryNodeMethodGetNodesEmptyTree() {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        int nodes = binaryTree.getNumberOfNodes_callBinaryNodeMethod();
        assertEquals(0, nodes);
    }

    @Test
    public void createBinaryTreeWithPreorderAndInorderStrings() {
        // First create the binary tree using two strings
        BinaryTree<String> binaryTree = new BinaryTree("ABC", "BAC");

        // Check if the postorders match
        String postString = binaryTree.postorderTraverse_test();

        // Assert the equals
        assertEquals("BCA", postString);
    }

    @Test
    public void createFullBinaryTreeWithPreorderAndInorderStrings() {
        // Create the binary tree using two strings
        BinaryTree<String> binaryTree = new BinaryTree<>("ABDECFG", "DBEAFCG");

        // Check if the postorders match
        String postString = binaryTree.postorderTraverse_test();

        // Assert the equals
        assertEquals("DEBFGCA", postString);
    }

    @Test
    public void createCompleteBinaryTreeWithPreorderAndInorderStrings()
    {
        // Create the binary tree using two strings
        BinaryTree<String> binaryTree = new BinaryTree<>("HIKOPLQJMN", "OKPIQLHMJN");

        // Check if the postorders match
        String postString = binaryTree.postorderTraverse_test();

        // Assert the equals
        assertEquals("OPKQLIMNJH", postString);
    }

    @Test
    public void createBinaryTreeThatIsNotCompleteNorFullWithPreorderAndInorderStrings()
    {
        // Create binary tree using two strings
        BinaryTree<String> binaryTree = new BinaryTree<>("RSUXTVWY", "XUSRVTYW");

        // Check if the postorders match
        String postString = binaryTree.postorderTraverse_test();

        // Assert the equals
        assertEquals("XUSVYWTR", postString);
    }
}