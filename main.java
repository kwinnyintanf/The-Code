import java.util.Scanner;

class mahasiswa{
    String nama;
    String npm;
    String fakultas;
    String jurusan;
    String prodi;

    mahasiswa(String nama, String npm, String fakultas, String jurusan, String prodi){
        this.nama = nama;
        this.npm = npm;
        this.fakultas = fakultas;
        this.jurusan = jurusan;
        this.prodi = prodi;
    }

    void method(){
        System.out.println("APLIKASI  PENGAJUAN SURAT BEBAS PERPUSTAKAAN\n\n");
        System.out.println("Silahkan Masukkan Data Diri Anda");
    }

    void method2(){
        System.out.println("Nama: " + nama);
        System.out.println("NPM: " + npm);
        System.out.println("Fakultas: " + fakultas);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Prodi: " + prodi);
        System.out.println("Hallo " + nama + " Trimakasih, Pengajuan Anda Telah Kami Terima" );
    }
}

class pengunjung{
    String nama;
    String alamat;
    int NIK;
    String pekerjaan;
    String tempatTanggalLahir;

    pengunjung(String nama, String alamat, int NIK, String pekerjaan, String tempatTanggalLahir){
        this.nama = nama;
        this.alamat = alamat;
        this.NIK = NIK;
        this.pekerjaan = pekerjaan;
        this.tempatTanggalLahir = tempatTanggalLahir;
    }

    void method(){
        System.out.println("APLIKASI  PENGAJUAN SURAT BEBAS PERPUSTAKAAN\n\n");
        System.out.println("Silahkan Masukkan Data Diri Anda");
    }

    void method1(){
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("NIK: " + NIK);
        System.out.println("Pekerjaan: " + pekerjaan);
        System.out.println("Tempat Tanggal Lahir: " + tempatTanggalLahir);
        System.out.println("Halo " + nama + " Trimakasih, Pengajuan Anda Telah Kami Terima");
    }
}



public class main {
    public static void main(String[]args){
        mahasiswa mhs = new mahasiswa("Kwinny Intan", "201506157", "Teknik", "Teknik Elektro", "Teknik Informatika");
        pengunjung png = new pengunjung("Fahri Hamzah", "JL. KADER MANIK NO 23", 1274821223, "Pelajar", "Sibolga, 19 Mei 2002");
        mhs.method();
        mhs.method2();
        png.method();
        png.method1();
    }
}
