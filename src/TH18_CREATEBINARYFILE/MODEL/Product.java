package TH18_CREATEBINARYFILE.MODEL;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private String producer;
    private long price;
    private String description;

    public Product() {
    }

    public Product(int id, String name, String producer, long price, String description) {
        this.id = id;
        this.name = name;
        this.producer = producer;
        this.price = price;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
