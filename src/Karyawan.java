public class Karyawan {
    protected String nama;
    protected String alamat;
    protected String tanggal_lahir;
    protected int tahun_masuk;
    protected String jenis_kelamin;
    protected String nip;
    protected int gaji_pokok;
    protected int gaji_total;
    
    //penerapan overloading pada constructor
    public Karyawan(){
        this.nama = "ADHIKA NUGRAHA ALI";
        this.alamat = "JL. AM SANGAJI";
        this.nip = "158158158";
        this.tanggal_lahir = "02-07-2003";
        this.jenis_kelamin = "LAKI-LAKI";
        this.tahun_masuk = 2021;
        this.gaji_pokok = 2000000;
    }
    public Karyawan(String nama, String alamat, String tanggal_lahir, int tahun_masuk, String jenis_kelamin,String nip) {
        this.nama = nama;
        this.alamat = alamat;
        this.tanggal_lahir = tanggal_lahir;
        this.tahun_masuk = tahun_masuk;
        this.jenis_kelamin = jenis_kelamin;
        this.nip = nip;
        this.gaji_pokok = 2000000;
    }
    public int getGaji_total(){
        this.gaji_total = gaji_pokok;
        return gaji_total;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNip() {
        return nip;
    }
    public void setNip(String nip) {
        this.nip = nip;
    }
    public int getGaji_pokok() {
        return gaji_pokok;
    }
    public void setGaji_pokok(int gaji_pokok) {
        this.gaji_pokok = gaji_pokok;
    }

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getTanggal_lahir() {
        return tanggal_lahir;
    }
    public void setTanggal_lahir(String tanggal_lahir) {
        this.tanggal_lahir = tanggal_lahir;
    }
    public int getTahun_masuk() {
        return tahun_masuk;
    }
    public void setTahun_masuk(int tahun_masuk) {
        this.tahun_masuk = tahun_masuk;
    }
    public void tampilkan(){
        System.out.println("nama = "+this.nama);
        System.out.println("nip = "+this.nip);
        System.out.println("alamat = "+this.alamat);
        System.out.println("jenis kelamin = "+this.jenis_kelamin);
        System.out.println("tanggal lahir = "+this.tanggal_lahir);
        System.out.println("tahun masuk = "+this.tahun_masuk);
    }

    
}
