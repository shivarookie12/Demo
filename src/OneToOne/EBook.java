package OneToOne;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@DiscriminatorValue(value="ebook")
@Table(name="ebook")
public class EBook extends Book {
	private String downloadUrl;
	private int sizeInMb;

	public EBook() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EBook(int id, String title, String publisher, String edition, double price, long isbnNo) {
		super(id, title, publisher, edition, price, isbnNo);
		// TODO Auto-generated constructor stub
	}

	public String getDownloadUrl() {
		return downloadUrl;
	}

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	public int getSizeInMb() {
		return sizeInMb;
	}

	public void setSizeInMb(int sizeInMb) {
		this.sizeInMb = sizeInMb;
	}

	public EBook(String downloadUrl, int sizeInMb) {
		super();
		this.downloadUrl = downloadUrl;
		this.sizeInMb = sizeInMb;
	}

}
