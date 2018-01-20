public class Test {
    public static void main(String[] args){

        TreeNode node5 = new TreeNode(5);

        TreeNode node2 = new TreeNode(2);
        node2.setRightNode(node5);

        TreeNode node3 = new TreeNode(3);

        TreeNode root = new TreeNode(1);
        root.setLeftNode(node2);
        root.setRightNode(node3);

        List<String> bTreePathsResult = Solution.iteratorPath(root);

        for(String path: bTreePathsResult){
            System.out.println(path);
        }

    }
}
