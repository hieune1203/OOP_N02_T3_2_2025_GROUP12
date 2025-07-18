public class TestProductApp {
    public static void test() {
        ProductApp productApp = new ProductApp();

        Product p1 = new Product("P001", "Banh Mi", 15000);
        Product p2 = new Product("P002", "Sua Tuoi", 12000);

        productApp.addProduct(p1);
        productApp.addProduct(p2);

        System.out.println("==================Danh sach sau khi them hang hoa:==================");
        productApp.readProducts();

        System.out.println("==================Danh sach sau khi xoa P001:=======================");
        productApp.deleteProduct("P001");
        productApp.readProducts();

        System.out.println("==================Danh sach sau khi edit P002:======================");
        productApp.editProduct("P002");

        System.out.println("==================Danh sach hien tai:===============================");
        productApp.readProducts();
    }
}
