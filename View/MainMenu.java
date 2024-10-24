package View;

import javax.swing.JOptionPane;

import java.util.ArrayList;
import Model.*;
import Controller.SIA_Controller;

public class MainMenu {
    private SIA_Controller controller;
    
    public MainMenu(SIA_Controller controller) {
        this.controller = controller;
    }

    public SIA_Controller getController() {
        return controller;
    }

    public void mainMenu(ArrayList<User> users) {
        while(true) {
            String[] options = {
                "Print User Data", 
                "Print Nilai Akhir", 
                "Print Rata-Rata Nilai Akhir", 
                "Print Banyak Mhs Tidak Lulus", 
                "Print Matkul Ambil Mhs", 
                "Print Total Jam Ngajar", 
                "Print Gaji Staff", 
                "Exit"
            };
    
            // Menggunakan showInputDialog untuk menampilkan pilihan vertikal
            String choice = (String) JOptionPane.showInputDialog(
                null, 
                "Pilih fungsi:", 
                "SIA Controller", 
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                options, 
                options[0]
            );
    
            if (choice == null || choice.equals("Exit")) {
                JOptionPane.showMessageDialog(null, "Program selesai");
                System.exit(0);
            }
    
            switch (choice) {
                case "Print User Data":
                    String nama = JOptionPane.showInputDialog("Masukkan nama user:");
                    JOptionPane.showMessageDialog(null, controller.printUserData(nama));
                    break;
                case "Print Nilai Akhir":
                    String nim = JOptionPane.showInputDialog("Masukkan NIM mahasiswa:");
                    String kodeMK = JOptionPane.showInputDialog("Masukkan kode mata kuliah:");
                    JOptionPane.showMessageDialog(null, controller.printNilaiAkhir(nim, kodeMK));
                    break;
                case "Print Rata-Rata Nilai Akhir":
                    kodeMK = JOptionPane.showInputDialog("Masukkan kode mata kuliah:");
                    JOptionPane.showMessageDialog(null, controller.printRataNA(kodeMK));
                    break;
                case "Print Banyak Mhs Tidak Lulus":
                    kodeMK = JOptionPane.showInputDialog("Masukkan kode mata kuliah:");
                    JOptionPane.showMessageDialog(null, controller.printBanyakMhsTidakLulus(kodeMK));
                    break;
                case "Print Matkul Ambil Mhs":
                    nim = JOptionPane.showInputDialog("Masukkan NIM mahasiswa:");
                    JOptionPane.showMessageDialog(null, controller.printMatkulAmbilMhs(nim));
                    break;
                case "Print Total Jam Ngajar":
                    String nik = JOptionPane.showInputDialog("Masukkan NIK dosen:");
                    JOptionPane.showMessageDialog(null, controller.printTotalJamNgajar(nik));
                    break;
                case "Print Gaji Staff":
                    nik = JOptionPane.showInputDialog("Masukkan NIK staff:");
                    JOptionPane.showMessageDialog(null, controller.printGajiStaff(nik));
                    break;
            }
        }
    }
    
    
   
}
