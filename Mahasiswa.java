package StudiKasus;

public class Mahasiswa implements Comparable<Mahasiswa> {
    // Atribut yang memiliki acces modifier private
    private String nim;
    private String nama;
    private String kelas;

    // Ini adalah function untuk memanggil atribut yaitu nim, name, dan kelas
    public Mahasiswa(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
    }

    // Ini adalah fungsi untuk mendapatkan nim
    public String getNim() {
        return nim;
    }


    @Override
    public int compareTo(Mahasiswa o) {
        return this.getNim().compareTo(o.getNim());
    }

    // method untuk menampilkan data
    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nim='" + nim + '\'' +
                ", nama='" + nama + '\'' +
                ", kelas='" + kelas + '\'' +
                '}';
    }
}