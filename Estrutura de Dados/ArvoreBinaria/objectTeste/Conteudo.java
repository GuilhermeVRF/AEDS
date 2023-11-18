/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArvoreBinaria.objectTeste;

/**
 *
 * @author guilh
 */
public class Conteudo extends AbstractObject<Conteudo>{
    Integer numero;
    String palavra;
    
    public Conteudo(){
        this.numero = 0;
        this.palavra = null;
    }
    
    public Conteudo(Integer numero, String palavra){
        this.numero = numero;
        this.palavra = palavra;
    }
    
    public Conteudo(Integer numero){
        this.numero = numero;
        this.palavra = null;
    }
    public Conteudo(String palavra){
        this.numero = 0;
        this.palavra = palavra;
    }
    
    @Override
    public boolean equals(Object outroConteudo){
        return (this == outroConteudo);
    }
    
    @Override
    public int hashCode(){
        return (this.numero.hashCode() + this.palavra.hashCode()) * 10;
    }
    
    @Override
    public int compareTo(Conteudo outroConteudo){
        if(this.numero == outroConteudo.numero){
            if(this.palavra.compareTo(outroConteudo.palavra) > 0){
                return 1;
            }else{
                return -1;
            }
        }else if(this.numero > outroConteudo.numero){
            return 1;
        }else{
            
            return -1;
        }
    }
    
    public String toString(){
        return this.numero + this.palavra;
    }
}
