package class1.quiz;

/**
 * Product Order Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-02
 * @version 1.0
 */
public class ProductOrderMain {

	public static void main(String[] args) {

		// 여러 상품의 주문 정보를 담는 배열 생성
		ProductOrder[] orders = new ProductOrder[3];

		// 상품 주문 정보를 'ProductOrder' 타입의 변수로 받아 저장
		// 첫 번째 상품 주문 정보 입력
		ProductOrder order1 = new ProductOrder();
		order1.productName = "두부";
		order1.price = 2000;
		order1.quantity = 2;
		orders[0] = order1;

		ProductOrder order2 = new ProductOrder();
		order2.productName = "김치";
		order2.price = 5000;
		order2.quantity = 1;
		orders[1] = order2;

		ProductOrder order3 = new ProductOrder();
		order3.productName = "콜라";
		order3.price = 1500;
		order3.quantity = 2;
		orders[2] = order3;

		int totalAmount = 0;

		// 상품 주문 정보와 최종 금액 출력
		for (ProductOrder order : orders) {

			System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
			totalAmount += (order.price * order.quantity);
		}

		System.out.println("총 결제 금액: " + totalAmount);
	}
}