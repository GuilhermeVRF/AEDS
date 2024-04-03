/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstruturasDados.ArvoreBinaria;

/**
 *
 * @author Guilherme
 * @param <E>
 */
public class Item<E extends Comparable<E>>{
    private Item<E> noEsquerdo;
    private final E conteudo;
    private Item<E> noDireito;
    
    public Item(E conteudo){
        this.noEsquerdo = null;
        this.conteudo = conteudo;
        this.noDireito = null;
    }
    
    public void setNoEsquerdo(Item<E> noEsquerdo){
        this.noEsquerdo = noEsquerdo;
    }
    
    public Item<E> getNoEsquerdo(){
        return this.noEsquerdo;
    }
    
    public void setNoDireito(Item<E> noDireito){
        this.noDireito = noDireito;
    }
    
    public Item<E> getNoDireito(){
        return this.noDireito;
    }
    
    public E getConteudo(){
        return this.conteudo;
    }
    
    @Override
    public String toString(){
        return conteudo.toString();
    }
        
}
