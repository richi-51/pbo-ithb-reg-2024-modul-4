package Controller;
import Model.*;
import java.util.ArrayList;

public class SIA_Controller {
    private ArrayList <User> users;

    public SIA_Controller(ArrayList<User>users){
        this.users = users;
    }

    public String printUserData(String nama){
        for (User user : users) {
            if (user.getNama().equalsIgnoreCase(nama)) {
                return user.toString();
            }
        }
        return "User tidak ditemukan!";
    }

    public String printNilaiAkhir(String NIM, String kodeMK){
        for (User user : users) {
            if (user instanceof Mahasiswa) {
                Mahasiswa mahasiswa = (Mahasiswa) user;

                if (mahasiswa.getNIM().equalsIgnoreCase(NIM)) {
                    if (mahasiswa instanceof Sarjana) {
                        Sarjana sarjana = (Sarjana) mahasiswa;

                        for (MatkulAmbil matkulAmbil : sarjana.getMatkulAmbil()) {
                            if (matkulAmbil.getMatkul().getKode().equalsIgnoreCase(kodeMK)) {
                                double nilaiAkhir = (matkulAmbil.getN1() + matkulAmbil.getN2() + matkulAmbil.getN3())/3.0;

                                return "Nilai Akhir: " + nilaiAkhir;
                            }
                        }
                    }

                    else if (mahasiswa instanceof Magister) {
                        Magister magister = (Magister) mahasiswa;

                        for (MatkulAmbil matkulAmbil : magister.getMatkulAmbil()) {
                            if (matkulAmbil.getMatkul().getKode().equalsIgnoreCase(kodeMK)) {
                                double nilaiAkhir = (matkulAmbil.getN1() + matkulAmbil.getN2() + matkulAmbil.getN3())/3.0;

                                return "Nilai Akhir: " + nilaiAkhir;
                            }
                        }
                    }
                    else{
                        Doktor mhsDoktor = (Doktor) mahasiswa;
                        double nilaiAkhir = mhsDoktor.getNilaiSidang1() + mhsDoktor.getNilaiSidang2() + mhsDoktor.getNilaiSidang3()/3.0;
                        return "Nilai Akhir: " + nilaiAkhir;
                    }
                }
            }
        }
        return "Mahasiswa tidak ditemukan";
    }



    public String printRataNA(String kodeMK){
        double total = 0;
        int countMhs = 0;

        for (User user : users) {
            if (user instanceof Mahasiswa) {
                Mahasiswa mahasiswa = (Mahasiswa) user;

                if (mahasiswa instanceof Sarjana) {
                    Sarjana sarjana = (Sarjana) mahasiswa;

                    for (MatkulAmbil matkulAmbil : sarjana.getMatkulAmbil()) {
                        if (matkulAmbil.getMatkul().getKode().equalsIgnoreCase(kodeMK)) {
                            total += (matkulAmbil.getN1() + matkulAmbil.getN2() + matkulAmbil.getN3())/3.0;
                            countMhs ++;
                        }
                    }
                }

                else if (mahasiswa instanceof Magister) {
                    Magister magister = (Magister) mahasiswa;

                    for (MatkulAmbil matkulAmbil : magister.getMatkulAmbil()) {
                        if (matkulAmbil.getMatkul().getKode().equalsIgnoreCase(kodeMK)) {
                            total += (matkulAmbil.getN1() + matkulAmbil.getN2() + matkulAmbil.getN3())/3.0;
                            countMhs ++;
                        }
                    }
                }
            }
        }

        if (countMhs == 0) {
            return "Tidak ada yang mengambil mata kuliah tersebut";
        }else{
            return "Rata-rata nilai akhir: " + (total/countMhs);
        }
    }


    public String printBanyakMhsTidakLulus(String kodeMK){
        int totalMhs = 0;
        int totalMhsTdkLulus = 0;
        String namaMK = "";

        for (User user : users) {
            if (user instanceof Mahasiswa) {
                Mahasiswa mahasiswa = (Mahasiswa) user;

                if (mahasiswa instanceof Sarjana) {
                    Sarjana sarjana = (Sarjana) mahasiswa;

                    for (MatkulAmbil matkulAmbil : sarjana.getMatkulAmbil()) {
                        if (matkulAmbil.getMatkul().getKode().equalsIgnoreCase(kodeMK)) {
                            namaMK = matkulAmbil.getMatkul().getNama();
                            double na = (matkulAmbil.getN1() + matkulAmbil.getN2() + matkulAmbil.getN3())/3.0;
                            
                            if (na < 56) {
                                totalMhsTdkLulus ++;
                            }
                            
                            totalMhs++;
                        }
                    }
                }

                else if (mahasiswa instanceof Magister) {
                    Magister magister = (Magister) mahasiswa;

                    for (MatkulAmbil matkulAmbil : magister.getMatkulAmbil()) {
                        if (matkulAmbil.getMatkul().getKode().equalsIgnoreCase(kodeMK)) {
                            double na = (matkulAmbil.getN1() + matkulAmbil.getN2() + matkulAmbil.getN3())/3.0;
                            
                            if (na < 56) {
                                totalMhsTdkLulus ++;
                            }
                            
                            totalMhs++;
                        }
                    }
                }
            }
        }

        return "<" + totalMhsTdkLulus + "> dari <" + totalMhs + "> mahasiswa tidak lulus matakuliah <" + namaMK + ">" ;
    }

    public String printMatkulAmbilMhs(String NIM){
        for (User user : users) {
            if (user instanceof Mahasiswa) {
                Mahasiswa mhs = (Mahasiswa) user;

                if (mhs.getNIM().equalsIgnoreCase(NIM)) {
                    if (mhs instanceof Sarjana) {
                        Sarjana sarjana = ( Sarjana ) mhs;
                        String hasil = "Matkul Ambil: \n";
                        
                        for (MatkulAmbil matkulAmbil : sarjana.getMatkulAmbil()) {
                            int totalPresensi = 0;
                            for (Presensi presensi : matkulAmbil.getPresensi()) {
                                if (presensi.isHadir()) {
                                    totalPresensi++;
                                }
                            }
                            hasil += "\nNama: " + matkulAmbil.getMatkul().getNama() + "\nTotal Presensi: " + totalPresensi + "\n";
                        }
                        return hasil;
                    }

                    else if (mhs instanceof Magister) {
                        Magister magister = ( Magister ) mhs;
                        String hasil = "Matkul Ambil: \n";

                        for (MatkulAmbil matkulAmbil : magister.getMatkulAmbil()) {
                            int totalPresensi = 0;
                            for (Presensi presensi : matkulAmbil.getPresensi()) {
                                if (presensi.isHadir()) {
                                    totalPresensi++;
                                }
                            }
                            hasil += "\nNama: " + matkulAmbil.getMatkul().getNama() + "\nTotal Presensi: " + totalPresensi + "\n";
                        }
                        return hasil;
                    }
                    else{
                        return "Mahasiwa bukan mahasiswa program Sarjana ataupun Magister";
                    }
                }
            }
        }
        return "NIM tidak ditemukan";
    }

    public String printTotalJamNgajar(String NIK){
        for (User user : users) {
            if (user instanceof Staff) {
                Staff staff = (Staff) user;

                if (staff instanceof Dosen && staff.getNIK().equalsIgnoreCase(NIK)) {
                    Dosen dosen = (Dosen) staff;

                    int totalJamNgajar = 0;
                    for (MatkulAjar matkulAjar : dosen.getMatkulAjar()) {
                        for (PresensiStaff presensi : matkulAjar.getListPresensi()) {
                            if (presensi.isHadir()) {
                                totalJamNgajar += presensi.getJam();
                            }
                        }
                    }
                    return "Total jam mengajar: " + totalJamNgajar;
                }
            }
        }
        return "NIK Dosen tidak ditemukan";
    }

    public String printGajiStaff(String NIK){
        double gaji = 0;
        for (User user : users) {

            if (user instanceof Staff) {
                Staff staff = (Staff) user;
                if (staff.getNIK().equalsIgnoreCase(NIK)) {
                    if (staff instanceof Karyawan) {
                        Karyawan karyawan = (Karyawan) user;
                        gaji = karyawan.getUnit()/22 * karyawan.getSalary();
                    }
                    else if(staff instanceof DosenTetap){
                        DosenTetap dosenTetap = (DosenTetap) user;
                        gaji = dosenTetap.getSalary() + (dosenTetap.getUnit()*25000);
                    }
                    else if(staff instanceof Honorer){
                        Honorer dosenHonorer = (Honorer) user;
                        gaji = (dosenHonorer.getUnit()*dosenHonorer.getHonorPerSKS());
                    }else{
                        return "Tidak ada staff tersebut.";
                    }
                }
            }
        }

        return "Total gaji " + gaji;
    }

}
