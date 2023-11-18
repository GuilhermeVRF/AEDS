/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaCircular;

/**
 *
 * @author guilh
 */
public class Item<T>{
    private Item<T> elementoAnterior;
    private T conteudo;
    private Item<T> elementoPosterior;
    
    public Item(T conteudo){
        this.elementoAnterior = null;
        this.conteudo = conteudo;
        this.elementoPosterior = null;
    }
    public Item(Item<T> elementoAnterior, T conteudo, Item<T> elementoPosterior){
        this.elementoAnterior = elementoAnterior;
        this.conteudo = conteudo;
        this.elementoPosterior = elementoPosterior;
    }
    
    public void setElementoAnterior(Item<T> elementoAnterior){
        this.elementoAnterior = elementoAnterior;
    }
    
    public Item<T> getElementoAnterior(){
        return this.elementoAnterior;
    }
    
    public void setConteudo(T conteudo){
        this.conteudo = conteudo;
    }
    
    public T getConteudo(){
        return this.conteudo;
    }
    
    public void setElementoPosterior(Item<T> elementoPosterior){
        this.elementoPosterior = elementoPosterior;
    }
    
    public Item<T> getElementoPosterior(){
        return this.elementoPosterior;
    }
    
    @Override
    public String toString(){
        return (String) this.conteudo;
    }
}
