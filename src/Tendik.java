public class Tendik extends Karyawan{
    private int gaji_tambahan;
    private int gaji_total;
    
    public Tendik(){
        super();
    }
    public Tendik(String nama, String alamat, String tanggal_lahir, int tahun_masuk, String jenis_kelamin, String nip) {
        super(nama, alamat, tanggal_lahir, tahun_masuk, jenis_kelamin, nip);
    }
    public void lembur(int jam_lembur){
        this.gaji_tambahan = jam_lembur*50000;
    }
    public int getGaji_tambahan() {
        return gaji_tambahan;
    }
    //implementasi overriding
    public int getGaji_total() {
        this.gaji_total = this.gaji_pokok + this.gaji_tambahan;
        return gaji_total;
    }
    
    
}
