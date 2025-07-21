import java.util.ArrayList;
import java.util.Scanner;
class TaoHangHoa {

    ArrayList<HangHoa> dsHangHoa = new ArrayList<>();

    public void taoMoiHangHoa() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập mã hàng: ");
        String maHang = scanner.nextLine();

        System.out.print("Nhập tên hàng: ");
        String tenHang = scanner.nextLine();

        System.out.print("Nhập giá bán: ");
        double giaBan = scanner.nextDouble();

        System.out.print("Nhập số lượng tồn kho: ");
        int soLuong = scanner.nextInt();

        HangHoa hh = new HangHoa(maHang, tenHang, giaBan, soLuong);
        dsHangHoa.add(hh);

        System.out.println(" Đã thêm hàng hóa mới thành công!");
    }

    public void hienThiDanhSach() {
        for (HangHoa hh : dsHangHoa) {
            hh.hienThi();
        }
    }
}
