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
public class NodoCabeza extends Nodo {
     NodoCabeza liga;
    public NodoCabeza(Tripleta t){
        super (t);
    }
    public void setLiga(NodoCabeza liga){
        this.liga=liga;
    }
    public NodoCabeza getLiga(){
        return liga;
    }
}
