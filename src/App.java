import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String nama;
        String alamat;
        String nip;
        String tanggal_lahir;
        int tahun_masuk;
        String jenis_kelamin;
        String nidn;
        String jurusan;
        //menggunakan default constructor
        Tendik C = new Tendik();
        C.lembur(20);
        System.out.println("====DETAIL KARYAWAN====");
        C.tampilkan();
        System.out.println("gaji total = "+C.getGaji_total());

        //menggunakan input dinamis dan parameter constructor
        Scanner input = new Scanner(System.in);
        System.out.println("===masukkan data dosen===");
        System.out.println("Masukkan nama karyawan : ");
        nama = input.nextLine();
        System.out.println("masukkan alamat karyawan : ");
        alamat = input.nextLine();
        System.out.println("masukkan nip : ");
        nip = input.nextLine();
        System.out.println("masukkan tanggal lahir");
        tanggal_lahir = input.nextLine();
        System.out.println("masukkan jenis kelamin : ");
        jenis_kelamin = input.nextLine();
        System.out.println("masukkan Nidn : ");
        nidn = input.nextLine();
        System.out.println("masukkan jurusan : ");
        jurusan = input.nextLine();
        System.out.println("masukkan tahun  masuk : ");
        tahun_masuk = input.nextInt();

        Dosen D = new Dosen(nama, alamat, tanggal_lahir, tahun_masuk, jenis_kelamin, nip, nidn, jurusan);
        D.lembur(12);
        System.out.println("====DETAIL KARYAWAN====");
        D.tampilkan();
        System.out.println("gaji total = "+D.getGaji_total());
        
        
        // Staf D = new Staf("ali", "32142412421", "laki-laki");
        // D.lembur(10);
        // System.out.println("gaji total = "+D.getGaji_total());

    }
}
