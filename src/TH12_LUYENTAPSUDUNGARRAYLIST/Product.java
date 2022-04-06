package TH12_LUYENTAPSUDUNGARRAYLIST;

public class Product {

    private String productId;;
    private String productName;
    private double productPrice;

    public Product(String productid, String productName, double productPrice) {
        this.productId = productid;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductionById() {
        return productId;
    }

    public void setProductionById(String productid) {
        this.productId = productid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID='" + productId + '\'' +
                ", productNam='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductId() {
        return productId;
    }
}
