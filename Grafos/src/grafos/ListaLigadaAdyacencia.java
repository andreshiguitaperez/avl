/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

/**
 *
 * @author LENOVO
 */
public class ListaLigadaAdyacencia {
    private Nodo[] vertices;

    public Nodo[] getVertices() {
        return vertices;
    }

    public void setVertices(Nodo[] vertices) {
        this.vertices = vertices;
    }
    
    public void parseMatrizAdyacenciaEnTripleta2ListaLigadaAdyacencia(MatrizAdyacenciaEnTripleta maet){
        Tripleta[] matriz = maet.getMady().getMatriz();
        vertices = new Nodo[matriz[0].getF()];
        
        Nodo ua=null;
        Nodo x;
        Tripleta r;
        int filaAnterior = -1;
        
        for(int i=1; i<matriz.length;i++){
            r = matriz[i];
            if(r.getF()!=filaAnterior){
                   ua=null;
                   filaAnterior = r.getF();
            }
            if(ua != null){
                 x = new Nodo(r.getC());
                 ua.setLiga(x);
                 ua = x;
            }else{
                ua = new Nodo(r.getC());
                vertices[filaAnterior-1]=ua;
                
            }
        }
    }
    /*
    int comparar(int act, int ant){
        if(act<ant){
            return -1;
        }
        if(act == ant){
            return 0;
        }
        return 1;
    }
    */
}
