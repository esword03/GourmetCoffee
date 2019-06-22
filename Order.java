import java.util.*;
public class Order implements Iterable<OrderItem>{
	
	private ArrayList<OrderItem> items;
	
	public Order() {
		items= new ArrayList<OrderItem>();
	}
	public Iterator<OrderItem> iterator(){
		return items.iterator();
	}
	public void addItem(OrderItem orderItem) {
		items.add(orderItem);
		
	}
	public void removeItem(OrderItem orderItem) {
		items.remove(orderItem);
		}
	public OrderItem getItem(Product product) {
		if(items==null) {
			return null;
		}
		for(OrderItem item:items) {
			if(item.getProduct()==product) {
				return item;
			}
		}
		return null;
	}
	public int getNumberOfItems() {
		return items.size();
	}
	public double getTotalCost() {
		double sum=0;
		for(OrderItem item1:items) {
			double cost=item1.getValue();
			sum+=cost;
		}
		return sum;
	}

}
