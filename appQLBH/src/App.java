public class App {
    public static void main(String[] args) throws Exception {
       String maKH = "PTH12";
       String maHH = "HH2C";
       int soLuong = 10;
       double donGia = 15000;

       double thanhTien = soLuong * donGia;

       GiaoDich gd = new GiaoDich(maKH, maHH, soLuong, thanhTien);
       
       System.out.println(gd.toString());
}
