import java.util.ArrayList;
import java.util.Scanner;

public class CustomerApp {

    ArrayList<Customer> listCustomers = new ArrayList<>();

    public ArrayList<Customer> addCustomer(Customer c) {
        listCustomers.add(c);
        return listCustomers;
    }

    public ArrayList<Customer> deleteCustomer(String customerId) {
        for (int i = 0; i < listCustomers.size(); i++) {
            if (listCustomers.get(i).customerID.equals(customerId)) {
                listCustomers.remove(i);
                break;
            }
        }
        return listCustomers;
    }

    public ArrayList<Customer> editCustomer(String customerId) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < listCustomers.size(); i++) {
            if (listCustomers.get(i).customerID.equals(customerId)) {
                System.out.print("Nhập tên mới: ");
                String newName = scanner.nextLine();

                System.out.print("Nhập email mới: ");
                String newEmail = scanner.nextLine();

                listCustomers.get(i).name = newName;
                listCustomers.get(i).email = newEmail;
                break;
            }
        }

        return listCustomers;
    }

    public void readCustomers() {
        for (Customer c : listCustomers) {
            System.out.println("ID: " + c.customerID);
            System.out.println("Tên: " + c.name);
            System.out.println("Email: " + c.email);
            System.out.println();
        }
    }
}
