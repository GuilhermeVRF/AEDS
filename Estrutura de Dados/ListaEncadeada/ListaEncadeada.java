/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaEncadeada;

/**
 *
 * @author guilh
 */
public class ListaEncadeada<T>{
    private Item<T> lista;
    private int size;
    
    public ListaEncadeada(){
        this.lista = null;
        this.size = 0;
    }
    
    public int size(){
        return this.size;
    }
    
    public boolean isEmpty(){
        return this.lista == null;
    }
    
    public void add(T elemento){
        if(this.isEmpty()){
            this.lista = new Item<>(elemento);
        }else{
            Item<T> ponteiro = this.lista;
            for(int posLista = 0;posLista < this.size - 1; posLista++){
                ponteiro = ponteiro.getProximoItem();
            }
            ponteiro.setProximoItem(new Item<>(elemento));
        }   
        this.size++;
    }
    
    public void add(T elemento, int indice){
        this.checkIndex(indice);
        
        if(indice == 0){
            this.lista = new Item<>(elemento, this.lista);
        }else{
             Item<T> ponteiro = this.getNo(indice - 1);
            ponteiro.setProximoItem(new Item(elemento, ponteiro.getProximoItem()));
        }             
        this.size++;
    }
    
    public Item<T> remove(int indice){
        this.checkIndex(indice);
        
        Item<T> ponteiroAnterior = this.getNo(indice - 1);
        Item<T> ponteiroRemovido = ponteiroAnterior.getProximoItem();
        if(indice == 0){
            this.lista = this.lista.getProximoItem();
        }else{
            ponteiroAnterior.setProximoItem(ponteiroRemovido.getProximoItem());
        }
        this.size--;
        return ponteiroRemovido;
    }
    
    public T get(int indice){
        return this.getNo(indice).getElemento();
    }
    
    @Override
    public String toString(){
        String stringListaEncadeada = "";
        Item<T> ponteiro = this.lista;
        for(int posLista = 0; posLista < this.size; posLista++){
            stringListaEncadeada += (posLista + 1) + " - " +ponteiro + "\n";
            ponteiro = ponteiro.getProximoItem();
        }
        return stringListaEncadeada;
    }
    private Item<T> getNo(int indice){
        this.checkIndex(indice);
        
        Item<T> ponteiro = this.lista;
        for(int posLista = 0; posLista < indice; posLista++){
            ponteiro = ponteiro.getProximoItem();
        }
        return ponteiro;
    }    
    private void checkIndex(int indice){
        if(indice >= this.size || indice < 0){
            throw new IndexOutOfBoundsException();
        }
    }       
}
