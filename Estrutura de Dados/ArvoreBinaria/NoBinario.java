/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArvoreBinaria;

/**
 *
 * @author guilh
 * @param <T>
 */
public class NoBinario<T extends Comparable<T>>{
    private T elemento;
    private NoBinario<T> noEsquerdo;
    private NoBinario<T> noDireito;
    
    public NoBinario(T elemento){
        this.elemento = elemento;
        this.noEsquerdo = null;
        this.noDireito = null;
    }
    
    public void setElemento(T elemento){
        this.elemento = elemento;
    }
    
    public T getElemento(){
        return this.elemento;
    }
    
    public void setNoEsquerdo(NoBinario<T> noEsquerdo){
        this.noEsquerdo = noEsquerdo;
    }
    
    public NoBinario<T> getNoEsquerdo(){
        return this.noEsquerdo;
    }
    
    public void setNoDireito(NoBinario<T> noDireito){
        this.noDireito = noDireito;
    }
    
    public NoBinario<T> getNoDireito(){
        return this.noDireito;
    }
    
    @Override
    public String toString(){
        return (String) this.elemento;
    }
}
