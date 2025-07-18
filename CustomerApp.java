import java.util.ArrayList;
import java.util.Scanner;

public class CustomerApp {

    ArrayList<Customer> listCustomers = new ArrayList<>();

    public ArrayList<Customer> addCustomer(Customer c) {
        listCustomers.add(c);
        return listCustomers;
    }

    public ArrayList<Customer> deleteCustomer(String customerID) {
        for (int i = 0; i < listCustomers.size(); i++) {
            if (listCustomers.get(i).customerID.equals(customerID)) {
                listCustomers.remove(i);
                break;
            }
        }
        return listCustomers;
    }

    public void readCustomers() {
        for (Customer c : listCustomers) {
            System.out.println("Customer ID: " + c.customerID);
            System.out.println("Name: " + c.name);
            System.out.println("Email: " + c.email);
            System.out.println();
        }
    }

    public ArrayList<Customer> editCustomer(String customerID) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < listCustomers.size(); i++) {
            if (listCustomers.get(i).customerID.equals(customerID)) {
                System.out.print("Enter new name: ");
                String newName = scanner.nextLine();

                System.out.print("Enter new email: ");
                String newEmail = scanner.nextLine();

                listCustomers.get(i).name = newName;
                listCustomers.get(i).email = newEmail;
                break;
            }
        }

        return listCustomers;
    }
}
