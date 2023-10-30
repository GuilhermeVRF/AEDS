/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author guilh
 */
public class Item<G> {
    protected G dado;
    protected Item<G> proximoElemento;
    
    public Item(G dado, Item<G> proximoElemento){
        this.dado = dado;
        this.proximoElemento = proximoElemento;
    }
}
