import java.util.*;
import java.util.Date;

public class TestGiaoDich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GiaoDichApp app = new GiaoDichApp();

        System.out.println("=== TẠO GIAO DỊCH MỚI ===");

        System.out.print("Nhập mã khách hàng: ");
        String maKH = sc.nextLine();

        System.out.print("Nhập mã hàng hóa: ");
        String maHH = sc.nextLine();

        System.out.print("Nhập tên hàng hóa: ");
        String tenHH = sc.nextLine();

        System.out.print("Nhập đơn giá: ");
        double donGia = Double.parseDouble(sc.nextLine());

        System.out.print("Nhập số lượng: ");
        int soLuong = Integer.parseInt(sc.nextLine());

        double thanhTien = donGia * soLuong;

        Date ngayGD = new Date();

        SanPham sp = new SanPham(maHH, tenHH, donGia);
        MatHangMua mh = new MatHangMua(sp, soLuong);

        System.out.println(">>> Chi tiết mặt hàng mua: " + mh);

        GiaoDich g = new GiaoDich(maKH, maHH, soLuong, thanhTien, ngayGD);

        app.themGiaoDich(g);

        System.out.println("\n=== DANH SÁCH GIAO DỊCH HIỆN TẠI ===");
        app.hienThiGiaoDich();
    }
}
