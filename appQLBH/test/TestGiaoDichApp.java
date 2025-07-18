public class TestGiaoDichApp {
    public static void chayThu() {
        GiaoDichApp app = new GiaoDichApp();

        GiaoDich g1 = new GiaoDich("KH001", "HH01", 3, 60000); // thành tiền = 60.000
        GiaoDich g2 = new GiaoDich("KH002", "HH02", 5, 100000); // thành tiền = 100.000

        app.themGiaoDich(g1);
        app.themGiaoDich(g2);

        System.out.println("================ DANH SÁCH SAU KHI THÊM ================");
        app.hienThiGiaoDich();

        System.out.println("================ SAU KHI XOÁ KH001 ================");
        app.xoaGiaoDich("KH001");
        app.hienThiGiaoDich();

        System.out.println("================ SỬA GIAO DỊCH CỦA KH002 ================");
        app.suaGiaoDich("KH002");

        System.out.println("================ DANH SÁCH CUỐI CÙNG ================");
        app.hienThiGiaoDich();
    }
}