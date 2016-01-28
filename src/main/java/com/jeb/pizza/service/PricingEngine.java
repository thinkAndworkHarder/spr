package com.jeb.pizza.service;

import com.jeb.pizza.domain.Order;

public interface PricingEngine {
	public float calculateOrderTotal(Order order);
}
