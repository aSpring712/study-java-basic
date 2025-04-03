package access.quiz;

/**
 * Shopping Cart
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-03
 * @version 1.0
 */
public class ShoppingCart {

	private Item[] items = new Item[10];
	private int itemCount;

	public void addItem(Item item) {

		if (itemCount >= items.length) {
			System.out.println("장바구니가 가득 찼습니다.");
			return;
		}

		this.items[this.itemCount] = item;
		this.itemCount++;
	}

	public void displayItems() {

		System.out.println("장바구니 상품 출력");

		for (int i = 0; i < itemCount; i++) {
			Item item = items[i];
			System.out.println("상품명: " + item.getName() + ", 합계: " + item.getTotalPrice());
		}

		System.out.println("전체 가격 합: " + calculateTotalPrice());

	}

	// 이 메서드 내부에서만 사용되므로 private 접근 제어자를 사용한다.
	private int calculateTotalPrice() {

		int totalPrice = 0;

		for (int i = 0; i < itemCount; i++) {
			Item item = items[i];
			totalPrice += item.getTotalPrice();
		}

		return totalPrice;
	}
}