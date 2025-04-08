package extends1.quiz;

/**
 * Item
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-08
 * @version 1.0
 */
public class Item {

	private String name;
	private int price;

	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public int getPrice() {
		return this.price;
	}

	public void print() {
		System.out.println("이름: " + this.name + ", 가격: " + this.price);
	}
}