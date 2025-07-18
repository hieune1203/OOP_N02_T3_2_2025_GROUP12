public class GiaoDich{
    public String maKhachHang;
    public String maHangHoa;
    public int soLuong;
    public double thanhTien;
    
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
