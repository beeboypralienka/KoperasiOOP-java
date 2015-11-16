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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Koperasi anggota1 = new Koperasi("ID-001", "Joko Santoso");                       
        Koperasi anggota2 = new Koperasi("ID-002", "Udin Harahap");  
        Koperasi anggota3 = new Koperasi("ID-003", "Santo Mulyono");
        
        Anggota rek1 = new Anggota(anggota1, "Rek-001");
        Anggota rek2 = new Anggota(anggota1, "Rek-002");
        Anggota rek3 = new Anggota(anggota2, "Rek-003"); 
        Anggota rek4 = new Anggota(anggota3, "Rek-004");
        
        Rekening mutasiRek1 = new Rekening();
        Rekening mutasiRek2 = new Rekening();
        Rekening mutasiRek3 = new Rekening();
        Rekening mutasiRek4 = new Rekening();
       
        mutasiRek1.tambahSaldo(rek1, 50000);
        mutasiRek1.tambahSaldo(rek1, 30000);
        mutasiRek1.ambilSaldo(rek1, 90000);
        
        mutasiRek2.tambahSaldo(rek2, 30000);
        mutasiRek3.tambahSaldo(rek3, 70000);
        mutasiRek4.tambahSaldo(rek4, 20000);
                
        mutasiRek1.showSaldo();
        mutasiRek2.showSaldo();
        mutasiRek3.showSaldo();
        mutasiRek4.showSaldo();

    }

}
