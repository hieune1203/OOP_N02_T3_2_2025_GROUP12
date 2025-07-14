import java.io.*;
import java.util.*;

class HangHoa implements Serializable {
    String ma, ten;
    double gia;
    int sl;

    public HangHoa(String ma, String ten, double gia, int sl) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.sl = sl;
    }

    public String toString() {
        return ma + " - " + ten + " - " + gia + "đ - SL: " + sl;
    }
}

public class Main {
    static final String FILE = "hanghoa.dat";
    static List<HangHoa> ds = new ArrayList<>();

    public static void main(String[] args) {
        docFile();

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã hàng: ");
        String ma = sc.nextLine();

        if (ktTrung(ma)) {
            System.out.println(" Mã hàng đã tồn tại.");
        } else {
            System.out.print("Tên hàng: ");
            String ten = sc.nextLine();
            System.out.print("Giá: ");
            double gia = sc.nextDouble();
            System.out.print("Số lượng: ");
            int sl = sc.nextInt();

            ds.add(new HangHoa(ma, ten, gia, sl));
            ghiFile();
            System.out.println(" Thêm thành công!");
        }

        System.out.println("\n📦 Danh sách hàng:");
        ds.forEach(System.out::println);
    }

    static boolean ktTrung(String ma) {
        return ds.stream().anyMatch(h -> h.ma.equalsIgnoreCase(ma));
    }

    static void ghiFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE))) {
            oos.writeObject(ds);
        } catch (Exception e) {
            System.out.println("Lỗi ghi file: " + e);
        }
    }

    static void docFile() {
        File f = new File(FILE);
        if (!f.exists()) return;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE))) {
            ds = (List<HangHoa>) ois.readObject();
        } catch (Exception e) {
            System.out.println("Lỗi đọc file: " + e);
        }
    }
}
