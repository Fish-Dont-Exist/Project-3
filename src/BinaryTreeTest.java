import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BinaryTreeTest
{
    @Test
    public void postOrderBinaryTreeTraverseFullTree()
    {
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
        binaryTree7.postorderTraverse();
        // Output should be 1, 3, 5, 2, 4, 6, 7
    }

    @Test
    public void postOrderBinaryTreeTraverseCompleteTree()
    {
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
        binaryTree7.postorderTraverse();
        // Output should be 1, 3, 5, 2, 6, 7
    }

    @Test
    public void postOrderBinaryTreeTraverseNonBalancedTree()
    {
        BinaryTree<Integer> binaryTree1 = new BinaryTree<>(1);
        BinaryTree<Integer> binaryTree3 = new BinaryTree<>(3);
        BinaryTree<Integer> binaryTree5 = new BinaryTree<>(5, binaryTree1, binaryTree3);
        BinaryTree<Integer> binaryTree7 = new BinaryTree<>(7, binaryTree5, null);
        /*                  7
                        5
                     1    3
        */
        binaryTree7.postorderTraverse();
        // Output should be 1, 3, 5, 7
    }

    @Test
    public void postOrderBinaryTreeTraverseEmptyTree()
    {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.postorderTraverse();
        // Output should be
    }

    @Test
    public void postOrderBinaryTreeWithBinaryNodeMethodTraverseFullTree()
    {
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
        binaryTree7.postorderTraverse_callBinaryNodeMethod();
        // Output should be 1, 3, 5, 2, 4, 6, 7
    }

    @Test
    public void postOrderBinaryTreeWithBinaryNodeMethodTraverseCompleteTree()
    {
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
        binaryTree7.postorderTraverse_callBinaryNodeMethod();
        // Output should be 1, 3, 5, 2, 6, 7
    }

    @Test
    public void postOrderBinaryTreeWithBinaryNodeMethodTraverseNonBalancedTree()
    {
        BinaryTree<Integer> binaryTree1 = new BinaryTree<>(1);
        BinaryTree<Integer> binaryTree3 = new BinaryTree<>(3);
        BinaryTree<Integer> binaryTree5 = new BinaryTree<>(5, binaryTree1, binaryTree3);
        BinaryTree<Integer> binaryTree7 = new BinaryTree<>(7, binaryTree5, null);
        /*                  7
                        5
                     1    3
        */
        binaryTree7.postorderTraverse_callBinaryNodeMethod();
        // Output should be 1, 3, 5, 7
    }

    /**
     * Note: Throws EmptyTreeException
     */
    @Test
    public void postOrderBinaryTreeWithBinaryNodeMethodTraverseEmptyTree()
    {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.postorderTraverse_callBinaryNodeMethod();
        // Output should be
    }

    /**
     * Note: Output should be 3
     */
    @Test
    public void postOrderBinaryTreeGetHeightFullTree()
    {
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
    public void postOrderBinaryTreeGetHeightCompleteTree()
    {
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

    /**
     * Output should be 3
     */
    @Test
    public void postOrderBinaryTreeGetHeightNonBalancedTree()
    {
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
     * NullPointerException thrown
     */
    @Test
    public void postOrderBinaryTreeGetHeightEmptyTree()
    {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        int height = binaryTree.getHeight_callBinaryNodeMethod();
        assertEquals(0,height);
    }

    
}