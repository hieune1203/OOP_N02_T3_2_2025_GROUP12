public class KhachHang {
<<<<<<< HEAD
    private String maKhachHang;
    private String tenKhachHang;
    private String soDienThoai;

    public KhachHang(String maKH, String tenKH, String soDienThoai) {
        this.maKhachHang = maKH;
        this.tenKhachHang = tenKH;
        this.soDienThoai = soDienThoai;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKH) {
        this.maKhachHang = maKH;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String toString() {
        return "KhachHang{" + "maKhachHang='" + maKhachHang + '\'' + ", tenKhachHang='" + tenKhachHang + '\'' + ", soDienThoai='" + soDienThoai + '\'' + '}';
=======
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
>>>>>>> e187f79a18cd2e417d382c9f69ff7cc986e051bf
    }
}
