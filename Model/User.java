package Model;

public abstract class User{
    private String nama, alamat, TLL, telepon;
    
    // Constructors
    public User(String nama, String alamat, String ttl, String telepon){
        this.nama = nama;
        this.alamat = alamat;
        this.TLL = ttl;
        this.telepon = telepon;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + "\nAlamat: " + alamat + "\nTLL: " + TLL + "\nTelepon: " + telepon; 
    }


    // Getter and Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTLL() {
        return TLL;
    }

    public void setTLL(String tLL) {
        TLL = tLL;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

}