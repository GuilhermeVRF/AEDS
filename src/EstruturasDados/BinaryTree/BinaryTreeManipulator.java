/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstruturasDados.BinaryTree;

/**
 *
 * @author Guilherme
 */
public class BinaryTreeManipulator {
    /*
    * Function for the user use to call the recursive isBinaryTreeEquals
    * @param BinaryTree<T> firstTree - The first tree to compare with the second
    * @param BinaryTree<T> secondTree - The second tree to compare with the first
    *
    * return boolean - true if it's equals, false if note
    */
    public static <T extends Comparable<T>> boolean isBinaryTreesEquals(BinaryTree firstTree, BinaryTree secondTree){
        return isBinaryTreesEquals(firstTree.getRoot(), secondTree.getRoot());
    }
    
    /*
    * Recursive function toe check if 2 trees are equals
    * @param Node<T> firstTre_node - Current first tree node
    * @param Node<T> secondTree_node - Current second tree node
    *
    * return boolean - true if it's equals, false if note
    */
    private static <T extends Comparable<T>> boolean isBinaryTreesEquals(Node<T> firstTree_node, Node<T> secondTree_node){
        if(firstTree_node == null && secondTree_node == null){
            return true;
        }
        
        if(firstTree_node == null || secondTree_node == null){
            return false;
        }
        
        if(firstTree_node.getContent().compareTo(secondTree_node.getContent()) != 0){
            return false;
        }   
        
        return isBinaryTreesEquals(firstTree_node.getLeftNode(), secondTree_node.getLeftNode())
            && isBinaryTreesEquals(firstTree_node.getRigthNode(), secondTree_node.getRigthNode());
    }
    
    /*
    * Function for the user use to call the recurvie isSubTree function
    *
    * @param BinaryTree - The larger binary tree.
    * @param BinaryTree - The potential subtree.
    * @return boolean - True if the given tree is a subtree of the larger tree, false otherwise.
    */
    public static <T extends Comparable<T>> boolean isSubTree(BinaryTree tree, BinaryTree subTree){
        Node<T> root = tree.searchNode(subTree.getRoot().getContent());
        if(root != null)
            return isSubTree(root, subTree.getRoot());
        else
            return false;
    }
    
    /*
    * Function used to discovery if a subTree is inside a Tree
    *
    * @param BinaryTree - The larger binary tree.
    * @param BinaryTree - The potential subtree.
    * @return boolean - True if the given tree is a subtree of the larger tree, false otherwise.
    */
    private static <T extends Comparable<T>> boolean isSubTree(Node<T> firstTree_node, Node<T> secondTree_node){
        return isBinaryTreesEquals(firstTree_node, secondTree_node);
    }
}
