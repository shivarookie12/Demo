package OneToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Author {
	@Id
	@Column(name="author_id")
	private int id;
	private String name;
	private String emailId;
	private String gender;
	private String weburl;
	@OneToOne
	@JoinColumn(name="book_id")
	private Book book;


	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Author(int id, String name, String emailId, String gender, String weburl) {
		super();
		this.id = id;
		this.name = name;
		this.emailId = emailId;
		this.gender = gender;
		this.weburl = weburl;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getWeburl() {
		return weburl;
	}

	public void setWeburl(String weburl) {
		this.weburl = weburl;
	}

}
