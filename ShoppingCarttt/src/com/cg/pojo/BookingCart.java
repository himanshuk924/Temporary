package com.cg.pojo;

public class BookingCart {
	private String bookName;
	private String authorName;
	private String bookDesc;
	private String link;
	private int bookPrice;
	private int bookId;
	private int bookcount;

	public String getBookName() {
		return bookName;
	}

	public BookingCart() {

	}



	public BookingCart(String bookName, String authorName, String bookDesc, String link, int bookPrice, int bookId,
			int bookcount) {
		super();
		this.bookName = bookName;
		this.authorName = authorName;
		this.bookDesc = bookDesc;
		this.link = link;
		this.bookPrice = bookPrice;
		this.bookId = bookId;
		this.bookcount = bookcount;
	}

	public String getAuthorName() {
		return authorName;
	}

	public String getBookDesc() {
		return bookDesc;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public int getBookId() {
		return bookId;
	}


	@Override
	public String toString() {
		return "BookingCart [bookName=" + bookName + ", authorName=" + authorName + ", bookDesc=" + bookDesc + ", link="
				+ link + ", bookPrice=" + bookPrice + ", bookId=" + bookId + ", bookcount=" + bookcount + "]";
	}

	public int getBookcount() {
		return bookcount;
	}

	public void setBookcount(int bookcount) {
		this.bookcount = bookcount;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

}
