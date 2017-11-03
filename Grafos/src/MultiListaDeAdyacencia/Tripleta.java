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
public class Tripleta {
        int f;
    int c;
    int v;
  
    public Tripleta(int f,int c, int v){
        this.f=f;
        this.c=c;
        this.v=v;
    }

    public Tripleta() {
    }
    public int getC(){
        return c;
    }
    public int getF(){
        return f;
    }
    public int getV(){
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }
}
