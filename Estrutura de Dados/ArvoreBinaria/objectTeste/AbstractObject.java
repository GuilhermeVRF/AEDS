/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArvoreBinaria.objectTeste;

/**
 *
 * @author guilh
 * @param <T>
 */
public abstract class AbstractObject<T> implements Comparable<T>{
    @Override
    /*O genérico é aceito aqui, pois a assinatura do método compareTo da Comparable aceita.*/
    public abstract int compareTo(T object);
    @Override
    /*O equals não pode receber uma variável genérica como parâmetro, uma vez que a classe que implementar
    a classe abstrata não consegue advinha qual o tipo do parâmetro.*/
    public abstract boolean equals(Object object);
    @Override
    public abstract int hashCode();
    @Override
    public abstract String toString();
}
