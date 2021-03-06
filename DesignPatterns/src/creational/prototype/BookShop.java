package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{
	private String shopName;
	private List<Book> listOfBooks = new ArrayList<Book>();
	
	public String getShopName() {
		return shopName;
	}
	public List<Book> getListOfBooks() {
		return listOfBooks;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public void setListOfBooks(List<Book> listOfBooks) {
		this.listOfBooks = listOfBooks;
	}
	
	public void loadData(){
		//assume db connection
		for(int i=1;i<10;i++){

			Book book=new Book();
			book.setBid(i);
			book.setBname("Book "+i);
		
			this.getListOfBooks().add(book);
		}
	}
	@Override
	public String toString() {
		return "BookShop [shopName=" + shopName + ", listOfBooks=" + listOfBooks + "]";
	}
	
	
	@Override
	protected BookShop clone() throws CloneNotSupportedException {
		
		BookShop shop=new BookShop();
		
		for(Book book:this.getListOfBooks())
			shop.getListOfBooks().add(book);
		
		return shop;
	}	
	

	
}
