public class TestKhachHangApp {
    public static void chayThu() {
        KhachHangApp app = new KhachHangApp();

        app.themKhachHang(new KhachHang("KH001", "Nguyen Van A", "Ha Noi", "0123456789"));
        app.themKhachHang(new KhachHang("KH002", "Tran Thi B", "Da Nang", "0987654321"));

        System.out.println("=== DANH SÁCH SAU KHI THÊM ===");
        app.hienThiKhachHang();

        System.out.println("=== DANH SÁCH SAU KHI XOÁ KH001 ===");
        app.xoaKhachHang("KH001");
        app.hienThiKhachHang();

        System.out.println("=== SỬA KHÁCH HÀNG KH002 ===");
        app.suaKhachHang("KH002");

        System.out.println("=== DANH SÁCH CUỐI CÙNG ===");
        app.hienThiKhachHang();
    }
}
