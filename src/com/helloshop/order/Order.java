package com.helloshop.order;

import com.helloshop.product.Product;
import com.helloshop.user.User;

/**
 * Order
 *
 * 패키지
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-03
 * @version 1.0
 */
public class Order {

	User user;
	Product product;

	public Order(User user, Product product) {
		this.user = user;
		this.product = product;
	}
}