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
public final class ArvoreBinaria<T extends Comparable<T>>{
    private NoBinario<T> raiz;
    private int size;
    
    public ArvoreBinaria(){
        this.raiz = null;
        this.size = 0;
    }
    
    public void add(T conteudo){
        NoBinario<T> novoNo = new NoBinario(conteudo);
        this.raiz = this.add(this.raiz, novoNo);
        this.size++;
    }
    
    public void remove(T conteudo){
        NoBinario<T> noRemover = this.raiz;
        NoBinario<T> filho;
        NoBinario<T> pai = null;
        
        while(noRemover != null && !(conteudo.compareTo(noRemover.getElemento()) == 0)){
            pai = noRemover;
            if(conteudo.compareTo(noRemover.getElemento()) < 0){
                noRemover = noRemover.getNoEsquerdo();
            }else{
                noRemover = noRemover.getNoDireito();
            }
        }
        
        if(noRemover != null){
            //Esse if é para caso o Nó a ser removido seja nulo.
            if(noRemover == this.raiz){
                if(noRemover.getNoEsquerdo() == null){
                    this.raiz = this.raiz.getNoDireito();
                }else if(noRemover.getNoDireito() == null){
                    this.raiz = this.raiz.getNoEsquerdo();
                }else{
                    //Esse for é responsável por pegar o maior elemento da sub-árvore a esquerda da raiz.
                    for(pai = this.raiz, filho = noRemover.getNoEsquerdo(); filho.getNoDireito()!= null; pai = filho, filho = filho.getNoDireito()){
                    }
                    //Após encontrado, a raiz passa a ter o maior valor do lado esquerdo como seu novo valor.
                    this.raiz.setElemento(filho.getElemento());
                    //E o maior elemento da esquerda é removido, visto que foi mudado de lugar.
                    pai.setNoDireito(null);
                }
            /*Esse null-pointe nunca ocorrerá, visto que a variável pai só será nula quando o elemento a 
              ser removido for a raiz, e já existe um if para isso.*/
            
            /*Esse primeiro bloco de if é para caso o nó a ser removido tenha seu nó esquerdo como nulo.
            Se for nulo, o programa irá checar se o nó a ser removido está a direita ou a esquerda do pai.*/
            }else if(noRemover.getNoEsquerdo() == null){
                if(pai.getNoEsquerdo() == noRemover){
                    pai.setNoEsquerdo(noRemover.getNoDireito());
                }else{
                    pai.setNoDireito(noRemover.getNoDireito());
                }           
            }else if(noRemover.getNoDireito() == null){
                if(pai.getNoDireito() == noRemover){
                    pai.setNoDireito(noRemover.getNoEsquerdo());
                }else{
                    pai.setNoEsquerdo(noRemover.getNoEsquerdo());
                }
                pai.setNoEsquerdo(noRemover.getNoEsquerdo());
            }else{
                for(pai = noRemover, filho = noRemover.getNoEsquerdo(); filho.getNoDireito() != null; pai = filho,  filho = filho.getNoDireito()){
                    
                }
                noRemover.setElemento(filho.getElemento());
                if(filho != noRemover.getNoEsquerdo()){             
                    pai.setNoDireito(null);
                }else{
                    noRemover.setNoEsquerdo(filho.getNoEsquerdo());
                }
                
            }   
        }
    }
    
    private NoBinario<T> add(NoBinario<T> noAtual, NoBinario<T> novoNo){
        if(noAtual == null){            
            return novoNo;
        }
        //Se for igual a -1, quer dizer que o novo Elemento é menor que o atual, então irá a esquerda.
        if(novoNo.getElemento().compareTo(noAtual.getElemento()) < 0){
            noAtual.setNoEsquerdo(this.add(noAtual.getNoEsquerdo(), novoNo));
        }
        //Senão quer dizer que o novo Elemento é maior o igual ao atual, sendo assim irá para a direita;
        else{
            noAtual.setNoDireito(this.add(noAtual.getNoDireito(), novoNo));
        }
        return noAtual;
    }
    
    public void inOrder(){
        System.out.println("In-Order: ");
        this.inOrder(this.raiz);
    }
    
    public boolean search(T conteudo){
        return this.search(this.raiz, conteudo);
    }
    
    private boolean search(NoBinario<T> noAtual, T conteudo){
        if(noAtual == null){
            return false;
        }
        if(conteudo.compareTo(noAtual.getElemento()) == 0){
            return true;
        }else if(conteudo.compareTo(noAtual.getElemento()) < 0){
            noAtual = noAtual.getNoEsquerdo();
        }else if(conteudo.compareTo(noAtual.getElemento()) > 0){
            noAtual = noAtual.getNoDireito();
        }
        return this.search(noAtual, conteudo);
    }
    
    private NoBinario<T> searchNo(NoBinario<T> noAtual, T conteudo){
        if(noAtual == null){
            return null;
        } 
        if(conteudo.compareTo(noAtual.getElemento()) == 0){
            return noAtual;
        }else if (conteudo.compareTo(noAtual.getElemento()) < 0){
            noAtual = noAtual.getNoEsquerdo();
        }else if (conteudo.compareTo(noAtual.getElemento()) > 0){
            noAtual = noAtual.getNoDireito();
        }
        return this.searchNo(noAtual, conteudo);
    }
    private void inOrder(NoBinario<T> noAtual){
        if(noAtual != null){
            this.inOrder(noAtual.getNoEsquerdo());
            System.out.print(noAtual.getElemento() + " ");
            this.inOrder(noAtual.getNoDireito());
        }
    }
    
    public void posOrder(){
        System.out.println("Pos-Order: ");
        this.posOrder(this.raiz);
    }
    
    private void posOrder(NoBinario<T> noAtual){
        if(noAtual != null){
            this.posOrder(noAtual.getNoEsquerdo());
            this.posOrder(noAtual.getNoDireito());
            System.out.print(noAtual.getElemento() + " ");
        }
    }
    
    public void preOrder(){
        System.out.println("Pre-Order: ");
        this.preOrder(this.raiz);
    }
    
    private void preOrder(NoBinario<T> noAtual){
        if(noAtual != null){
            System.out.print(noAtual.getElemento() + " ");
            this.preOrder(noAtual.getNoEsquerdo());
            this.preOrder(noAtual.getNoDireito());
        }
    }
}
