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
public class MatrizIncidenciaEnLLF1 {
    NodoCabeza nc;
    MatrizIncidenciaEnLLF1(int f,int c){
     Tripleta t=new Tripleta(f,c,0);
     nc=new NodoCabeza( t );
     int max= (f>c)? f:c;
     
     NodoCabeza ultimo=nc;
     for(int i=1;i<=max;i++){
         NodoCabeza nca=new NodoCabeza(new Tripleta(i,i,0));
         nca.setLigaC((Nodo) nca);
         nca.setLigaF((Nodo) nca);
         ultimo.setLiga(nca);
         ultimo=nca;        
     }
     ultimo.setLiga(nc);
    }
    
    void insertar(Tripleta t){
        NodoCabeza nca=nc.getLiga();
        Nodo nnuevo=new Nodo(t);
        while(nca!=nc&&nca!=null){
              if(nca.getT().getF()==t.getF()){
                  insertarEnFila(nca,nnuevo);
                  break;
              }
              nca=nca.getLiga();
        }
        nca=nc.getLiga();
        while(nca!=nc && nca!=null ){
            if(nca.getT().getC()==t.getC()){
            insertarEnColumna(nca,nnuevo);  
            break;
            }
            nca=nca.getLiga();
        }
    }

    private void insertarEnFila(NodoCabeza nca, Nodo nnuevo) {
      Nodo s= nca.getLigaF();
      Nodo a= (Nodo)nca;
      while(s!=null&&s!=(Nodo)nca){
          if(nnuevo.getT().getC()>s.getT().getC()){
              a = s;
              s = s.getLigaF();
          }else{
              break;
          }
      }
      nnuevo.setLigaF( s );
      a.setLigaF(nnuevo);
    }
    private void insertarEnColumna(NodoCabeza nca, Nodo nnuevo) {
       Nodo s= nca.getLigaF();
      Nodo a= (Nodo)nca;
      while(s!=null&&s!=(Nodo)nca){
          if(nnuevo.getT().getF()>s.getT().getF()){
              a = s;
              s = s.getLigaC();
          }else{
              break;
          }
      }
      nnuevo.setLigaC( s );
      a.setLigaC(nnuevo);
    }
    void imprimir(){
      NodoCabeza nca=nc.getLiga();
      Tripleta t;
      while(nca!=nc&&nca!=null){
            
      }        
    }
    
}
