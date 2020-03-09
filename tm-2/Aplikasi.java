import entitas.*;

public class Aplikasi {
    public static void main(String args[]) {
        System.out.println("Selamat datang di Java");

        Mahasiswa mhs = new Mahasiswa("19001",
            "fulan", "D");
        Mahasiswa mhs2 = new Mahasiswa("tamami");
        // mhs.nama = "tamami";
        // Mahasiswa.nama = "aneh";
        System.out.println(mhs.getNama());
        System.out.println(mhs2.getNama());

        // System.out.println(Math.abs(-37));

        Hewan kucing = new Hewan();
        kucing.jenis = "kucing";
        System.out.println(kucing.jenis);

        System.out.println(mhs.info());
        mhs.print();
    }
}