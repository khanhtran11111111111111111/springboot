package com.example.demo.BookDetail;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.transaction.annotation.EnableTransactionManagement;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@EnableTransactionManagement
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="book_detail")
public class BookDetailEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(name="quantity")
	private long Quantity;
	@Column(name="book_id")
	private long Book_id;
	@Column(name="detail_id")
	private long Detail_id;
	
	public BookDetailEntity() {
	
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
		Quantity = quantity;
	}
	public long getBook_id() {
		return Book_id;
	}
	public void setBook_id(long book_id) {
		Book_id = book_id;
	}
	public long getDetail_id() {
		return Detail_id;
	}
	public void setDetail_id(long detail_id) {
		Detail_id = detail_id;
	}
	public BookDetailEntity(long quantity, long book_id, long detail_id) {
		super();
		Quantity = quantity;
		Book_id = book_id;
		Detail_id = detail_id;
	}
	
	
}
