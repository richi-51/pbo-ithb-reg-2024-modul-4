package Model;

public class Staff extends User{
    private String NIK;
    
    // Constructor
    public Staff(String nama, String alamat, String ttl, String telepon, String NIK){
        super(nama, alamat, ttl, telepon);
        this.NIK = NIK;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNIK: " + NIK;
    }

    // Getter and Setter
    public String getNIK() {
        return NIK;
    }

    public void setNIK(String nIK) {
        NIK = nIK;
    }


    
}
