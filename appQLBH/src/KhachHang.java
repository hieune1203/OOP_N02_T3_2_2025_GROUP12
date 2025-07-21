public class KhachHang {
    public String maKhachHang;
    public String tenKhachHang;
    public String diaChi;
    public String soDienThoai;

    public KhachHang(String maKH, String tenKH, String diaChi, String sdt) {
        this.maKhachHang = maKH;
        this.tenKhachHang = tenKH;
        this.diaChi = diaChi;
        this.soDienThoai = sdt;
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "maKhachHang='" + maKhachHang + '\'' +
                ", tenKhachHang='" + tenKhachHang + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", soDienThoai='" + soDienThoai + '\'' +
                '}';
    }
}
