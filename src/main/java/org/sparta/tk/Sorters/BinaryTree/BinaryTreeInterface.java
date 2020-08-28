package org.sparta.tk.Sorters.BinaryTree;

public interface BinaryTreeInterface {
    Node getRootElement();
    void addElement(int element);
    boolean findElement(int value);
    int[] getSortedTreeAsc();
    int[] getSortedTreeDesc();
}
