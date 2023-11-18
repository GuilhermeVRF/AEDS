/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaDuplamenteEncadeada;

/**
 *
 * @author guilh
 */
public class Item<T>{
    private Item<T> elementoAnterior;
    private Item<T> elementoPosterior;
    private T conteudo;
    
    public Item(T conteudo){
        this.elementoAnterior = null;
        this.conteudo = conteudo;
        this.elementoPosterior = null;
    }
    
    public Item(T conteudo, Item<T> elementoPosterior){
        this.elementoAnterior = null;
        this.conteudo = conteudo;
        this.elementoPosterior = elementoPosterior;
    }
    
    public Item(Item<T> elementoAnterior, T conteudo){
        this.elementoAnterior = elementoAnterior;
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
    
    public void setConteudo(T conteudo){
        this.conteudo = conteudo;
    }
    
    public void setElementoPosterior(Item<T> elementoPosterior){
        this.elementoPosterior = elementoPosterior;
    }
    
    public Item<T> getElementoAnterior(){
        return this.elementoAnterior;
    }
    
    public T getConteudo(){
        return this.conteudo;
    }
    
    public Item<T> getElementoPosterior(){
        return this.elementoPosterior;
    }
    
    @Override
    public String toString(){
        return (String) this.conteudo;
    }
}
