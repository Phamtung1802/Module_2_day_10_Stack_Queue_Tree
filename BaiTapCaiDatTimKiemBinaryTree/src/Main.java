public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(60);
        root.left = new TreeNode(55);
        root.right = new TreeNode(100);
        root.right.right=new TreeNode(120);
        root.left.left=new TreeNode(40);
        root.left.right=new TreeNode(45);
        System.out.println(root.getSide(45));
        root.displayInOrder(root);
        System.out.println(" ");
        root.displayPostOrder(root);
    }
}
