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
public class NodoMultiLDeAd {
    private NodoMultiLDeAd LigaVi;
    private NodoMultiLDeAd LigaVj;
    private byte sw;
    private int vi;
    private int vj;

    public NodoMultiLDeAd(NodoMultiLDeAd LigaVi, NodoMultiLDeAd LigaVj, byte sw, int vi, int vj) {
        this.LigaVi = LigaVi;
        this.LigaVj = LigaVj;
        this.sw = sw;
        this.vi = vi;
        this.vj = vj;
    }

    public NodoMultiLDeAd() {
    }

    public NodoMultiLDeAd getLigaVi() {
        return LigaVi;
    }

    public void setLigaVi(NodoMultiLDeAd LigaVi) {
        this.LigaVi = LigaVi;
    }

    public NodoMultiLDeAd getLigaVj() {
        return LigaVj;
    }

    public void setLigaVj(NodoMultiLDeAd LigaVj) {
        this.LigaVj = LigaVj;
    }

    public byte getSw() {
        return sw;
    }

    public void setSw(byte sw) {
        this.sw = sw;
    }

    public int getVi() {
        return vi;
    }

    public void setVi(int vi) {
        this.vi = vi;
    }

    public int getVj() {
        return vj;
    }

    public void setVj(int vj) {
        this.vj = vj;
    }
    
    
}
