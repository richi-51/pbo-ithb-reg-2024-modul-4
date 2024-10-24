package Model;

import java.util.ArrayList;

public class Magister extends Mahasiswa {
    private ArrayList<MatkulAmbil> matkulAmbil = new ArrayList<>();
    private String judulTesis;
    

    // Constructors
    public Magister(String nama, String alamat, String ttl, String telepon, String NIM, String jurusan, ArrayList<MatkulAmbil> matkulAmbil, String judulTesis){
        super(nama, alamat, ttl, telepon, NIM, jurusan);
        this.matkulAmbil = matkulAmbil;
        this.judulTesis =judulTesis;
    }

    @Override
    public String toString() {
        String result = super.toString() + "\nStatus: Mahasiswa Magister\nJudul Penelitian Tesis: " + judulTesis + "\n";

        for (int i = 0; i < matkulAmbil.size(); i++) {
            result += matkulAmbil.get(i).toString();
        }
        return result;
    }

    // Getter and setter
    public ArrayList<MatkulAmbil> getMatkulAmbil() {
        return matkulAmbil;
    }

    public void setMatkulAmbil(ArrayList<MatkulAmbil> matkulAmbil) {
        this.matkulAmbil = matkulAmbil;
    }

    public String getJudulTesis() {
        return judulTesis;
    }

    public void setJudulTesis(String judulTesis) {
        this.judulTesis = judulTesis;
    }


}
