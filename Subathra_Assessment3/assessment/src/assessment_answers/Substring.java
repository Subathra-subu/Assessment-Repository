package assessment_answers;

import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		
		if(str.length() >= 2) {
			System.out.println(str.substring(0,2));
		}
		
		
		else if(str.length() == 1) {
			System.out.println(str.concat("@"));
		}
		
		else {
			System.out.println("@@");
		}
		
		sc.close();

	}

}
