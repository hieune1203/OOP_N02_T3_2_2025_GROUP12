import java.util.ArrayList;
import java.util.Scanner;

public class KhachHangApp {
    ArrayList<KhachHang> listKhachHang = new ArrayList<>();

    public void themKhachHang(KhachHang kh) {
        listKhachHang.add(kh);
    }

    public void xoaKhachHang(String maKhachHang) {
        for (int i = 0; i < listKhachHang.size(); i++) {
            if (listKhachHang.get(i).maKhachHang.equals(maKhachHang)) {
                listKhachHang.remove(i);
                break;
            }
        }
    }

    public void hienThiKhachHang() {
        for (KhachHang kh : listKhachHang) {
            System.out.println(kh);
        }
    }

    public void suaKhachHang(String maKhachHang) {
        Scanner sc = new Scanner(System.in);
        for (KhachHang kh : listKhachHang) {
            if (kh.maKhachHang.equals(maKhachHang)) {
                System.out.print("Nhập tên mới: ");
                kh.tenKhachHang = sc.nextLine();

                System.out.print("Nhập địa chỉ mới: ");
                kh.diaChi = sc.nextLine();

                System.out.print("Nhập số điện thoại mới: ");
                kh.soDienThoai = sc.nextLine();

                break;
            }
        }
    }
}
