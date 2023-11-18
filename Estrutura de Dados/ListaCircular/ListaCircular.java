/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaCircular;

/**
 *
 * @author guilh
 */
public final class ListaCircular<T>{
    private Item<T> head;
    private Item<T> tail;
    private int size;
    
    public ListaCircular(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public boolean isEmpty(){
        return this.size == 0;
    }
    
    public int size(){
        return this.size;
    }
    
    public void addHead(T conteudo){
        if(!this.inseriu_listaVazia(conteudo)){
            this.head = new Item(this.tail, conteudo, this.head);
            this.head.getElementoPosterior().setElementoAnterior(this.head);
            this.tail.setElementoPosterior(this.head);
            this.size++;
        }
    }
    
    public void addTail(T conteudo){
        if(!this.inseriu_listaVazia(conteudo)){
            this.tail = new Item(this.tail, conteudo, this.head);
            this.head.setElementoAnterior(this.tail);
            this.tail.getElementoAnterior().setElementoPosterior(this.tail);
            this.size++;
        }
    }
    
    public void add(T conteudo){
        this.addTail(conteudo);
    }
    
    public void add(int indice, T conteudo){
        Item<T> ponteiro = this.getNo(indice);
              
        if(ponteiro == this.head){
            this.addHead(conteudo);
        }else if(ponteiro == this.tail){
            this.addTail(conteudo);
        }else{
            Item<T> itemAdded = new Item(ponteiro.getElementoAnterior(), conteudo, ponteiro);
            ponteiro.setElementoAnterior(itemAdded);
            itemAdded.getElementoAnterior().setElementoPosterior(itemAdded);
            this.size++;
        }    
    }
    
    public void removeHead(){
        if(!this.isEmpty()){
            if(this.size == 1){
                this.head = null;
                this.tail = null;
            }else{
                this.head = this.head.getElementoPosterior();
                this.head.setElementoAnterior(this.tail);
                this.tail.setElementoPosterior(this.head);
            }
            this.size--;
        }
    }
    
    public void removeTail(){
        if(!this.isEmpty()){
            if(this.size == 0){
                this.head = null;
                this.tail = null;
            }else{
                this.tail = this.tail.getElementoAnterior();
                this.head.setElementoAnterior(this.tail);
                this.tail.getElementoAnterior().setElementoPosterior(this.tail);
            }
            this.size--;
        }
    }
    
    public void remove(int indice){
        Item<T> ponteiro = this.getNo(indice);
        
        if(ponteiro == this.head){
            this.removeHead();
        }else if(ponteiro == this.tail){
            this.removeTail();
        }else{
            ponteiro.getElementoAnterior().setElementoPosterior(ponteiro.getElementoPosterior());
            ponteiro.getElementoPosterior().setElementoAnterior(ponteiro.getElementoAnterior());
            this.size--;
        }
    }
    
    public void remove(T chave){
        Item<T> ponteiro = this.getNo(chave);
        
        if(ponteiro != null){
            if(ponteiro == this.head){  
                this.removeHead();
            }else if(ponteiro == this.tail){
                this.removeTail();
            }else{
                ponteiro.getElementoAnterior().setElementoPosterior(ponteiro.getElementoPosterior());
                ponteiro.getElementoPosterior().setElementoAnterior(ponteiro.getElementoAnterior());
                this.size--;
            }
        }    
    }
    public T get(int indice){
        return this.getNo(indice).getConteudo();
    }
    
    public boolean search(T chave){
        return this.getNo(chave) != null;
    }
    @Override
    public String toString(){
        if(!this.isEmpty()){
            String stringLista = "---Circle list by head---\n";
            Item<T> ponteiro = this.head;
            
            for(int posLista = 0; posLista < this.size; posLista++){
                stringLista += posLista + "|" + ponteiro + "\n";
                ponteiro = ponteiro.getElementoPosterior();
            }
            return stringLista;
        }else{
            return "Empty list!";
        }
    }
    
    public String stringByTail(){
        if(!this.isEmpty()){
            Item<T> ponteiro = this.tail;
            String stringLista = "---Circle list by tail---\n";
            for(int posLista = this.size -1; posLista >= 0; posLista--){
                stringLista += posLista + "|" + ponteiro + "\n";
                ponteiro = ponteiro.getElementoAnterior();
            }
            return stringLista;
        }else{
            return "Empty list!";
        }
        
    }
    private Item<T> getNo(int indice){
        this.validaIndice(indice);
        Item<T> ponteiro = this.head;
        
        for(int posLista = 0; posLista < indice; posLista++){
            ponteiro = ponteiro.getElementoPosterior();
        }
        return ponteiro;
    }
    
    private Item<T> getNo(T chave){
        Item<T> ponteiro = this.head;
        
        for(int posLista = 0; posLista < this.size; posLista++){
            if(ponteiro.getConteudo() == chave){
                return ponteiro;
            }
            ponteiro = ponteiro.getElementoPosterior();
        }
        return null;
    }
    private void validaIndice(int indice){
        if(indice < 0 || this.isEmpty()){
            throw new IndexOutOfBoundsException("Invalid index");
        }
    }
    private boolean inseriu_listaVazia(T conteudo){
        if(this.isEmpty()){
            this.head = new Item(conteudo);
            this.head.setElementoPosterior(this.head);
            this.head.setElementoAnterior(this.head);
            this.tail= this.head;
            this.size++;
            return true;
        }else{
            return false;
        }
    }
}
