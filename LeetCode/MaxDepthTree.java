class Solution {
    public int maxDepth(TreeNode root) {
        //recursively go through our tree
        //if the root is null we have reached a null child and return 0.
        if(root == null)
          return 0;
        //iterate through the left child
        int left = maxDepth(root.left);
        //iterate through the right child
        int right = maxDepth(root.right);
        //return the max of the two numbers and add 1 to denote a level of the tree.
        return Math.max(left, right) + 1;
    }
}
