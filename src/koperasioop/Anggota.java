/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koperasioop;

/**
 *
 * @author Fachrul Pralienka BM
 */
public class Anggota{  
    
    Koperasi kop;
    String nomorRekening;   
    
    public Anggota(Koperasi kop, String nomorRek){
        this.kop = kop;
        this.nomorRekening = nomorRek;        
    }    
    
    public void showAnggota(){
        kop.showKoperasi();
        System.out.print(" | "+nomorRekening);
    }
    
    
}
