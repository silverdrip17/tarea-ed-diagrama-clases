package Ejercicio4;

public class Product {
	 private String name;
	    private int qty;
	    private float price;

	    public Product() {
	        // Constructor vacío
	    }

	    public Product(String name, int qty, float price) {
	        this.name = name;
	        this.qty = qty;
	        this.price = price;
	    }

	    @Override
	    public String toString() {
	        return "Product [name=" + name + ", qty=" + qty + ", price=" + price + "]";
	    }

	    public float total() {
	        return qty * price;
	    }
}
