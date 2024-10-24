package Model;

public class MataKuliah {
    private String kode, nama;
    private int sks;

    // Constructors
    public MataKuliah(String kode, String nama, int sks){
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    @Override
    public String toString() {
        return "Kode Matkul: " + kode + "\n" + "Nama Matkul: " + nama + "\n" + "SKS: " + sks + "\n";
    }

    // Getter and setter
    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    
}
