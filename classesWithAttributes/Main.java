package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1, "Laptop", "Asus", 3000, 2, "Siyah");
		/*
		 * product.setName("Laptop"); product.setId(1); product.setDescription("HP");
		 * product.setPrice(7000); product.setStockAmount(5);
		 * product.setRenk("Kırmızı"); product.getKod();
		 */
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		productManager.Add2(1, "L", "Z", 3, 7000);
		System.out.println(product.getKod());

	}

}
