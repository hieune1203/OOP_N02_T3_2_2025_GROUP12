import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyKhachHang {
    static class KhachHang {
        private String maKhachHang;
        private String tenKhachHang;
        private String soDienThoai;

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
    }

    static class DanhSachKhachHang {
        private List<KhachHang> danhSach;

        public DanhSachKhachHang() {
            this.danhSach = new ArrayList<>();
        }

        public boolean kiemTraTonTai(String maKH) {
            for (KhachHang kh : danhSach) {
                if (kh.getMaKhachHang().equalsIgnoreCase(maKH)) {
                    return true;
                }
            }
            return false;
        }

        public void themKhachHang(String maKH, String tenKH, String sdt) {
            if (kiemTraTonTai(maKH)) {
                System.out.println(" Khách hàng đã tồn tại. Không thêm mới.");
            } else {
                KhachHang kh = new KhachHang(maKH, tenKH, sdt);
                danhSach.add(kh);
                System.out.println(" Thêm khách hàng thành công.");
            }
        }

        public void hienThiTatCa() {
            System.out.println(" Danh sách khách hàng:");
            for (KhachHang kh : danhSach) {
                System.out.println(kh);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachKhachHang dskh = new DanhSachKhachHang();

        System.out.println("=== NHẬP THÔNG TIN KHÁCH HÀNG ===");

        System.out.print("Nhập mã khách hàng: ");
        String maKH = sc.nextLine();

        System.out.print("Nhập tên khách hàng: ");
        String tenKH = sc.nextLine();

        System.out.print("Nhập số điện thoại: ");
        String sdt = sc.nextLine();

        dskh.themKhachHang(maKH, tenKH, sdt);

        System.out.println("\n== DANH SÁCH KHÁCH HÀNG HIỆN TẠI ==");
        dskh.hienThiTatCa();

        sc.close();
    }
}
