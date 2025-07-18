public class TestGiaoDichApp {
    public static void chayThu() {
        GiaoDichApp app = new GiaoDichApp();

        GiaoDich g1 = new GiaoDich("KH001", "HH01", 3, 60000); // thành tiền = 60.000
        GiaoDich g2 = new GiaoDich("KH002", "HH02", 5, 100000); // thành tiền = 100.000

        // Thêm giao dịch
        app.themGiaoDich(g1);
        app.themGiaoDich(g2);

        System.out.println("================ DANH SÁCH SAU KHI THÊM ================");
        app.hienThiGiaoDich();

        // Xóa giao dịch
        System.out.println("================ SAU KHI XOÁ KH001 ================");
        app.xoaGiaoDich("KH001");
        app.hienThiGiaoDich();

        // Sửa giao dịch
        System.out.println("================ SỬA GIAO DỊCH CỦA KH002 ================");
        app.suaGiaoDich("KH002");

        // Hiển thị danh sách hiện tại
        System.out.println("================ DANH SÁCH CUỐI CÙNG ================");
        app.hienThiGiaoDich();
    }
}