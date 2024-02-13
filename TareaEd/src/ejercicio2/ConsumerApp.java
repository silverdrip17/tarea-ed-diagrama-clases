package ejercicio2;

public class ConsumerApp {
	 private Product[] shoppingList;
	    private int itemCount;

	    public ConsumerApp() {
	        shoppingList = new Product[100];
	        itemCount = 0;
	    }

	    public void addProduct(Product product) {
	        if (itemCount < 100) {
	            shoppingList[itemCount++] = product;
	        } else {
	            System.out.println("La lista de compras está llena. No se pueden agregar más productos.");
	        }
	    }

	    public void removeProduct(Product product) {
	        for (int i = 0; i < itemCount; i++) {
	            if (shoppingList[i].equals(product)) {
	                // Shift elements to left to remove the product
	                for (int j = i; j < itemCount - 1; j++) {
	                    shoppingList[j] = shoppingList[j + 1];
	                }
	                shoppingList[itemCount - 1] = null;
	                itemCount--;
	                return;
	            }
	        }
	        System.out.println("El producto no está en la lista de compras.");
	    }

	    public void viewShoppingList() {
	        System.out.println("Lista de compras:");
	        for (int i = 0; i < itemCount; i++) {
	            System.out.println(shoppingList[i]);
	        }
	    }
}
