import java.util.ArrayList;
import java.util.Scanner;
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

        System.out.println(" Đã thêm hàng hóa mới thành công!");
    }

    public void hienThiDanhSach() {
        for (HangHoa hh : dsHangHoa) {
            hh.hienThi();
        }
    }
}
