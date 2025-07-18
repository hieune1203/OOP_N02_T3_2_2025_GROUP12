import java.util.ArrayList;
import java.util.Scanner;

public class GiaoDichApp {

    // Khai báo và khởi tạo danh sách giao dịch
    ArrayList<GiaoDich> danhSachGiaoDich = new ArrayList<>();

    public ArrayList<GiaoDich> themGiaoDich(GiaoDich g) {
        danhSachGiaoDich.add(g);
        return danhSachGiaoDich;
    }

    public ArrayList<GiaoDich> xoaGiaoDich(String maKhachHang) {
        for (int i = 0; i < danhSachGiaoDich.size(); i++) {
            if (danhSachGiaoDich.get(i).maKhachHang.equals(maKhachHang)) {
                danhSachGiaoDich.remove(i);
                break;
            }
        }
        return danhSachGiaoDich;
    }

    public ArrayList<GiaoDich> suaGiaoDich(String maKhachHang) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < danhSachGiaoDich.size(); i++) {
            if (danhSachGiaoDich.get(i).maKhachHang.equals(maKhachHang)) {
                System.out.print("Nhập mã hàng hóa mới: ");
                String maMoi = sc.nextLine();

                System.out.print("Nhập số lượng mới: ");
                int soLuongMoi = Integer.parseInt(sc.nextLine());

                System.out.print("Nhập đơn giá mới: ");
                double donGiaMoi = Double.parseDouble(sc.nextLine());

                danhSachGiaoDich.get(i).maHangHoa = maMoi;
                danhSachGiaoDich.get(i).soLuong = soLuongMoi;
                danhSachGiaoDich.get(i).thanhTien = soLuongMoi * donGiaMoi;

                break;
            }
        }
        return danhSachGiaoDich;
    }

    public void hienThiGiaoDich() {
        if (danhSachGiaoDich == null || danhSachGiaoDich.isEmpty()) {
            System.out.println("Danh sách giao dịch hiện đang rỗng.");
            return;
        }
        for (GiaoDich g : danhSachGiaoDich) {
            System.out.println("Mã khách hàng: " + g.maKhachHang);
            System.out.println("Mã hàng hóa: " + g.maHangHoa);
            System.out.println("Số lượng: " + g.soLuong);
            System.out.println("Thành tiền: " + g.thanhTien);
            System.out.println();
        }
    }
}
