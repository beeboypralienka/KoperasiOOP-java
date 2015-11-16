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
public class Koperasi {
    
    // inscne variabel milik objek itu sendiri, walaupun objek lain diganti, yang ini tetap ga berubah
    String idAnggota;
    String namaAnggota;
    
    // disharing di semua instance / objek 
    static int jumlahAnggota = 0; 
    
    public Koperasi(String idAnggota, String namaAnggota){
        this.idAnggota = idAnggota;
        this.namaAnggota = namaAnggota;  
        jumlahAnggota();      
    }    
    
    public void jumlahAnggota(){
        jumlahAnggota += 1;
    }
    
    public void showKoperasi(){
        System.out.print(idAnggota+" | "+namaAnggota);        
    }

}
