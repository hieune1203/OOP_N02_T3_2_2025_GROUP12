public class TestGiaoDichApp {
    public static void chayThu() {
        GiaoDichApp app = new GiaoDichApp();

        // Thêm giao dịch
        app.themGiaoDich(new GiaoDich("KH001", "HH01", 3, 60000));
        app.themGiaoDich(new GiaoDich("KH002", "HH02", 5, 100000));

        System.out.println("=== DANH SÁCH SAU KHI THÊM ===");
        app.hienThiGiaoDich();

        System.out.println("=== DANH SÁCH SAU KHI XOÁ KH001 ===");
        app.xoaGiaoDich("KH001");
        app.hienThiGiaoDich();

        System.out.println("=== SỬA GIAO DỊCH KH002 ===");
        app.suaGiaoDich("KH002");

        System.out.println("=== DANH SÁCH CUỐI CÙNG ===");
        app.hienThiGiaoDich();
    }
}