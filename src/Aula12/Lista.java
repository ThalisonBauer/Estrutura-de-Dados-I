package Aula12;

/**
 * Created by Thalison Bauer on 25/10/2016.
 */
public class Lista {
    Elemento inicio;
    Elemento fim;
    int qtd;

    public void addInicio(Elemento e)
    {
        if(this.inicio==null){
            this.inicio = e;
            this.fim = e;
            this.qtd++;
        }else{
            e.proximo = this.inicio;
            this.inicio = e;
            this.qtd++;
        }
    }
    public void addFim(Elemento e){
        if(this.inicio==null)
        {
            addInicio(e);
        }else{
            this.fim.proximo = e;
            this.fim = e;
            this.qtd++;
        }
    }
    public void addPosition(Elemento e, int p){
        Elemento aux;
        if(this.inicio == null)
        {
            addInicio(e);
        }else if(p > this.qtd){
            addFim(e);
        }else{
            aux =this.inicio;
            for(int i=0 ; i < p;i++){
            aux=aux.proximo;
            }
            e.proximo=aux.proximo;
            aux.proximo=e;
        }
    }
    public void remInicio(){
        Elemento aux;
        if (this.qtd > 1){
            aux = this.inicio;
            this.inicio = aux.proximo;
        }else if(this.qtd == 1){
            aux = this.inicio;
            this.inicio = null;
            this.fim = null;
        }else{
            System.out.println("Vazio");
        }
    }
    public void remFim(){
        if(this.inicio == null){
            System.out.println("Vazia");
        }else{
            if(this.qtd==1)
        }
    }

}
