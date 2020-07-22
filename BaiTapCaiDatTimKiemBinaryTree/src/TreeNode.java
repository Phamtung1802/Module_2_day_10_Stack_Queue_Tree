
class TreeNode {
    protected Integer element;
    protected TreeNode left;
    protected TreeNode right;


    public TreeNode(Integer integer) {
        element = integer;
        this.left=null;
        this.right=null;
    }

    public boolean search(Integer element) {
        TreeNode current = this;
        while (current != null) {
            if (element < current.element) {
                current = current.left;
                System.out.println("left");
            } else if (element > current.element) {
                current = current.right;
                System.out.println("right");
            } else
                return true;
        }
        return false;
    }


    public String getSide(Integer value){
        if(this.search(value)==true){
            return "Found";
        }
        else return "Not Found";
    }
    public void displayInOrder(TreeNode root){
        if(root!=null){
            displayInOrder(root.left);
            System.out.print(" " + root.element);
            displayInOrder(root.right);
        }
    }
    public void displayPostOrder(TreeNode root){
        if(root!=null){
            displayInOrder(root.left);
            displayInOrder(root.right);
            System.out.print(" " + root.element);

        }
    }

}



