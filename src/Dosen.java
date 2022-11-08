public class Dosen extends Karyawan {
    private String nidn;
    private String jurusan;
    private int gaji_tambahan;
    private int gaji_total;

    
    //implementasi overloading constructor
    public Dosen() {
        super();
        this.nidn = "21000018158";
        this.jurusan = "teknik informatika";
    }

    public Dosen(String nama, String alamat, String tanggal_lahir, int tahun_masuk, String jenis_kelamin, String nip,
            String nidn, String jurusan) {
        super(nama, alamat, tanggal_lahir, tahun_masuk, jenis_kelamin, nip);
        this.nidn = nidn;
        this.jurusan = jurusan;
    }

    public void lembur(int sks){
        this.gaji_tambahan = sks*100000;
    }

    public String getNidn() {
        return nidn;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public int getGaji_tambahan() {
        return gaji_tambahan;
    }

    //implementasi overriding dari superclass
    public int getGaji_total() {
        this.gaji_total = this.gaji_pokok + this.gaji_tambahan;
        return gaji_total;
    }
    public void tampilkan(){
        super.tampilkan();
        System.out.println("Nidn = "+this.nidn);
        System.out.println("jurusan = "+this.jurusan);
    }

    


    
}


