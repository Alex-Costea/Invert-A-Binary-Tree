class BinaryTree
{
    int value;
    BinaryTree left=null;
    BinaryTree right=null;
    BinaryTree(int value)
    {
        this.value=value;
    }

    BinaryTree(BinaryTree left, BinaryTree right)
    {
        this.left=left;
        this.right=right;
    }

    private static void swap(BinaryTree tree)
    {
        BinaryTree temp=tree.left;
        tree.left=tree.right;
        tree.right=temp;
    }

    static void invert(BinaryTree tree)
    {
        if(tree==null) return;
        swap(tree);
        invert(tree.left);
        invert(tree.right);
    }

    public String toString()
    {
        if(left==null && right==null) return ""+value;
        return "{"+ (left==null?"":left) + "," + (right==null?"":right)+"}";
    }
}

public class Main {
    public static void main(String[] args) {
        BinaryTree myTree= new BinaryTree(new BinaryTree(new BinaryTree(1),new BinaryTree(2)),new BinaryTree(3));
        System.out.println(myTree);
        BinaryTree.invert(myTree);
        System.out.println(myTree);
    }
}