package Ejercicio4;
import java.util.ArrayList;
import java.util.List;

public class Invoice {
	 private String customer;
	    private List<Product> products;

	    public Invoice(String customer) {
	        this.customer = customer;
	        this.products = new ArrayList<>();
	    }

	    public void add(Product product) {
	        products.add(product);
	    }

	    public void remove(int index) {
	        if (index >= 0 && index < products.size()) {
	            products.remove(index);
	        }
	    }

	    public float total() {
	        float total = 0;
	        for (Product product : products) {
	            total += product.total();
	        }
	        return total;
	    }
}
