import java.util.Date;
public class GiaoDich{
    public String maKhachHang;
    public String maHangHoa;
    public int soLuong;
    public double thanhTien;
    public Date ngayGiaoDich;
    
    public GiaoDich(String maKH, String maHH, int soLuong, double thanhTien) {
        this.maKhachHang = maKH;
        this.maHangHoa = maHH;
        this.soLuong = soLuong;
        this.thanhTien = thanhTien;
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public String toString() {
        return"GiaoDich{" +
                "maKhachHang='" + maKhachHang + '\'' +
                ", maHangHoa='" + maHangHoa + '\'' +
                ", soLuong=" + soLuong +
                ", thanhTien=" + thanhTien +
                ", ngayGiaoDich=" + ngayGiaoDich +
                '}';
    }
}
