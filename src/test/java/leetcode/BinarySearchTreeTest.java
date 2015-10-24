package leetcode;

import ds.TreeNode;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Chethan on 10/24/15.
 */
public class BinarySearchTreeTest {

    @Test
    public void testIsValidBST() throws Exception {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        TreeNode tree = TreeNode.builder().val(6).
                left(TreeNode.builder().val(2).
                        left(TreeNode.builder().val(0).build()).
                        right(TreeNode.builder().val(4).build()).build()).
                right(TreeNode.builder().val(8).
                        left(TreeNode.builder().val(7).build()).
                        right(TreeNode.builder().val(9).build()).
                        build()).build();
        assertThat(binarySearchTree.isValidBST(tree)).isTrue();

        tree=TreeNode.builder().val(Integer.MIN_VALUE).
                right(TreeNode.builder().val(Integer.MAX_VALUE).
                        left(TreeNode.builder().val(Integer.MIN_VALUE).build()).
                        build()).build();
        assertThat(binarySearchTree.isValidBST(tree)).isFalse();
        tree=TreeNode.builder().val(Integer.MAX_VALUE).build();
        assertThat(binarySearchTree.isValidBST(tree)).isTrue();
    }
}