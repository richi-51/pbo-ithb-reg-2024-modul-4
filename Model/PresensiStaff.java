package Model;

import java.util.Date;

public class PresensiStaff extends Presensi{
    private int jam;

    // Constructor
    public PresensiStaff(Date tanggal, EnumStatus status, int jam){
        super(tanggal, status);
        this.jam = jam;
    }

    @Override
    public String toString() {
        return super.toString() + "Total jam: " + jam + "\n";
    }

    // Getter and setter
    public int getJam() {
        return jam;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }
}
