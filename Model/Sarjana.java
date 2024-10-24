package Model;

import java.util.ArrayList;

public class Sarjana extends Mahasiswa {
    private ArrayList<MatkulAmbil> matkulAmbil = new ArrayList<>();
    
    // Constructor
    public Sarjana(String nama, String alamat, String ttl, String telepon, String NIM, String jurusan, ArrayList<MatkulAmbil> matkulAmbil){
        super(nama, alamat, ttl, telepon, NIM, jurusan);
        this.matkulAmbil = matkulAmbil;
    }

    @Override
    public String toString() {
        String result = super.toString() + "\nStatus: Mahasiswa Sarjana\n";

        for (int i = 0; i < matkulAmbil.size(); i++) {
            result += matkulAmbil.get(i).toString();
        }
        return result;
    }

    // Getter and Setter
    public ArrayList<MatkulAmbil> getMatkulAmbil() {
        return matkulAmbil;
    }

    public void setMatkulAmbil(ArrayList<MatkulAmbil> matkulAmbil) {
        this.matkulAmbil = matkulAmbil;
    }

}
