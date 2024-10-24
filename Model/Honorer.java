package Model;

import java.util.ArrayList;

public class Honorer extends Dosen{
    private int honorPerSKS;

    // Constructors
    public Honorer(String nama, String alamat, String ttl, String telepon, String NIK, String departemen, ArrayList<MatkulAjar> matkulAjar, int honorPerSKS){
        super(nama, alamat, ttl, telepon, NIK, departemen, matkulAjar);
        this.honorPerSKS = honorPerSKS;
    }
    
    @Override
    public String toString() {
        return super.toString() + "Status: Dosen Honorer\nHonor Per SKS: " + honorPerSKS;
    }
    
    // Getter and setter
    public void setHonorPerSKS(int honorPerSKS) {
        this.honorPerSKS = honorPerSKS;
    }
    public int getHonorPerSKS() {
        return honorPerSKS;
    }

}
