package assessment_answers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class OrderByName implements Comparator<Product>{
	
	public int compare(Product p1, Product p2) {
		return p1.getProductName().compareTo(p2.getProductName());	
	
	}
	
}

class OrderByPrice implements Comparator<Product>{
	
	public int compare(Product p1, Product p2) {
		
		if(p1.getProductPrice() > p2.getProductPrice()) return 1;
		else if(p1.getProductPrice() < p2.getProductPrice()) return -1;
		else return 0;
	}
	
}

class OrderByQuantity implements Comparator<Product>{
	
	public int compare(Product p1, Product p2) {
		
		if(p1.getProductQuantity() > p2.getProductQuantity()) return 1;
		else if(p1.getProductQuantity() < p2.getProductQuantity()) return -1;
		else return 0;
	}
	
}

public class Product implements Comparable<Product> {
	
	private Integer productId;
	private String productName;
	private String productCategory;
	private Double productPrice;
	private Double productDiscount;
	private Integer productQuantity;
	
	
	
	public Product(Integer productId, String productName, String productCategory, Double productPrice,
			Double productDiscount, Integer productQuantity) {
		this.productId = productId;
		this.productName = productName;
		this.productCategory = productCategory;
		this.productPrice = productPrice;
		this.productDiscount = productDiscount;
		this.productQuantity = productQuantity;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCategory() {
		return productCategory;
	}


	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public Double getProductPrice() {
		return productPrice;
	}


	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}


	public Double getProductDiscount() {
		return productDiscount;
	}


	public void setProductDiscount(Double productDiscount) {
		this.productDiscount = productDiscount;
	}


	public Integer getProductQuantity() {
		return productQuantity;
	}


	public void setProductQuantity(Integer productQuantity) {
		this.productQuantity = productQuantity;
	}

	public int compareTo(Product p) {
		if(this.getProductId() > p.getProductId()) return 1;
		else if(this.getProductId() < p.getProductId()) return -1;
		else return 0;
	}
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productCategory="
				+ productCategory + ", productPrice=" + productPrice + ", productDiscount=" + productDiscount
				+ ", productQuantity=" + productQuantity + "]";
	}

	public static void main(String[] args) {
		
		ArrayList<Product> arraylist = new ArrayList<>();
		
		arraylist.add(new Product(101,"iphone10", "Mobile" ,20000.0, 0.2 , 2));
		arraylist.add(new Product(102 , "Dell" ,"Laptop" , 20000.0 , 0.3 , 4));
		arraylist.add(new Product(103 , "iphone13", "Mobile" , 10000.0  ,0.5 , 1));
		arraylist.add(new Product(104 , "Lenovo" ,"Laptop" ,70000.0 , 0.8 , 3));
		arraylist.add(new Product(105 , "iphone12" , "Mobile" , 50000.0 , 0.5, 6));
		
		Scanner sc = new Scanner(System.in);
		
		int choice;
		
		do {
			
			System.out.print("1. Sort by Id\n"
					+ "2. List Mobiles with price more than 40000\n"
					+ "3. Exit");
			System.out.print("\nEnter the option for sorting:");
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1: Collections.sort(arraylist);
			
			for(Product p: arraylist) {
				System.out.println(p);
			}
			
			break;
			
			case 2: 
				
				for(Product p: arraylist) {
					if(p.getProductPrice() > 40000)
						System.out.println(p);
				}
				
				break;
			
			case 3:
				
				System.out.print("Thank you!!");
				break;
				
			default:
				
				System.out.print("Invalid Option.");
			}
		}while(choice!=3);
		
		sc.close();

	}
}
