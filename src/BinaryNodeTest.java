import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BinaryNodeTest
{
    BinaryNode<Integer> binaryNode1 = new BinaryNode<>(1);
    BinaryNode<Integer> binaryNode2 = new BinaryNode<>(2);
    BinaryNode<Integer> binaryNode3 = new BinaryNode<>(3);
    BinaryNode<Integer> binaryNode4 = new BinaryNode<>(4);

    @Test
    public void postOrderBinaryNodeTraverseFullTree()
    {
        BinaryNode<Integer> binaryNode5 = new BinaryNode<>(5, binaryNode1, binaryNode3);
        BinaryNode<Integer> binaryNode6 = new BinaryNode<>(6, binaryNode2, binaryNode4);
        BinaryNode<Integer> binaryNode7 = new BinaryNode<>(7, binaryNode5, binaryNode6);
        /*                  7
                        5       6
                     1    3   2    4
        */
        binaryNode7.postorderTraverse_binaryNodeMethod();
        // Output should be 1, 3, 5, 2, 4, 6, 7
    }

    @Test
    public void postOrderBinaryNodeTraverseCompleteTree()
    {
        BinaryNode<Integer> binaryNode5 = new BinaryNode<>(5, binaryNode1, binaryNode3);
        BinaryNode<Integer> binaryNode6 = new BinaryNode<>(6, binaryNode2, null);
        BinaryNode<Integer> binaryNode7 = new BinaryNode<>(7, binaryNode5, binaryNode6);
        /*                  7
                        5       6
                     1    3   2
        */
        binaryNode7.postorderTraverse_binaryNodeMethod();
        // Output should be 1, 3, 5, 2, 6, 7
    }

    @Test
    public void postOrderBinaryNodeTraverseNonBalancedTree()
    {
        BinaryNode<Integer> binaryNode5 = new BinaryNode<>(5, binaryNode1, binaryNode3);
        BinaryNode<Integer> binaryNode7 = new BinaryNode<>(7, binaryNode5, null);
        /*                  7
                        5
                     1    3
        */
        binaryNode7.postorderTraverse_binaryNodeMethod();
        // Output should be 1, 3, 5, 7
    }

    @Test
    public void postOrderBinaryNodeTraverseEmptyTree()
    {
        BinaryNode<Integer> binaryNode5 = new BinaryNode<>();
        binaryNode5.postorderTraverse_binaryNodeMethod();
        // Output should be
    }

    @Test
    public void postOrderBinaryNodeGetHeightFullTree()
    {
        BinaryNode<Integer> binaryNode5 = new BinaryNode<>(5, binaryNode1, binaryNode3);
        BinaryNode<Integer> binaryNode6 = new BinaryNode<>(6, binaryNode2, binaryNode4);
        BinaryNode<Integer> binaryNode7 = new BinaryNode<>(7, binaryNode5, binaryNode6);
        /*                  7
                        5       6
                     1    3   2    4
        */
        int height = binaryNode7.getHeight_binaryNodeMethod();
        assertEquals(3, height);
    }

    @Test
    public void postOrderBinaryNodeGetHeightCompleteTree()
    {
        BinaryNode<Integer> binaryNode5 = new BinaryNode<>(5, binaryNode1, binaryNode3);
        BinaryNode<Integer> binaryNode6 = new BinaryNode<>(6, binaryNode2, null);
        BinaryNode<Integer> binaryNode7 = new BinaryNode<>(7, binaryNode5, binaryNode6);
        /*                  7
                        5       6
                     1    3   2
        */
        int height = binaryNode7.getHeight_binaryNodeMethod();
        assertEquals(3, height);
    }

    @Test
    public void postOrderBinaryNodeGetHeightNonBalancedTree()
    {
        BinaryNode<Integer> binaryNode5 = new BinaryNode<>(5, binaryNode1, binaryNode3);
        BinaryNode<Integer> binaryNode7 = new BinaryNode<>(7, binaryNode5, null);
        /*                  7
                        5
                     1    3
        */
        int height = binaryNode7.getHeight_binaryNodeMethod();
        assertEquals(3, height);
    }

    /*
    Currently returns 1 instead of 0
     */
    @Test
    public void postOrderBinaryNodeGetHeightEmptyTree()
    {
        BinaryNode<Integer> binaryNode5 = new BinaryNode<>();
        int height = binaryNode5.getHeight_binaryNodeMethod();
        assertEquals(0, height);
    }

    @Test
    public void postOrderBinaryNodeGetNodeFullTree()
    {
        BinaryNode<Integer> binaryNode5 = new BinaryNode<>(5, binaryNode1, binaryNode3);
        BinaryNode<Integer> binaryNode6 = new BinaryNode<>(6, binaryNode2, binaryNode4);
        BinaryNode<Integer> binaryNode7 = new BinaryNode<>(7, binaryNode5, binaryNode6);
        /*                  7
                        5       6
                     1    3   2    4
        */
        int nodes = binaryNode7.getNumberOfNodes_binaryNodeMethod();
        assertEquals(7, nodes);
    }

    @Test
    public void postOrderBinaryNodeGetNodeCompleteTree()
    {
        BinaryNode<Integer> binaryNode5 = new BinaryNode<>(5, binaryNode1, binaryNode3);
        BinaryNode<Integer> binaryNode6 = new BinaryNode<>(6, binaryNode2, null);
        BinaryNode<Integer> binaryNode7 = new BinaryNode<>(7, binaryNode5, binaryNode6);
        /*                  7
                        5       6
                     1    3   2
        */
        int nodes = binaryNode7.getNumberOfNodes_binaryNodeMethod();
        assertEquals(6, nodes);
    }

    @Test
    public void postOrderBinaryNodeGetNodeNonBalancedTree()
    {
        BinaryNode<Integer> binaryNode5 = new BinaryNode<>(5, binaryNode1, binaryNode3);
        BinaryNode<Integer> binaryNode7 = new BinaryNode<>(7, binaryNode5, null);
        /*                  7
                        5
                     1    3
        */
        int nodes = binaryNode7.getNumberOfNodes_binaryNodeMethod();
        assertEquals(4, nodes);
    }

    /*
    Currently returns 1 instead of 0
     */
    @Test
    public void postOrderBinaryNodeGetNodeEmptyTree()
    {
        BinaryNode<Integer> binaryNode5 = new BinaryNode<>();
        int nodes = binaryNode5.getNumberOfNodes_binaryNodeMethod();
        assertEquals(0, nodes);
    }
}