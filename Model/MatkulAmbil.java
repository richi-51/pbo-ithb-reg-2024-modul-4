package Model;

import java.util.ArrayList;

public class MatkulAmbil {
    private MataKuliah matkul;
    private ArrayList<Presensi> presensi = new ArrayList<>();
    private double n1, n2, n3;
    

    // Constructor
    public MatkulAmbil(MataKuliah matkul, ArrayList<Presensi> presensi, double n1, double n2, double n3) {
        this.matkul = matkul;
        this.presensi = presensi;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    @Override
    public String toString() {
        String result = "\n-----------------------------\nMATA KULIAH YANG DIAMBIL\n-----------------------------\n";
        result += matkul.toString();
        result += "\n-------------------------\nPRESENSI\n" + "-------------------------\n";

        for (int i = 0; i < presensi.size(); i++) {
            result += presensi.get(i).toString();
        }

        result += "\n-------------------------\n";
        result += "Nilai 1: " + n1 + "\n";
        result += "Nilai 2: " + n2 + "\n";
        result += "Nilai 3: " + n3 + "\n";
        
        return result;
    }

    // Getter and Setter
    public MataKuliah getMatkul() {
        return matkul;
    }

    public void setMatkul(MataKuliah matkul) {
        this.matkul = matkul;
    }

    public ArrayList<Presensi> getPresensi() {
        return presensi;
    }

    public void setPresensi (ArrayList<Presensi> presensi) {
        this.presensi = presensi;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }


}
