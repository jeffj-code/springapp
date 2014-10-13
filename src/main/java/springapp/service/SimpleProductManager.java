package springapp.service;

import springapp.domain.Product;

import java.util.List;

public class SimpleProductManager implements ProductManager {

    private List<Product> products;

    //todo: implement getProducts()
    public List<Product> getProducts() {
        return products;
    }

    //todo: implement increasePrice()
    public void increasePrice(int percentage) {
        if (products != null) {
            for (Product product : products) {
                double newPrice = product.getPrice().doubleValue() * (100 + percentage) / 100;
                product.setPrice(newPrice);
            }
        }

    }

    //todo: implement setProducts()
    public void setProducts(List<Product> products) {
        this.products = products;
    }

}