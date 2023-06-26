import java.util.ArrayList;

public class TreeNode02 {

    public Object data;
    public ArrayList<TreeNode> children;

    public TreeNode(Object data) {
        this.data = data;
        this.children = new ArrayList<TreeNode>();
    }

    // addChild() method with parameter TreeNode child
    public void addChild(TreeNode child) {
        this.children.add(child);
    }

    // addChild() method with parameter Object data
    public void addChild(Object childData) {
        this.children.add(new TreeNode(childData));
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(20);
        // Add first child below
        root.addChild(15);
        // Print size of root's chilren
        System.out.println(root.children.size());
        // Add second child below
        TreeNode biggerChild = new TreeNode(30);
        root.addChild(biggerChild);

        System.out.println(root.children.size());

    }
}