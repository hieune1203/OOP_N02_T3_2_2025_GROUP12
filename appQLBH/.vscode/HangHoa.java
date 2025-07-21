import java.util.ArrayList;
import java.util.Scanner;

class HangHoa {
    private String maHang;
    private String tenHang;
    private double giaBan;
    private int soLuong;

    public HangHoa(String maHang, String tenHang, double giaBan, int soLuong) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
    }
    public String getMaHang() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void hienThi() {
        System.out.println(maHang + " - " + tenHang + " - " + giaBan + " VND - SL: " + soLuong);
    }
}
