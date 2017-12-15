package OneToOne;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue(value="paperBook")
@Table(name="paperbook")
public class PaperBook extends Book {
	private float shippingWeight;
	private int inStock;

	public PaperBook() {
		super();
	}

	public PaperBook(int id, String title, String publisher, String edition, double price, long isbnNo) {
		super(id, title, publisher, edition, price, isbnNo);
	}

	public PaperBook(float shippingWeight, int inStock) {
		super();
		this.shippingWeight = shippingWeight;
		this.inStock = inStock;
	}

	public float getShippingWeight() {
		return shippingWeight;
	}

	public void setShippingWeight(float shippingWeight) {
		this.shippingWeight = shippingWeight;
	}

	public int getInStock() {
		return inStock;
	}

	public void setInStock(int inStock) {
		this.inStock = inStock;
	}

}
