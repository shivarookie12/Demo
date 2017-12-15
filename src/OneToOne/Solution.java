package OneToOne;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution {
	public static void main(String[] args) throws IOException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		Author authors = new Author();
		authors.setEmailId("java.org");
		authors.setGender("male");
		authors.setId(1);
		authors.setName("james");
		authors.setWeburl("www.java.org.");
		
		EBook ebook = new EBook();
		ebook.setTitle("java");
		ebook.setSizeInMb(20);
		ebook.setPublisher("Mcgraw");
		ebook.setPrice(2000);
		ebook.setIsbnNo(123456789);
		ebook.setId(1);
		ebook.setEdition("2.0");
		ebook.setDownloadUrl("www.java.com");
		
		Author authors1 = new Author();
		authors1.setEmailId("java.org");
		authors1.setGender("male");
		authors1.setId(2);
		authors1.setName("james");
		authors1.setWeburl("www.java.org.");
		
		PaperBook pbook = new PaperBook();
		
		pbook.setTitle("java");
		pbook.setShippingWeight(20);
		pbook.setPublisher("Mcgraw");
		pbook.setPrice(2000);
		pbook.setIsbnNo(123456789);
		pbook.setId(2);
		pbook.setEdition("2.0");
		pbook.setInStock(50);
		
		ebook.setAuthor(authors);
		pbook.setAuthor(authors1);
		
		authors.setBook(ebook);
		authors1.setBook(pbook);
		
		session.save(pbook);
		session.save(ebook);
		session.save(authors);
		session.save(authors1);
		session.getTransaction().commit();
		session.close();
		sf.close();	}
}
