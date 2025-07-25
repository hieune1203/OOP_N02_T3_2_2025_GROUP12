import java.util.ArrayList;
import java.util.Scanner;

public class GiaoDichApp {
    ArrayList<GiaoDich> listGiaoDich = new ArrayList<>();

    public void themGiaoDich(GiaoDich g) {
        listGiaoDich.add(g);
    }

    public void xoaGiaoDich(String maKhachHang) {
        for (int i = 0; i < listGiaoDich.size(); i++) {
            if (listGiaoDich.get(i).maKhachHang.equals(maKhachHang)) {
                listGiaoDich.remove(i);
                break;
            }
        }
    }

    public void hienThiGiaoDich() {
        for (GiaoDich g : listGiaoDich) {
            System.out.println(g);
        }
    }

    public void suaGiaoDich(String maKhachHang) {
        Scanner sc = new Scanner(System.in);
        for (GiaoDich g : listGiaoDich) {
            if (g.maKhachHang.equals(maKhachHang)) {
                System.out.print("Nhập mã hàng hóa mới: ");
                g.maHangHoa = sc.nextLine();

                System.out.print("Nhập số lượng mới: ");
                g.soLuong = Integer.parseInt(sc.nextLine());

                System.out.print("Nhập thành tiền mới: ");
                g.thanhTien = Double.parseDouble(sc.nextLine());

                break;
            }
        }
    }
}
