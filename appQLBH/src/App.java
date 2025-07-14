public class App {
    public static void main(String[] args) throws Exception {
       KhachHang kh1 = new KhachHang ("PTH1", "PhanTrongHieu", "12345567");
       KhachHang kh2 = new KhachHang ("PTH2", "PhanTrongHieu2", "123455678");

       HangHoa hh1 = new HangHoa("HH1","Banh mi", "15000");
       HangHoa hh2 = new HangHoa("HH2","Sua Chua", "20000");

       int soLuong = 10;

       double thanhTien = soLuong * hh1.getDonGia();
       GiaoDich gd1 = new GiaoDich(kh1.getMaKhachHang(), hh1.getMaHangHoa(), soLuong , thanhTien);

       System.out.println("Khach Hang: " + kh1);
       System.out.println("Hang Hoa: " + hh1.getTenHangHoa() + " - Don gia: " + hh1.getDonGia);
       System.out.println("Giao dich: " + gd1);

    }
}
