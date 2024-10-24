import Model.*;

import java.util.ArrayList;
import java.util.Date;

import Controller.*;
import View.*;


public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        createDummy(users);
        

        SIA_Controller ctrl = new SIA_Controller(users);
        MainMenu menu = new MainMenu(ctrl);
        menu.mainMenu(users);
    }

    
    public static ArrayList<User> createDummy(ArrayList<User> users){
        // Dummy data for MataKuliah
        MataKuliah matkul1 = new MataKuliah("IF101", "Algoritma", 4);
        MataKuliah matkul2 = new MataKuliah("IF102", "Struktur Data", 3);
        MatkulPilihan matkulPilihan = new MatkulPilihan("IF201", 3, 15, "Kecerdasan Buatan");

        // Dummy data for Presensi
        Presensi presensi1 = new Presensi(new Date(), EnumStatus.HADIR);

        Presensi presensi2 = new Presensi(new Date(), EnumStatus.ALPHA);

        ArrayList<Presensi> presensiList = new ArrayList<>();
        presensiList.add(presensi1);
        presensiList.add(presensi2);

        // Dummy data for MatkulAmbil
        MatkulAmbil matkulAmbil1 = new MatkulAmbil(matkul1, presensiList, 80, 85, 90);
        MatkulAmbil matkulAmbil2 = new MatkulAmbil(matkulPilihan, presensiList, 70, 75, 80);
        ArrayList<MatkulAmbil> matkulAmbilList = new ArrayList<>();
        matkulAmbilList.add(matkulAmbil1);
        matkulAmbilList.add(matkulAmbil2);

        // Dummy data for PresensiStaff
        PresensiStaff presensiStaff1 = new PresensiStaff(new Date(), EnumStatus.HADIR, 10);
        PresensiStaff presensiStaff2 = new PresensiStaff(new Date(), EnumStatus.HADIR, 12);
        ArrayList<PresensiStaff> presensiStaffList = new ArrayList<>();
        presensiStaffList.add(presensiStaff1);
        presensiStaffList.add(presensiStaff2);


        // Dummy data for MatkulAjar
        MatkulAjar matkulAjar1 = new MatkulAjar(matkul1, presensiStaffList);
        MatkulAjar matkulAjar2 = new MatkulAjar(matkul2, presensiStaffList);
        ArrayList<MatkulAjar> matkulAjarList = new ArrayList<>();
        matkulAjarList.add(matkulAjar1);
        matkulAjarList.add(matkulAjar2);

        users.add(new Sarjana("Ahmad", "Jl. Kebangsaan", "01-01-2000", "081234567890", "12345", "Informatika", matkulAmbilList));
        users.add(new Magister("Budi", "Jl. Merdeka", "02-02-1998", "081234567891", "23456", "Informatika", matkulAmbilList, "Sistem Pendukung Keputusan"));
        users.add(new Doktor("Cici", "Jl. Sudirman", "03-03-1985", "081234567892", "34567", "Informatika", "Jaringan Saraf Tiruan", 85, 90, 88));
        users.add(new Karyawan("Dedi", "Jl. Kartini", "04-04-1980", "081234567893", "98765", 5000000, presensiStaffList));
        users.add(new DosenTetap("Erni", "Jl. Siliwangi", "05-05-1975", "081234567894", "87654", "Teknik Elektro", matkulAjarList, 15000000));
        users.add(new Honorer("Fajar", "Jl. Diponegoro", "06-06-1980", "081234567895", "76543", "Teknik Mesin", matkulAjarList, 100000));

        return users;
        // Menampilkan informasi setiap objek
        // for (int i = 0; i < user.length; i++) {
        //     System.out.println(user[i].toString());
        // }


    }




}
