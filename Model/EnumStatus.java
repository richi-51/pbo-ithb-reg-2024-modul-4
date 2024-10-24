package Model;

public enum EnumStatus {
    HADIR(1), ALPHA(0);

    private final int status;

    public int getStatus() {
        return status;
    }

    private EnumStatus(int status) {
        this.status = status;
    }


}
