import java.util.ArrayList;
import java.util.Scanner;

public class ProductApp {
    ArrayList<Product> listProducts = new ArrayList<>();

    public ArrayList<Product> addProduct(Product p) {
        listProducts.add(p);
        return listProducts;
    }

    public ArrayList<Product> deleteProduct(String productId) {
        for (int i = 0; i < listProducts.size(); i++) {
            if (listProducts.get(i).productID.equals(productId)) {
                listProducts.remove(i);
                break;
            }
        }
        return listProducts;
    }

    public void readProducts() {
        for (Product product : listProducts) {
            System.out.println("Product ID: " + product.productID);
            System.out.println("Name: " + product.name);
            System.out.println("Price: " + product.price);
            System.out.println();
        }
    }

    public ArrayList<Product> editProduct(String productId) {
        for (int i = 0; i < listProducts.size(); i++) {
            if (listProducts.get(i).productID.equals(productId)) {
                Scanner input = new Scanner(System.in);

                System.out.print("Enter new name: ");
                String newName = input.nextLine();

                System.out.print("Enter new price: ");
                double newPrice = input.nextDouble();

                listProducts.get(i).name = newName;
                listProducts.get(i).price = newPrice;

                break;
            }
        }

        return listProducts;
    }
}
