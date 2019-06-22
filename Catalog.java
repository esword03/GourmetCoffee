
import java.util.*;
public class Catalog implements Iterable<Product>{
	
	private ArrayList<Product> products;
	
	public Catalog() {
		products=new ArrayList<Product>();
	}
	public void addProduct(Product newProduct) {
		products.add(newProduct);
	}
	public Product getProduct(String code) {
		for(Product p : products) {
			if(p.getCode().equals(code))
			return p;
		}
		return null;
	}
	public Iterator<Product> iterator(){
		return products.iterator();
	}
	public int getNumberOfProducts() {
		return products.size();
	}

}
