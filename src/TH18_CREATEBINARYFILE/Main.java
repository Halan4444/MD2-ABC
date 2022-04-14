package TH18_CREATEBINARYFILE;

import TH18_CREATEBINARYFILE.MODEL.Product;
import TH18_CREATEBINARYFILE.SERVICE.ProductService;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void display(List list) {
        for (int i=0; i< list.size();i++){
            System.out.println(list.get(i));
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ProductService productService = new ProductService();

        // Test display all
        System.out.println("===Test display product===");
        List<Product> productList = productService.findAll();
        Writer.write("product.data",productList);
        List<Product> outputList = Writer.read("product.data");
        display(outputList);

        // Test add product:
        System.out.println("===Test add product===");
        productService.add(new Product(5,"DVD","LG",500000,"Very good"));
        productService.add(new Product(6,"Oven","Lock&lock",2500000,"Very good"));
        Writer.write("product.data",productService.findAll());
        outputList = Writer.read("product.data");
        display(outputList);

        //Test find product by name:
        System.out.println("===Test find product===");
        List<Product> foundedProducts = productService.findByName("TV");
        Writer.write("foundedProduct.data",foundedProducts);
        outputList = Writer.read("foundedProduct.data");
        display(outputList);

    }
}
