public class Aplikasi {
    public static void main(String args[]) {
        System.out.println("Selamat datang di Java");

        Mahasiswa mhs = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa("tamami");
        // mhs.nama = "tamami";
        System.out.println(mhs.getNama());
        System.out.println(mhs2.getNama());
    }
}