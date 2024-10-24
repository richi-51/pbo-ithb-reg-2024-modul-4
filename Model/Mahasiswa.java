package Model;

public class Mahasiswa extends User {
    private String NIM, jurusan;
    
    // Constructors
    public Mahasiswa(String nama, String alamat, String ttl, String telepon, String NIM, String jurusan){
        super(nama, alamat, ttl, telepon);
        this.NIM = NIM;
        this.jurusan = jurusan;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNIM: " + NIM + "\nJurusan: " + jurusan;
    }


    // Getter and Setter
    public String getNIM() {
        return NIM;
    }

    public void setNIM(String nIM) {
        NIM = nIM;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }


    
}
