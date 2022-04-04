import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BinaryTreeTest
{
    @Test
    public void postOrderTraverseFullTree()
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
    public void postOrderTraverseCompleteTree()
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
    public void postOrderTraverseNonBalancedTree()
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
    public void postOrderTraverseFullTreeBinaryNodeMethod()
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
    public void postOrderTraverseCompleteTreeBinaryNodeMethod()
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
    public void postOrderTraverseNonBalancedTreeBinaryNodeMethod()
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
}