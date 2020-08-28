package org.sparta.tk.Sorters.BinaryTree;

import org.sparta.tk.Sorters.Sorter;

public class BinarySorter implements BinaryTreeInterface, Sorter {
    private final Node rootNode;
    private int[] sortedArray;
    private int count;
    private int numberOfNodes = 1;

    public BinarySorter(final int element) {
        rootNode = new Node(element);
    }

    @Override
    public Node getRootElement() {
        return rootNode;
    }

    @Override
    public void addElement(final int element) {
        addNodeToTree(rootNode, element);
    }

    private void addNodeToTree(Node node, int element) {
        if (element <= node.getValue()) {
            if (node.isLeftChildEmpty()) {
                node.setLeftChild(new Node(element));
                numberOfNodes++;
            } else {
                addNodeToTree(node.getLeftChild(), element);
            }
        } else if (node.isRightChildEmpty()) {
            node.setRightChild(new Node(element));
            numberOfNodes++;
        } else {
            addNodeToTree(node.getRightChild(), element);
        }
    }

    @Override
    public boolean findElement(final int value) {
        Node node = findNode(value);
        if (node != null) {
            return true;
        }
        return false;
    }
    private Node findNode(int element) {
        Node node = rootNode;
        while (node != null) {
            if (element == node.getValue()) {
                return node;
            }
            if (element < node.getValue()) {
                node = node.getLeftChild();
            } else {
                node = node.getRightChild();
            }
        }
        return null;
    }

    //Ascending
    @Override
    public int[] getSortedTreeAsc() {
        sortedArray = new int [numberOfNodes];
        count = 0;
        sortTreeAsc(rootNode);
        return sortedArray;
    }
    private void sortTreeAsc(Node node){
        if (!node.isLeftChildEmpty()){
            sortTreeAsc(node.getLeftChild());
        }
        sortedArray[count] = node.getValue();
        count++;
        if (!node.isRightChildEmpty()){
            sortTreeAsc(node.getRightChild());
        }
    }

    //Descending
    @Override
    public int[] getSortedTreeDesc() {
        sortedArray = new int [numberOfNodes];
        count = 0;
        sortTreeDesc(rootNode);
        return sortedArray;
    }
    private void sortTreeDesc(Node node){
        if (!node.isRightChildEmpty()){
            sortTreeDesc(node.getRightChild());
        }
        sortedArray[count] = node.getValue();
        count++;
        if (!node.isLeftChildEmpty()){
            sortTreeDesc(node.getLeftChild());
        }
    }

    @Override
    public int[] sortArray(int[] arrayToSort) {
        BinarySorter binarySorter = new BinarySorter(arrayToSort[0]);
        for(int i = 1; i< arrayToSort.length; i++){
            binarySorter.addElement(arrayToSort[i]);
        }
        int[] sortedArray = binarySorter.getSortedTreeAsc();
        return sortedArray;
    }
}
