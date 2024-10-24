package Model;

import java.util.ArrayList;

public class MatkulAjar {
    private MataKuliah matkulAjar;
    private ArrayList<PresensiStaff> listPresensi;
    
    // Constructors
    public MatkulAjar(MataKuliah matkulAjar, ArrayList<PresensiStaff> listPresensi) {
        this.matkulAjar = matkulAjar;
        this.listPresensi = listPresensi;
    }
    
    @Override
    public String toString() {
        String result = "\n-----------------------------\nMATA KULIAH YANG DIAJAR\n-----------------------------\n";
        result += matkulAjar.toString();

        result += "\n-------------------------\nPRESENSI STAFF\n" + "-------------------------\n";

        for (int i = 0; i < listPresensi.size(); i++) {
            result += listPresensi.get(i).toString() + "\n";
        }

        return result;
    }

    // Getter and setter
    public MataKuliah getMatkulAjar() {
        return matkulAjar;
    }
    public void setMatkulAjar(MataKuliah matkulAjar) {
        this.matkulAjar = matkulAjar;
    }
    public ArrayList<PresensiStaff> getListPresensi() {
        return listPresensi;
    }
    public void setListPresensi(ArrayList<PresensiStaff> listPresensi) {
        this.listPresensi = listPresensi;
    }



}
