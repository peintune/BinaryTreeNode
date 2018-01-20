public class TreeNode(){

    private int value ;
    private TreeNode leftNode =  null;
    private TreeNode rightNode = null;
    private String path = "";

    public TreeNode(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

    public TreeNode getLeftNode(){
        return this.leftNode;
    }

    public TreeNode getRightNode(){
        return this.rightNode;
    }

    public void setRightNode(TreeNode rightNode){
        this.rightNode = rightNode;
    }

    public void setLeftNode(TreeNode leftNode){
        this.leftNode = leftNode;
    }

    public boolean hasLeftNode(){
        if(null != leftNode){
            return true;
        }
        return false;
    }

    public boolean hasRightNode(){
        if(null != rightNode){
            return true;
        }
        return false;
    }

    public String getPath(){
        return this.path;
    }

    public void appendPath(String parentPath){
        this.path =parentPath+"->" + getValue();
    }
}
