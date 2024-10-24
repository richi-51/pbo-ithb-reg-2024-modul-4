package Model;
import java.util.Date;

public class Presensi {
    private Date tanggal;
    private EnumStatus status; // Hadir, Alpha

    // Constructors
    public Presensi(Date tanggal, EnumStatus status) {
        this.tanggal = tanggal;
        this.status = status;
    }

    @Override
    public String toString() {
        String statusStr = (status == EnumStatus.HADIR)? "Hadir" : "Alpha";
        return tanggal + " : " + statusStr + "\n";
    }

    // Getter and Setter
    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public EnumStatus getStatus() {
        return status;
    }

    public void setStatus(EnumStatus status) {
        this.status = status;
    }

    public boolean isHadir(){
        return status == EnumStatus.HADIR;
    }

    
}
