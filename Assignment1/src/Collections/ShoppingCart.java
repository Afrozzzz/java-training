package Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;
 
public class ShoppingCart {
	//cart->collection->array list->adding object of producttype
	//product class->category->(electronics,apparel,grocery,footwear)
	//modify add product()->category
	//add one more method more method->discount()->based on salary-e->10,gr->5%
	//change display() -to string
	//checkout() ->after discount
//	private Vector<Product> cart =new Vector<>();
//	private HashSet<Product> cart =new HashSet<>();
//	private LinkedHashSet<Product> cart =new LinkedHashSet<>();
//	private TreeSet<Product> cart =new TreeSet<>(new ComparingCategoryPrice());
//	private TreeSet<Product> cart ;
// private ArrayDeque<Product>cart = new ArrayDeque<>();
// private HashMap<Integer,Product> cart2 =new HashMap<>();
// private LinkedHashMap<Integer,Product> cart2 =new LinkedHashMap<>();
private TreeMap<Integer,Product> cart2 =new TreeMap<>();
 
 

	private Scanner scanner =new Scanner(System.in);
 
	

//	public ShoppingCart() {
//		System.out.println("choose the sorting comparators:");
//		System.out.println("1.sort  category ,then price");
//		System.out.println("2.sort  name ,then price");
//		System.out.println("3.sort  id ,then category");
//		System.out.println("select your choice:");
//		int choice =scanner.nextInt();
//		scanner.nextLine();
//		if(choice==1) {
//			cart =new TreeSet<>(new ComparingCategoryPrice());
//		}else if(choice==2) {
//			cart =new  TreeSet<>(new ComparingCategoryPrice());
//		}else if(choice==3) {
//			cart=new TreeSet<>(new ComparingCategoryPrice());
//		}else {
//			System.out.println("Invalid choice .");
//		}
//	}
 
	












 
	//adding a product
	public void addProduct() {
		System.out.println("enter product id:");
		int id = scanner.nextInt();
		System.out.println("enter product name:");
		String name = scanner.next();
		System.out.println("enter product price:");
		double price = scanner.nextDouble();
		System.out.println("enter category:");
		String category = scanner.next();
 
//		cart.offerLast(new Product(id, name, price, category));
		Product product =new Product(id,name,price,category);
		 cart2.put(id, product);
		System.out.println("product :" + name + " added to cart");
 
	}
	//remove product
	public void removeProduct()
	{
		System.out.println("enter product id to remove product:");
		int id =scanner.nextInt();
		//id->true->product present,false-> product not there
		////cart->remove()
		//product.id==id
//		boolean removed=cart.removeIf(Product->Product.prodId==id);
		if(cart2.containsKey(id))
		{
		System.out.println("product :"+id+"added to cart");
		}
		else
		{
			System.out.println("product with id:"+id+"not found");
		}
//		if(cart.isEmpty()) {
//			 System.out.println("cart is empty");
//		 }else {
//			 Product removedProduct=cart.pollFirst();
//			 System.out.println("removed:"+removedProduct);
//		 }

	}
	//search product
	public void searchProduct()
	{
		System.out.println("enter product id to search product:");
		int  id =scanner.nextInt();
//		for(Product product:cart)
//		{
//			if(product.prodName.equalsIgnoreCase(name))
//			{
//				System.out.println("product :" +name+"found");
//				return;
//			}
//		}
//		System.out.println("product:"+name+"not found");
		Product pro=cart2.get(id);
		if(pro!=null) {
			System.out.println("product found:"+pro);
		}else {
			System.out.println("Product not found");
		}
	}
	//discount
	public double calculateDiscount() {
		double total = 0;
		for (Product product : cart2.values()) {
			double discount = 0;
			switch (product.getCategory().toLowerCase()) {
			case "electronics":
				discount = product.getProductPrice() * 0.10;
				break;
 
			case "apparel":
				discount = product.getProductPrice() * 0.05;
				break;
			case "grocery":
				discount = product.getProductPrice() * 0.02;
				break;
 
			case "Footwear":
				discount = product.getProductPrice() * 0.07;
				break;
			}
			total += discount;
		}
		return total;
	}
 
 
	
	//checkout ->cart->total amount->display->empty cart
	public void checkOut()
	{

//		while(!cart.isEmpty())
//		{
//			Product product1 =cart.poll();
//			System.out.println(product1);
//		}
		double totalBill=0;
		for(Product product:cart2.values())
		{
		System.out.println(product);
		totalBill+=product.getProductPrice();
		}
		double discount=calculateDiscount();
		double finaltotal =totalBill-discount;
		System.out.println("total price to be paid :INR" +finaltotal);
		cart2.clear();
		System.out.println("checkout complete.cart is empty");
	}

	//display
	//if cart->empty->no products in cart ->cart.isempty()
   //	not empty->for loop to display all produs
	public void display() {
		if(cart2.isEmpty()) {
			System.out.println("No products in cart available");
		}else {
			if(!cart2.isEmpty())
			for(Product list:cart2.values()) {
				System.out.println(list);
			}
		}
	}
	//checkout

 
	
	public void menu() {
		while (true) {
			System.out.println("E-commerce store");
			System.out.println("press1: Add Product in your cart");
			System.out.println("press2: Remove Product from cart");
			System.out.println("press3: search the category ");
 
			System.out.println("press4: checkout the  Products with your bill");
			System.out.println("press5: Display all the products in cart");
			System.out.println("press6.Exit");
			System.out.print("Enter Choice:");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 1:
				addProduct();
				break;
			case 2:
				removeProduct();
				break;
 
			case 3:
				searchProduct();
				break;
			case 4:
				checkOut();
				break;
			case 5:
				display();
				break;
			case 6:
				System.out.println("Exit System");
				scanner.close();
				return;
			default:
				System.out.println("Invalid choice");
			}
 
		}
	}
	public static void main(String[] args)
	{
		ShoppingCart cart = new ShoppingCart();
		cart.menu();
	}
 
}