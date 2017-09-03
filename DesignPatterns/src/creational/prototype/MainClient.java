package creational.prototype;

public class MainClient {
	public static void main(String[] args) throws Exception {

		BookShop shop=new BookShop();
		shop.setShopName("Shop1");
		shop.loadData(); // we are calling this operation at most one time..
		System.out.println(shop);
		
		//Insted of creation cloning existing object
		BookShop shop2=shop.clone();
		shop2.setShopName("Shop2");
		System.out.println(shop2);
		
	}
}