/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaEncadeada;

/**
 *
 * @author guilh
 */
public class Item<T>{
    private T elemento;
    private Item<T> proximoItem;
    
    public Item(T elemento, Item<T> proximoItem){
        this.elemento = elemento;
        this.proximoItem = proximoItem;
    }
    
    public Item(T elemento){
        this.elemento = elemento;
        this.proximoItem = null;
    }
    
    public void setElemento(T elemento){
        this.elemento = elemento;
    }
    
    protected void setProximoItem(Item<T> proximoItem){
        this.proximoItem = proximoItem;
    }
    
    public T getElemento(){
        return this.elemento;
    }
    
    public Item<T> getProximoItem(){
        return this.proximoItem;
    }
    
    @Override
    public String toString(){
        return (String) elemento;
    }
}
