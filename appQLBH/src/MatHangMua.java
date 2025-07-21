public class MatHangMua {
    private SanPham sanPham;
    private int soLuong;

    public MatHangMua(SanPham sanPham, int soLuong) {
        this.sanPham = sanPham;
        this.soLuong = soLuong;
    }

    public double tinhThanhTien() {
        return sanPham.getDonGia() * soLuong;
    }

    public String toString() {
        return sanPham.getTenSP() + " x " + soLuong + " = " + tinhThanhTien() + "đ";
    }
}