/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       Gaji Pegawai
 */
package pbo2.pkg10117069.latihan43.gajipegawai;

import java.util.Scanner;

public class GajiPegawai {
    private String nama;
    private String alamat;
    private int uangTransport;
    private int uangTunjangan;
    private int gajiPokok;
    private int totalGaji;

    Scanner sc1 = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);
    Scanner sc3 = new Scanner(System.in);
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUangTransport() {
        return uangTransport = 250000;
    }

    public void setUangTransport(int uangTransport) {
        this.uangTransport = uangTransport;
    }

    public int getUangTunjangan() {
        return uangTunjangan = 300000;
    }

    public void setUangTunjangan(int uangTunjangan) {
        this.uangTunjangan = uangTunjangan;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int getTotalGaji() {
        return totalGaji;
    }

    public void setTotalGaji(int totalGaji) {
        this.totalGaji = totalGaji;
    }
    
    public int totalGaji(int uangTunjangan, int uangTransport, int gajiPokok){
        totalGaji = uangTunjangan + uangTransport + gajiPokok; 
    return totalGaji;
    }
    
    public void tampilData(String nama, String alamat, int uangTunjangan, int uangTransport, int gajiPokok, int totalGaji){
    System.out.print("Nama Karyawan : ");
        setNama(sc1.nextLine());
        System.out.print("Alamat : ");
        setAlamat(sc2.nextLine());
        System.out.println("Uang Transport : "+getUangTransport());
        System.out.println("Uang Tunjangan : "+getUangTunjangan());
        System.out.print("Gaji Pokok     : ");
        setGajiPokok(sc3.nextInt());
        System.out.println("Total Gaji : " + totalGaji(getUangTransport(), getUangTunjangan(), getGajiPokok()));
    }
    
}
