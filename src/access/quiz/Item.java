package access.quiz;

/**
 * Item
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-03
 * @version 1.0
 */
public class Item {

	private String name; // 상품명
	private int price; // 가격
	private int quantity; // 수량

	public Item(String productName, int price, int quantity) {
		this.name = productName;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return this.name;
	}

	public int getTotalPrice() {
		return this.price * this.quantity;
	}
}