package com.cg.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cg.pojo.BookingCart;


/**
 * @author Himanshu Kumar Guliya 
 * CartDao class of Dao layer of Shopping Cart
 */
public class CartDao implements CartDaoInt {

	static List<BookingCart> booklist=new ArrayList<>();
	static Map<Integer,BookingCart> bookmap=new HashMap<>();
	
	//-------------------------------------Instantiate BookinCart
	 BookingCart book1=new BookingCart( "Let Us C","By Yashwant Kanetkar", "C","lus.jpg", 101, 348,1);
	 BookingCart book2=new BookingCart( "Head First Java", "By O Relly","Java","hfj.jpg", 102, 223,1) ;
	 BookingCart book3= new BookingCart( "Head First SQL","By O Relly", "SQL","hfs.jpg", 103, 450,1);
	 BookingCart book4=new BookingCart( "Beginning Programing For Dummies","Wallace Wang", "Programming","bpfd.jpg", 104, 535,1);
	 
	 //-------------------------------------Putting into hash map book map
	 {
		 bookmap.put(book1.getBookId(),book1);
		 bookmap.put(book2.getBookId(), book2);
		 bookmap.put(book3.getBookId(),book3);
		 bookmap.put(book4.getBookId(),book4);
	 }
	
	@Override
	//--------------------------------------Return hash map
	public Map<Integer,BookingCart> allBooks(){
		return bookmap;
	}
	
	@Override
	//--------------------------------------Adding to booklist 
	public void addToCart(BookingCart book){
		booklist.add(book);
	}
	
	@Override
	//--------------------------------------Removing from booklist
	public void removeFromCart(BookingCart book) {
		booklist.remove(book);
	}
	
	@Override
	//--------------------------------------Return booklist
	public List<BookingCart> viewCart(){
		return booklist;
	}
}
