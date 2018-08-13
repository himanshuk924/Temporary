package com.cg.dao;

import java.util.List;
import java.util.Map;

import com.cg.pojo.BookingCart;

public interface CartDaoInt {

	Map<Integer, BookingCart> allBooks();

	void addToCart(BookingCart book);

	void removeFromCart(BookingCart book);

	List<BookingCart> viewCart();

}