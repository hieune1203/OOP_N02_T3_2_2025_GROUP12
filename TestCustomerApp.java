public class TestCustomerApp {
    public static void test() {
        CustomerApp customerApp = new CustomerApp();

        Customer c1 = new Customer("C001", "Nguyen Van A", "a@gmail.com");
        Customer c2 = new Customer("C002", "Le Thi B", "b@gmail.com");

        customerApp.addCustomer(c1);
        customerApp.addCustomer(c2);

        System.out.println("===== Danh sách sau khi thêm =====");
        customerApp.readCustomers();

        System.out.println("===== Danh sách sau khi xóa khách hàng C001 =====");
        customerApp.deleteCustomer("C001");
        customerApp.readCustomers();

        System.out.println("===== Danh sách sau khi sửa khách hàng C002 =====");
        customerApp.editCustomer("C002");
        customerApp.readCustomers();
    }
}
