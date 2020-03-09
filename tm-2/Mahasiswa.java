public class Mahasiswa {
    // field, properties, variabel, atribut
    private String nim;
    private String nama;
    private String kelas;

    // constructor
    public Mahasiswa(String namaa) {
        nama = namaa;
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
}