package Model;

import java.util.ArrayList;

public class DosenTetap extends Dosen{
    private int salary;

    // Constructors
    public DosenTetap(String nama, String alamat, String ttl, String telepon, String NIK, String departemen, ArrayList<MatkulAjar> matkulAjar, int salary){
        super(nama, alamat, ttl, telepon, NIK, departemen, matkulAjar);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\nStatus: Dosen Tetap\nSalary: " + salary;
    }

    // Getter and setter
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
