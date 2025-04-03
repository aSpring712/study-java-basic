package com.helloshop.order;

import com.helloshop.product.Product;
import com.helloshop.user.User;

/**
 * Order Service
 *
 * 패키지
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-03
 * @version 1.0
 */
public class OrderService {

	public void order() {

		User user = new User();
		Product product = new Product();
		Order order = new Order(user, product);
	}
}