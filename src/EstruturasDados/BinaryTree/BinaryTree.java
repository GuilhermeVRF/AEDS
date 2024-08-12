/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstruturasDados.BinaryTree;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
/**
 *
 * @author Guilherme
 * @param <T>
 */
public class BinaryTree<T extends Comparable<T>>{
    private Node<T> root;
    private int size;
    
    public BinaryTree(){
        this.root = null;
        this.size = 0;
    }
    
    /*
    *Checks if the Binary Tree is empty
    * return boolean - true if is Empty, false if not
    */
    public boolean isEmpty(){
        return this.size == 0;
    }
    
    /*
    * Returns the size of the tree
    * return boolean - true if is Empty, false if not
    */
    public int size(){
        return this.size;
    }
    
    /*
    * Function for the user use to call the recursive add function
    * param T content - The content to be added into the tree
    */
    public void add(T content){
        if(this.isEmpty()){
            this.root = new Node<>(content);
        }else{
            this.add(content, this.root);
        }
        
        this.size++;
    }
    
    /*
    * Returns the first Node of the tree
    * return Node<T>
    */
    public Node<T> getRoot(){
        return this.root;
    }
    
    /*
    * Adds a content into the Binary Tree
    * param T content - The content to be added into the tree
    * param Node<T> actualNode - The current node in the binary tree from the binary search
    */
    private void add(T content, Node<T> actualNode){
        actualNode.setAccessNumber(actualNode.getAccessNumber() + 1);
        if(content.compareTo(actualNode.getContent()) == -1){
            if(actualNode.getLeftNode() == null){
                actualNode.setLeftNode(new Node<>(content));
            }else{
                this.add(content, actualNode.getLeftNode());
            }
        }else{
            if(actualNode.getRigthNode() == null){
                actualNode.setRigthNode(new Node<>(content));
            }else{
                this.add(content, actualNode.getRigthNode());
            }
        }
    }

    private Node<T> remove(Node<T> actualNode, T target){
        if(actualNode == null) return actualNode;
        
        actualNode.setAccessNumber(actualNode.getAccessNumber() + 1);
        if(actualNode.getContent().compareTo(target) == -1)
            actualNode.setLeftNode(this.remove(actualNode.getLeftNode(), target));
        else if(actualNode.getContent().compareTo(target) == 1)
            actualNode.setRigthNode(this.remove(actualNode.getRigthNode(), target));
        else{
            if(actualNode.getLeftNode() == null) 
                return actualNode.getRigthNode();
            else if(actualNode.getRigthNode() == null)
                return actualNode.getLeftNode();
            else{
                T substitute = this.min(actualNode.getRigthNode());
                actualNode.setContent(substitute);
                actualNode.setRigthNode(this.remove(actualNode.getRigthNode(), substitute));
            }
        }
        
        return null;
    }
    
    private T min(Node<T> actualNode){
        while(actualNode.getLeftNode() != null){
            actualNode.setAccessNumber(actualNode.getAccessNumber() + 1);
            actualNode = actualNode.getLeftNode();
        }
        
        return actualNode.getContent();
    }
    
    public void stack_preOrder(){
        Stack<Node<T>> calls = new Stack<>();
        calls.push(this.root);
        Node<T> poppedNode = null;
        while(!calls.isEmpty()){
            poppedNode = calls.pop();
            System.out.println(poppedNode);
            
            if(poppedNode.getRigthNode() != null) calls.push(poppedNode.getRigthNode());
            if(poppedNode.getLeftNode() != null) calls.push(poppedNode.getLeftNode());
        }
    }
    
    public void linkedList_preOrder(){
        List<Node<T>> calls = new LinkedList<>();
        calls.add(this.root);
        Node<T> poppedNode = null;
        while(!calls.isEmpty()){
            poppedNode = calls.remove(0);
            System.out.println(poppedNode);
            
            if(poppedNode.getRigthNode() != null) calls.add(0,poppedNode.getRigthNode());
            if(poppedNode.getLeftNode() != null) calls.add(0,poppedNode.getLeftNode());
        }
    }
    
    /*
    * Search for a content into the Binary Tree
    * param T content - The content to be searched in the tree
    * return boolean - true if it was found, false if not
    */
    public boolean contains(T content){
        return this.search(content, this.root) != null;
    }
    
    /*
    * Recursive function for get a Node to a specific content
    * param T content - The content to be searched in the tree
    * param Node<T> actualNode - The current node in the binary tree from the binary search
    * return Node<T> - A node if it was found, null if not
    */
    private Node<T> search(T content, Node<T> actualNode){
        if(actualNode == null){
            return null;
        }
        
        actualNode.setAccessNumber(actualNode.getAccessNumber() + 1);
        if(content.compareTo(actualNode.getContent()) == 0){
            return actualNode;
        }else if(content.compareTo(actualNode.getContent()) > 0){
            actualNode = actualNode.getRigthNode();
        }else{
            actualNode = actualNode.getLeftNode();
        }
        
        return this.search(content, actualNode);
    }
    
    /*
    * Function for the user use to call the recursive inOrder function
    */
    public void inOrder(){
        this.inOrder(this.root);
    }
    
    /*
    * Print the binary tree in ascending order recursively
    */
    private void inOrder(Node<T> actualNode){      
        if(actualNode == null){
            return;
        }

        this.inOrder(actualNode.getLeftNode());
        System.out.print(actualNode.toString() + " ");
        this.inOrder(actualNode.getRigthNode());
    }
    
    /*
    * Function for the user use to call the recursive posOrder function
    */
    public void posOrder(){
        this.posOrder(this.root);
    }
    
    /*
    * Print the binary tree in descending order recursively
    */
    private void posOrder(Node<T> actualNode){
        if(actualNode == null){
            return;
        }
        
        this.posOrder(actualNode.getRigthNode());
        System.out.print(actualNode.toString() + " ");
        this.posOrder(actualNode.getLeftNode());
    }
    
    /*
    * Function for the user use to call the recursive preOrder function
    */
    public void preOrder(){
        this.preOrder(this.root);
    }
    
    /*
    * Print the parente first, and after the sons of a binary tree recursively
    */
    private void preOrder(Node<T> actualNode){
        if(actualNode == null){
            return;
        }
        
        System.out.print(actualNode.toString() + " ");
        this.preOrder(actualNode.getLeftNode());
        this.preOrder(actualNode.getRigthNode());
    }
    
    /*
    * Function for the user use to call the recursive getSucessor function
    */
    public T getSucessor(T targetValue){
        return this.getSucessor(this.root, targetValue, null);
    }
    
    /*
    * Recursive function for get a sucessor to a specific content
    * param T content - The content to be used for find it's sucessor in the tree
    * param Node<T> actualNode - The current node in the binary tree from the binary search
    * return T - The sucessor content if it was found, null if not
    */
    private T getSucessor(Node<T> actualNode, T targetValue, T sucessorValue){       
        if(actualNode == null){
            return sucessorValue;
        }
        
        if(actualNode.getContent().compareTo(targetValue) == 1){
            return this.getSucessor(actualNode.getLeftNode(), targetValue, actualNode.getContent());
        }else{
            return this.getSucessor(actualNode.getRigthNode(), targetValue, sucessorValue);
        }           
    }
    
    /*
    * Function for the user use to call the recursive getGreater function
    */
    public T getGreater(T targetValue){
        Node<T> targetNode = this.search(targetValue, this.root);
        return this.getGreater(targetValue, targetNode);
    }
    
    /*
    * Recursive function for get the greater value to a specific content
    * param T content - The content to be used for find it's sucessor in the tree
    * param Node<T> actualNode - The current node in the binary tree from the binary search
    * return T - The greater content if it was found, null if not
    */
    private T getGreater(T targetValue, Node<T> actualNode){
        if(actualNode == null){
            return null;
        }
        
        if(actualNode.getRigthNode() == null && actualNode.getContent().compareTo(targetValue) == 1){
            return actualNode.getContent();
        }
        
        return this.getGreater(targetValue, actualNode.getRigthNode());
    }
}
