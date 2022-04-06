package TH12_LUYENTAPSUDUNGARRAYLIST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class ProductManager {
    static ArrayList <Product> productArraysList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    static {
        productArraysList.add(new Product("P001","T64-BV1",40000));
        productArraysList.add(new Product("P002","T84-OM1",60000));
        productArraysList.add(new Product("P003","T72-BE3",50000));
        productArraysList.add(new Product("P004","T90-A12",70000));
    }

    public void display() {
        for (Product product: productArraysList ) {
            System.out.println(product);
        }
    }
    public void add() {
        int count =0;
        while(true)
        {
            System.out.println("Product Id: ");
            String productId = scanner.nextLine();
            scanner.nextLine();
//            productId = scanner.nextLine();

            System.out.println("Product Name: ");
            String productName = scanner.nextLine();

            System.out.println("Product Price: ");
            double productPrice = scanner.nextDouble();

            Product newProduct = new Product(productId,productName,productPrice);
            productArraysList.add(newProduct);
            System.out.println("New Product was added! ");
            if(productId.isEmpty()){
            count++;

//           String input = scanner.nextLine(); String nextVal = input;
            }
            System.out.println("Nhập vào quit để thoát khỏi chương trình, phím bất kì để tiếp tục");
            String quit = scanner.next();
            if(quit.equalsIgnoreCase("\n")){
                System.out.println("vao if khong");
                return;
            }
        }
//        System.out.println("Product Id: ");
//        String productId = scanner.nextLine();
//
//        System.out.println("Product Name: ");
//        String productName = scanner.nextLine();
//
//        System.out.println("Product Price: ");
//        double productPrice = scanner.nextDouble();
//        Product newProduct = new Product(productId,productName,productPrice);
//        productArraysList.add(newProduct);
//        System.out.println("New Product was added! ");

//            System.out.println("Product Id: ");
//            String productId = scanner.nextLine();
//
//            System.out.println("Product Name: ");
//            String productName = scanner.nextLine();
//
//            System.out.println("Product Price: ");
//            double productPrice = scanner.nextDouble();
//            Product newProduct = new Product(productId,productName,productPrice);
//            productArraysList.add(newProduct);
//            System.out.println("New Product was added! ");

    }

    public void delete (String id) {
        int indexProductDelete = getProductIndexById(id);
        if (indexProductDelete!= -1) {
            productArraysList.remove(indexProductDelete);
            System.out.println("Product is deleted ! ");
        } else {
            System.out.println("Product is non-exits ! ");
        }
    }
    public void edit (String id) {
        int indexProductEditing = getProductIndexById(id);
        int choose = -1;
        String newProductId;
        String newProductName;
        double newProductPrice;

        if (indexProductEditing != 1) {
            showProductEditing(productArraysList.get(indexProductEditing));
            while (choose != 0) {
                System.out.println("What do you want to edit: ");
                choose = scanner.nextInt();
                switch (choose) {
                    case 1:
                        System.out.println("Enter new id: ");
                        newProductId = scanner.nextLine();
                        productArraysList.get(indexProductEditing).setProductId(newProductId);
                        System.out.println("Product is updated");
                        break;
                    case 2:
                        System.out.println("Enter new name: ");
                        newProductName = scanner.nextLine();
                        productArraysList.get(indexProductEditing).setProductId(newProductName);
                        System.out.println("Product is updated");
                        break;
                    case 3:
                        System.out.println("Enter new price: ");
                        newProductPrice = scanner.nextDouble();
                        productArraysList.get(indexProductEditing).setProductPrice(newProductPrice);
                        System.out.println("Product is updated");
                        break;
                    case 4:
                        choose = 0;
                        break;
                    default:
                        System.out.println("No choice selected! ");
                }
            }
        } else {
            System.out.println("Product id does not exit ");
        }
    }



    // Kiểm tra xem Id cần lấy có khớp với sản phẩm đã tồn tại không ?
    public int getProductIndexById(String id) {
        for (int i =0; i<productArraysList.size(); i++) {
            if (productArraysList.get(i).getProductId().equals(id)) {
                return i;
            }
        } return -1;
    }

    boolean getProductByName (String name) {
        boolean result = false;
        for (int i=0; i<productArraysList.size();i++) {
            if (productArraysList.get(i).getProductName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(productArraysList.get(i));
                result = true;
            }
        } return result;
    }
    public void sortProductByPriceAscending() {
        System.out.println("Product list sorted by Price ascending");
        Collections.sort(productArraysList, new ProductSortByPriceAscending());
    }
    public void sortProductByPriceDescending() {
        System.out.println("Product list sorted by Price descending");
        Collections.sort(productArraysList, new ProductSortByPriceDescending());
    }
    public void showProductEditing(Product product) {
        System.out.println("Enter your selection ");
        System.out.println("1. Id: "+product.getProductId());
        System.out.println("2. Name: "+product.getProductName());
        System.out.println("3. Name: "+product.getProductPrice());
        System.out.println("4. Exit ");
    }


}
