/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstruturasDados.BinaryTree;

import EstruturasDados.BinaryTree.Node.AccessNumberComparator;

/**
 *
 * @author Guilherme
 */
public class RearrangeBinaryTree<T extends Comparable<T>> {
    private Node<T> oldBT_root;
    private BinaryTree rearrangedBinaryTree;
    AccessNumberComparator accessNumberComparator;
    
    public RearrangeBinaryTree(Node<T> oldBT_root){
        this.oldBT_root = oldBT_root;
        this.rearrangedBinaryTree = new BinaryTree();
        this.accessNumberComparator = new AccessNumberComparator();
    }
    
    public void rearrange(){
        if(this.oldBT_root != null){         
            rearrangedBinaryTree.root = this.getGreaterAccessNumber(this.oldBT_root);

            this.rearrange(this.oldBT_root);
            rearrangedBinaryTree.inOrder();
        }     
    } 
    
    private void rearrange(Node<T> oldBT_actualNode){
        if(oldBT_actualNode == null) return;
           
        this.rearrange(oldBT_actualNode.getLeftNode());
        this.addByAcessNumber(oldBT_actualNode, rearrangedBinaryTree.root);
        this.rearrange(oldBT_actualNode.getRigthNode());
    }
    
    private void addByAcessNumber(Node<T> oldBT_actualNode, Node<T> actualNode){
        System.out.println(actualNode);
        if(accessNumberComparator.compare(actualNode.getAccessNumber(), oldBT_actualNode.getAccessNumber()) == -1){
            if(actualNode.getRigthNode() == null) 
                actualNode.setRigthNode(oldBT_actualNode);
            else 
                this.addByAcessNumber(oldBT_actualNode, actualNode.getRigthNode());
        }else{
            if(actualNode.getLeftNode() == null) 
                actualNode.setLeftNode(oldBT_actualNode);
            else 
                this.addByAcessNumber(oldBT_actualNode, actualNode.getLeftNode());
        }
    }
    
    private Node<T> getGreaterAccessNumber(Node<T> actualNode){
        if(actualNode == null) return null;
        
        Node<T> greaterLeft = this.getGreaterAccessNumber(actualNode.getLeftNode());
        Node<T> greaterRight = this.getGreaterAccessNumber(actualNode.getRigthNode());
        
        Node<T> greater = actualNode;
        if(greaterLeft != null && greaterLeft.getAccessNumber() > greater.getAccessNumber())
            greater = greaterLeft;
        
       if(greaterRight != null && greaterRight.getAccessNumber() > greater.getAccessNumber())
           greater = greaterRight;
       
       return greater;       
    }
}
