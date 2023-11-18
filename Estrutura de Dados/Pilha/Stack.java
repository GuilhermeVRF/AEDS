/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pilha;

/**
 *
 * @author guilh
 */
public class Stack<T> {
    private Item<T> top;
    private int size;
    
    public Stack(){
        this.top = null;
        this.size = 0;
    }
    
    public boolean isEmpty(){
        return this.top == null; 
    }
    
    public Item<T> top(){
        return this.top;
    }
    
    public void push(T elemento){
        Item<T> ponteiro = this.top;
        this.top = new Item<T>(elemento, ponteiro);
        this.size++;
    }
    
    public Item<T> pop(){
        if(!this.isEmpty()){
            Item<T> topPopped = this.top;
            this.top = this.top.getProximoItem();
            this.size--;
            return topPopped;
        }else{
            return null;
        }    
    }
    
    @Override
    public String toString(){
        Item<T> ponteiro = this.top;
        String pilha = "";
        if(!this.isEmpty()){
            do{
                pilha += ponteiro.toString() + "\n";
                ponteiro = ponteiro.getProximoItem();
            }while(ponteiro != null);
        }else{
            pilha = "Pilha vazia!";
        }
        return pilha;
    }
}
