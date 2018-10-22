/*
 * @author
 * Nama   : Muhammad Ardhan Aryatama
 * Kelas  : PBO2
 * NIM    : 10117069
 * Deskripsi Program : program ini dibuat untuk menampilkan value ke program 
                       Gaji Pegawai
 */
package pbo2.pkg10117069.latihan43.gajipegawai;

public class PBO210117069Latihan43GajiPegawai {

    public static void main(String[] args) {
        // TODO code application logic here
        
        GajiPegawai Gp = new GajiPegawai();
        
        System.out.println("### Data Gaji Karyawan PT. KAKATU ###");
        System.out.println("-------------------------------------");
        Gp.tampilData(Gp.getNama(), Gp.getAlamat(), Gp.getUangTransport(), Gp.getUangTunjangan(), Gp.getGajiPokok(), Gp.getTotalGaji());
        
    }
    
}
