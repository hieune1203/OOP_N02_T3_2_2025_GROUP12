import java.util.ArrayList;
import java.util.Scanner;

class HangHoa {
    private String maHang;
    private String tenHang;
    private double giaBan;
    private int soLuong;

    public HangHoa(String maHang, String tenHang, double giaBan, int soLuong) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
    }

    public void hienThi() {
        System.out.println(maHang + " - " + tenHang + " - " + giaBan + " VND - SL: " + soLuong);
    }
}

class TaoHangHoa {
    ArrayList<HangHoa> dsHangHoa = new ArrayList<>();

    public void taoMoiHangHoa() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập mã hàng: ");
        String ma = scanner.nextLine();

        System.out.print("Nhập tên hàng: ");
        String ten = scanner.nextLine();

        System.out.print("Nhập giá bán: ");
        double gia = scanner.nextDouble();

        System.out.print("Nhập số lượng tồn kho: ");
        int sl = scanner.nextInt();

        HangHoa hh = new HangHoa(ma, ten, gia, sl);
        dsHangHoa.add(hh);

        System.out.println("✅ Đã thêm hàng hóa mới thành công!");
    }

    public void hienThiDanhSach() {
        for (HangHoa hh : dsHangHoa) {
            hh.hienThi();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        TaoHangHoa taoHH = new TaoHangHoa();

        taoHH.taoMoiHangHoa();
        taoHH.hienThiDanhSach();
    }
}
