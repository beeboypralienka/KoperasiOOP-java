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
public class Rekening {
    
    double saldo;
    Anggota a;

    public void showSaldo() {
        a.showAnggota();
        System.out.println(" | Total Saldo: "+saldo);
    }

    public void ambilSaldo(Anggota a, double ambil) {
        this.a = a;
        if(ambil>this.saldo){
            ambil=0;
        }else{
            this.saldo = saldo - ambil;
        }        
    }
    
    public void tambahSaldo(Anggota a, double tambah) {
        this.a = a;
        this.saldo = saldo + tambah;
    }
    
    
    
    
}
