package task.OneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution {
	public static void main(String args[]) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Author java = new Author();
		java.setAuthId(1);
		java.setEmailid("james.java.org");
		java.setGender("Male");
		java.setName("james");
		java.setWebUrl("www.james.com");
		PaperBook paperbook = new PaperBook();
		paperbook.setBookId(2);
		paperbook.setEdition("version1.5");
		paperbook.setInStock(100);
		paperbook.setIsbn("1231052289283");
		paperbook.setPrice(2500);
		paperbook.setPublisher("javaFrame");
		paperbook.setShippingWeight(200);
		paperbook.setTitle("Spring");
		EBook ebook = new EBook();
		ebook.setBookId(1);
		ebook.setDownloadUrl("java.in");
		ebook.setEdition("java02");
		ebook.setIsbn("123458217269");
		ebook.setPrice(3000);
		ebook.setPublisher("Gosling");
		ebook.setSizeInMb(30);
		ebook.setTitle("Java");
		ebook.setAuthor(java);
		paperbook.setAuthor(java);
		java.getBooks().add(ebook);
		java.getBooks().add(paperbook);
		session.beginTransaction();
		session.save(ebook);
		session.save(paperbook);
		session.save(java);
		session.getTransaction().commit();
		session.close();
		sf.close();
	}
}