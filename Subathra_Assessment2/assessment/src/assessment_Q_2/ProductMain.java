package assessment_Q_2;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ClothingProduct clothing = null;
		
		ElectronicProduct electronic = null;
		
		int choice=0;
		
		do{
			System.out.println("\nSELECT THE OPTION BELOW:"
					+ "\n1.ADD ELECTRONIC DETAILS"
					+ "\n2.ADD CLOTHING DETAILS"
					+ "\n3.DISPLAY PRODUT DETAILS"
					+ "\n4.EXIT");
			
			System.out.print("OPTION:");
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1:
				System.out.print("\nPRODUCT_ID:");
				int product_id = sc.nextInt();
				
				System.out.print("PRODUCT_NAME:");
				String product_name = sc.next();
				
				System.out.print("PRICE:");
				double price = sc.nextDouble();
				
				System.out.print("WARRANTY PERIOD:");
				int warranty_period = sc.nextInt();
				
				electronic= new ElectronicProduct(product_id,product_name,price,warranty_period);
				
				break;
				
			case 2:
				
				System.out.print("\nPRODUCT_ID:");
				product_id = sc.nextInt();
				
				System.out.print("PRODUCT_NAME:");
				product_name = sc.next();
				
				System.out.print("PRICE:");
				price = sc.nextDouble();
				
				System.out.print("SIZE:");
				String size = sc.next();
				
				System.out.print("MATERIAL:");
				String material = sc.next();
				
				clothing = new ClothingProduct(product_id,product_name,price,size,material);
				
				break;
				
				
			case 3:
				
				System.out.println(electronic.displayInfo());
				System.out.println(clothing.displayInfo());
				
				break;
				
			case 4:
				
				System.out.println("THANK YOU");
				System.exit(0);
				
			}

			
		}while(choice != 4);
		
		sc.close();

	}

}
