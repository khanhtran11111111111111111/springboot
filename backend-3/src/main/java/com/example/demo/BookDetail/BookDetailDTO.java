package com.example.demo.BookDetail;

public class BookDetailDTO {
	private long id;
	private long Quantity;
	private long Book_id;
	private long Detail_id;
	
	public BookDetailDTO() {
	
	}
	
	public long getBook_id() {
		return Book_id;
	}

	public void setBook_id(long book_id) {
		this.Book_id = book_id;
	}

	public long getDetail_id() {
		return Detail_id;
	}

	public void setDetail_id(long detail_id) {
		this.Detail_id = detail_id;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getQuantity() {
		return Quantity;
	}
	public void setQuantity(long quantity) {
		this.Quantity = quantity;
	}

	public BookDetailDTO(long quantity, long book_id, long detail_id) {
		super();
		this.Quantity = quantity;
		this.Book_id = book_id;
		this.Detail_id = detail_id;
	}

	
}
