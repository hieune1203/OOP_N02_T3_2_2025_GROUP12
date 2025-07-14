public KhachHang(String maKhachHang, String tenKhachHang, String soDienThoai) {
    this.maKhachHang = maKhachHang;
    this.tenKhachHang = tenKhachHang;
    this.soDienThoai = soDienThoai;
}
public String getMaKhachHang() {
    return maKhachHang;
}
public void setMaKhachHang(String maKhachHang) {
    this.maKhachHang = maKhachHang;
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
    return "KhachHang{" +
            "maKhachHang='" + maKhachHang + '\'' +
            ", tenKhachHang='" + tenKhachHang + '\'' +
            ", soDienThoai='" + soDienThoai + '\'' +
            '}';
}