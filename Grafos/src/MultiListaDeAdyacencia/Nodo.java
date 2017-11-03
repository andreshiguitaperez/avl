/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiListaDeAdyacencia;

/**
 *
 * @author LENOVO
 */
public class Nodo {
     private Nodo ligaC;
    private Nodo ligaF;
    Tripleta t;
    
    public Nodo(Tripleta t){
        this.t=t;
    }
    public void setLigaF(Nodo n){
     this.ligaF=n;    
    }
    public Nodo getLigaF(){
        return ligaF;
    }
    public void setLigaC(Nodo n){
        this.ligaC=n;
    }
    public Nodo getLigaC(){
        return ligaC;
    }
    public Tripleta getT(){
        return t;
    }
    
}
