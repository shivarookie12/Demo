package OneToOne;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorValue(value="book")
@Table(name="book")
public class Book {
	@Id
	@Column(name="book_id")
	private int id;
	@Column(name="book_title")
	private String title;
	@Column(name="book_publisher")
	private String publisher;
	@Column(name="book_edition")
	private String edition;
	@Column(name="book_price")
	private double price;
	@Column(name="book_isbnNo")
	private long isbnNo;
	@OneToOne
	@JoinColumn(name="author_id")
	private Author author;


	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Book() {
		super();
	}

	public Book(int id, String title, String publisher, String edition, double price, long isbnNo) {
		super();
		this.id = id;
		this.title = title;
		this.publisher = publisher;
		this.edition = edition;
		this.price = price;
		this.isbnNo = isbnNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public long getIsbnNo() {
		return isbnNo;
	}

	public void setIsbnNo(long isbnNo) {
		this.isbnNo = isbnNo;
	}

}
