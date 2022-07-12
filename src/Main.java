class BinaryTree
{
    int value;
    BinaryTree left;
    BinaryTree right;
    BinaryTree(int value)
    {
        this.value=value;
    }

    BinaryTree(BinaryTree left, BinaryTree right)
    {
        this.left=left;
        this.right=right;
    }

    BinaryTree(int left,int right)
    {
        this(new BinaryTree(left),new BinaryTree(right));
    }

    private static void swapLeftRight(BinaryTree tree)
    {
        BinaryTree temp=tree.left;
        tree.left=tree.right;
        tree.right=temp;
    }

    static void invert(BinaryTree tree)
    {
        if(tree==null) return;
        swapLeftRight(tree);
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
        BinaryTree myTree= new BinaryTree(new BinaryTree(1,2),new BinaryTree(3));
        System.out.println(myTree);
        BinaryTree.invert(myTree);
        System.out.println(myTree);
    }
}