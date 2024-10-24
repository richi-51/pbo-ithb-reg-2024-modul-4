package Model;

import java.util.ArrayList;

public class Karyawan extends Staff{
    int salary;
    ArrayList<PresensiStaff> presensiStaff = new ArrayList<>();
    

    // Constructors
    public Karyawan(String nama, String alamat, String ttl, String telepon, String NIK, int salary, ArrayList<PresensiStaff> presensiStaff){
        super(nama, alamat, ttl, telepon, NIK);
        this.salary = salary;
        this.presensiStaff = presensiStaff;
    }

    @Override
    public String toString() {
        String result = super.toString() + "\nStatus: Karyawan\nSalary: " + salary;

        result += "\n-------------------------\nPRESENSI STAFF\n" + "-------------------------\n";

        for (int i = 0; i < presensiStaff.size(); i++) {
            
            result += presensiStaff.get(i).toString();
        }
        result += "\n";

        return result;
    }

    public int getUnit(){
        int totalUnit = 0;
        for (PresensiStaff presensiStaff2 : presensiStaff) {
            if (presensiStaff2.isHadir()) {
                totalUnit ++;
            }
        }
        return totalUnit;
    }

    // Getter and setter
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public ArrayList<PresensiStaff> getPresensiStaff() {
        return presensiStaff;
    }

    public void setPresensiStaff(ArrayList<PresensiStaff> presensiStaff) {
        this.presensiStaff = presensiStaff;
    }

}
