/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstruturaDeDados.LinkedLista_Circular;

/**
 *
 * @author guilh
 */
public class Item<G> {
    protected G elemento;
    protected Item proximoElemento;
    
    public Item(G elemento, Item<G> proximoElemento){
        this.elemento = elemento;
        this.proximoElemento = proximoElemento;
    }
}
