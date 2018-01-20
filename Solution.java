public class Solution{
    static List<String> binaryTreePaths = new ArrayList<String>();
    
    public static List<String> iteratorPath(TreeNode node){
        pareseNode(node,null);
        return binaryTreePaths;
    }

    public static void pareseNode(TreeNode node,TreeNode parentNode) {

        if(null == parentNode){
            node.appendPath("");
        }else{
            node.appendPath(parentNode.getPath());
        }
        //leaf node
        if (!node.hasLeftNode() && !node.hasRightNode()) {
            binaryTreePaths.add( node.getPath());
        } else {

            if (node.hasLeftNode()) {
                pareseNode(node.getLeftNode(),node);
            }

            if (node.hasRightNode()) {
                pareseNode(node.getRightNode(),node);
            }
        }
    }
    
}
