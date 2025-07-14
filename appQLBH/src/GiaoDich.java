public class GiaoDich{
    private String maKhachHang;
    private String maHangHoa;
    private int soLuong;
    private double thanhTien;
    
    public GiaoDich(String maKH, String maHH, int soLuong, double thanhTien) {
        this.maKhachHang = maKH;
        this.maHangHoa = maHH;
        this.soLuong = soLuong;
        this.thanhTien = thanhTien;
    }

    public String toString() {
        return "GiaoDich{" + "maKhachHang='" + maKhachHang + '\'' + ", maHangHoa='" + maHangHoa + '\'' + ", soLuong=" + soLuong + ", thanhTien=" + thanhTien + '}';
    }
}
