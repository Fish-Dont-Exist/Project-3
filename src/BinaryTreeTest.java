import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BinaryTreeTest
{
    @Test
    public void postOrderBinaryTreeTraverseFullTree()
    {
        BinaryTree binaryTree1 = new BinaryTree(1);
        BinaryTree binaryTree2 = new BinaryTree(2);
        BinaryTree binaryTree3 = new BinaryTree(3);
        BinaryTree binaryTree4 = new BinaryTree(4);
        BinaryTree binaryTree5 = new BinaryTree(5, binaryTree1, binaryTree3);
        BinaryTree binaryTree6 = new BinaryTree(6, binaryTree2, binaryTree4);
        BinaryTree binaryTree7 = new BinaryTree(7, binaryTree5, binaryTree6);
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
        BinaryTree binaryTree1 = new BinaryTree(1);
        BinaryTree binaryTree2 = new BinaryTree(2);
        BinaryTree binaryTree3 = new BinaryTree(3);
        BinaryTree binaryTree5 = new BinaryTree(5, binaryTree1, binaryTree3);
        BinaryTree binaryTree6 = new BinaryTree(6, binaryTree2, null);
        BinaryTree binaryTree7 = new BinaryTree(7, binaryTree5, binaryTree6);
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
        BinaryTree binaryTree1 = new BinaryTree(1);
        BinaryTree binaryTree3 = new BinaryTree(3);
        BinaryTree binaryTree5 = new BinaryTree(5, binaryTree1, binaryTree3);
        BinaryTree binaryTree7 = new BinaryTree(7, binaryTree5, null);
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
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.postorderTraverse();
        // Output should be
    }

    @Test
    public void postOrderBinaryTreeWithBinaryNodeMethodTraverseFullTree()
    {
        BinaryTree binaryTree1 = new BinaryTree(1);
        BinaryTree binaryTree2 = new BinaryTree(2);
        BinaryTree binaryTree3 = new BinaryTree(3);
        BinaryTree binaryTree4 = new BinaryTree(4);
        BinaryTree binaryTree5 = new BinaryTree(5, binaryTree1, binaryTree3);
        BinaryTree binaryTree6 = new BinaryTree(6, binaryTree2, binaryTree4);
        BinaryTree binaryTree7 = new BinaryTree(7, binaryTree5, binaryTree6);
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
        BinaryTree binaryTree1 = new BinaryTree(1);
        BinaryTree binaryTree2 = new BinaryTree(2);
        BinaryTree binaryTree3 = new BinaryTree(3);
        BinaryTree binaryTree5 = new BinaryTree(5, binaryTree1, binaryTree3);
        BinaryTree binaryTree6 = new BinaryTree(6, binaryTree2, null);
        BinaryTree binaryTree7 = new BinaryTree(7, binaryTree5, binaryTree6);
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
        BinaryTree binaryTree1 = new BinaryTree(1);
        BinaryTree binaryTree3 = new BinaryTree(3);
        BinaryTree binaryTree5 = new BinaryTree(5, binaryTree1, binaryTree3);
        BinaryTree binaryTree7 = new BinaryTree(7, binaryTree5, null);
        /*                  7
                        5
                     1    3
        */
        binaryTree7.postorderTraverse_callBinaryNodeMethod();
        // Output should be 1, 3, 5, 7
    }

    /**
     * Note: This results in a NullPointerException currently, needs fixing soon
     */
    @Test
    public void postOrderBinaryTreeWithBinaryNodeMethodTraverseEmptyTree()
    {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.postorderTraverse_callBinaryNodeMethod();
        // Output should be
    }

    /**
     * Note: This gives 2 instead of 3, maybe I tested wrong?
     */
    @Test
    public void postOrderBinaryTreeGetHeightFullTree()
    {
        BinaryTree binaryTree1 = new BinaryTree(1);
        BinaryTree binaryTree2 = new BinaryTree(2);
        BinaryTree binaryTree3 = new BinaryTree(3);
        BinaryTree binaryTree4 = new BinaryTree(4);
        BinaryTree binaryTree5 = new BinaryTree(5, binaryTree1, binaryTree3);
        BinaryTree binaryTree6 = new BinaryTree(6, binaryTree2, binaryTree4);
        BinaryTree binaryTree7 = new BinaryTree(7, binaryTree5, binaryTree6);
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
        BinaryTree binaryTree1 = new BinaryTree(1);
        BinaryTree binaryTree2 = new BinaryTree(2);
        BinaryTree binaryTree3 = new BinaryTree(3);
        BinaryTree binaryTree5 = new BinaryTree(5, binaryTree1, binaryTree3);
        BinaryTree binaryTree6 = new BinaryTree(6, binaryTree2, null);
        BinaryTree binaryTree7 = new BinaryTree(7, binaryTree5, binaryTree6);
        /*                  7
                        5       6
                     1    3   2
        */
        int height = binaryTree7.getHeight_callBinaryNodeMethod();
        assertEquals(3, height);
    }

    /**
     * Test fails here as well???
     */
    @Test
    public void postOrderBinaryTreeGetHeightNonBalancedTree()
    {
        BinaryTree binaryTree1 = new BinaryTree(1);
        BinaryTree binaryTree3 = new BinaryTree(3);
        BinaryTree binaryTree5 = new BinaryTree(5, binaryTree1, binaryTree3);
        BinaryTree binaryTree7 = new BinaryTree(7, binaryTree5, null);
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
        BinaryTree binaryTree = new BinaryTree();
        int height = binaryTree.getHeight_callBinaryNodeMethod();
        assertEquals(0,height);
    }

    
}