package com.cg.service;

import java.util.Collection;
import java.util.List;
import com.cg.dao.CartDao;
import com.cg.dao.CartDaoInt;
import com.cg.pojo.BookingCart;

/**
 * @author Himanshu Kumar Guliya 
 * Service class of service layer of Shopping Cart
 */
public class Service implements ServiceInterface {
	//Instantiate CartDao with reference of CartDaoInt interface 
	CartDaoInt dao = new CartDao();
	int count;

	@Override
	//return values of map which contains bookid as key and BookingCart objects as value
	public Collection<BookingCart> allBooks() {
		return dao.allBooks().values();
	}

	@Override
	//Adding objects to cart
	public int addToCart(int id) {
		boolean check = true;
		count++;

		for (BookingCart books : viewCart()) {
			if (books.getBookId() == id) {
				books.setBookcount(books.getBookcount() + 1);
				check = false;
				break;
			}

		}
		if (check) {
			dao.addToCart(dao.allBooks().get(id));
		}
		return count;
	}

	@Override
	//Removing objects from cart
	public void removeFromCart(int id) {
		for (BookingCart books : viewCart()) {
			if (books.getBookId() == id) {
				if (books.getBookcount() > 1)
					books.setBookcount(books.getBookcount() - 1);
				else {
					dao.removeFromCart(books);
				}
				break;
			}
		}
	}

	@Override
	//Returning the result of dao.viewcart method
	public List<BookingCart> viewCart() {
		return dao.viewCart();
	}

}
