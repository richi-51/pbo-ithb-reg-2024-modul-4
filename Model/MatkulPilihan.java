package Model;

public class MatkulPilihan extends MataKuliah{
    private int jumlahMinMahasiswa;

    // Constructors
    public MatkulPilihan(String kode, int sks, int jumlahMinMahasiswa, String nama){
        super(kode, nama, sks);
        this.jumlahMinMahasiswa = jumlahMinMahasiswa;
    }

    @Override
    public String toString() {
        return super.toString() + "Jumlah minimal mahasiswa: " + jumlahMinMahasiswa;
    }

    // Getter and setter
    public int getJumlahMinMahasiswa() {
        return jumlahMinMahasiswa;
    }

    public void setJumlahMinMahasiswa(int jumlahMinMahasiswa) {
        this.jumlahMinMahasiswa = jumlahMinMahasiswa;
    }

    
}