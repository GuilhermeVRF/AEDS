/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstruturasDados.BinaryTree;

/**
 *
 * @author Guilherme
 * @param <T>
 */
public class Node<T extends Comparable<T>>{
    private Node<T> leftNode;
    private T content;
    private Node<T> rigthNode;
    
    public Node(T content){
        this.leftNode = null;
        this.content = content;
        this.rigthNode = null;
    }
    
    public void setLeftNode(Node<T> leftNode){
        this.leftNode = leftNode;
    }
    
    public Node<T> getLeftNode(){
        return this.leftNode;
    }
    
    public void setRigthNode(Node<T> rigthNode){
        this.rigthNode = rigthNode;
    }
    
    public Node<T> getRigthNode(){
        return this.rigthNode;
    }
    
    public T getContent(){
        return this.content;
    }
    
    public void setContent(T content){
        this.content = content;
    }
    
    @Override
    public String toString(){
        return content.toString();
    }
}
