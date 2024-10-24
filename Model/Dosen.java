package Model;
import java.util.ArrayList;

public class Dosen extends Staff {
    private String departemen;
    private ArrayList <MatkulAjar> matkulAjar = new ArrayList<>();
    
    // Constructors
    public Dosen(String nama, String alamat, String ttl, String telepon, String NIK, String departemen, ArrayList <MatkulAjar> matkulAjar){
        super(nama, alamat, ttl, telepon, NIK);
        this.departemen = departemen;
        this.matkulAjar = matkulAjar;
    }

    @Override
    public String toString() {
        String result = super.toString() + "\nDepartemen: " + departemen + "\n";

        for (int i = 0; i < matkulAjar.size(); i++) {
            result += matkulAjar.get(i).toString();
        }
        return result + "\n";
    }

    public int getUnit(){
        int totalUnit = 0;

        for (MatkulAjar matkulAjar2 : matkulAjar) {
            for (PresensiStaff presensi : matkulAjar2.getListPresensi()) {
                if (presensi.isHadir()) {
                    totalUnit++;
                }
            }
        }
        return totalUnit;
    }

    // Getter and setter 
    public String getDepartemen() {
        return departemen;
    }


    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }


    public ArrayList<MatkulAjar> getMatkulAjar() {
        return matkulAjar;
    }


    public void setMatkulAjar(ArrayList<MatkulAjar> matkulAjar) {
        this.matkulAjar = matkulAjar;
    }


}
