package node;

public class MyBinarySearchTree {
    TreeNode root;

    public TreeNode getRoot() {
        return root;
    }
    public void insert(int data){
        TreeNode node = new TreeNode(data);
        if (root==null){
            root=node;
        }
        else {
            TreeNode temp =root;
            TreeNode parent = null;
            while (temp!=null) {
                parent = temp;
                if (node.getData() <= temp.getData()) {
                    temp = temp.getLeft();
                } else {
                    temp = temp.getRight();
                }
            }
            if(node.getData()<=parent.getData()){
                parent.setLeft(node);
            }
            else {
                parent.setRight(node);
            }

        }
    }
    //    tree search function
    public boolean search(int data){
        boolean responce = false;
        TreeNode temp = root;
        while (temp!=null) {
            if (temp.getData() == data) {
                responce = true;
                break;
            }
            else {
                if (data <=temp.getData()){
                    temp = temp.getLeft();
                }
                else {
                    temp = temp.getRight();
                }
            }
        }
        return responce;
    }
    public void treversePreOrder(TreeNode node){
        if (node!=null){
            System.out.print(node.getData()+", ");
            treversePreOrder(node.getLeft());
            treversePreOrder(node.getRight());
        }
    }
    public void treverseInOrder(TreeNode node){
        if (node!=null){
            treverseInOrder(node.getLeft());
            System.out.print(node.getData()+" ,");
            treverseInOrder(node.getRight());
        }
    }
    public void treversePostOrder(TreeNode node){
        if (node!=null){
            treversePostOrder(node.getLeft());
            treversePostOrder(node.getRight());
            System.out.print(node.getData()+", ");
        }
    }

}


