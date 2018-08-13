package com.cg.service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.cg.pojo.BookingCart;

public interface ServiceInterface {

	Collection<BookingCart> allBooks();

	int addToCart(int id);

	void removeFromCart(int id1);

	List<BookingCart> viewCart();

}