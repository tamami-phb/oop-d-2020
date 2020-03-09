package entitas;

public class Mahasiswa {
    // field, properties, variabel, atribut
    private String nim;
    private String nama;
    private String kelas;

    // constructor
    public Mahasiswa(String namaa) {
        nama = namaa;
    }

    public Mahasiswa(String nim, String nama, 
            String kelas) {
        this.nim = nim; 
        this.nama = nama;
        this.kelas = kelas;
    }

    public Mahasiswa() {
        nama = "no name";
    }

    // method
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getNama() {
        return nama;
    }

    public String getKelas() {
        return kelas;
    }

    public String getNim() {
        return nim;
    }

    public String info() {
        return "NIM: " + nim + "\n" +
            "Nama: " + nama + "\n" +
            "Kelas: " + kelas;
    }

    public void print() {
        System.out.println("  NIM : " + nim);
        System.out.println("  NAMA : " + nama);
        System.out.println("  KELAS : " + kelas);
    }
}