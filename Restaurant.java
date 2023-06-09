package sample;

import java.util.Scanner;

public class Restaurant {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String[] item = new String[] { "Veg-Biryani", "Butter-Naan", "Tomato-Soup", "Manchurian", "Fried-Rice", "Ice-Cream\t",
				"Apple-Juice", "tea\t", "coffee\t", "Quit\t" };
		int[] rate = new int[] { 110, 45, 80, 120, 140, 100, 80,25, 25, 0 };
		int[] quantity = new int[10];
		int sum = 0;
		boolean quit = true;

		do {
			System.out.println("\n\t      Welcome to Restaurant\n");
			System.out.println("\t\t   ----MENU----");
			System.out.println("\t    - - - - - - - - - - - - - ");
			System.out.println("\t      ITEM NAME" + "\t\t Price");
			System.out.println("\t    - - - - - - - - - - - - - ");
			
			for (int i = 0; i < 10; i++)
				System.out.println("\t    "+(i + 1) + "." + item[i] + "\t  " + rate[i]);
			System.out.println("\n\t    Please enter Item no.");
			int ch = input.nextInt();
			
			if (ch > 0 && ch < 10) {
				System.out.println("\t    Enter the no of quantites of " + item[ch - 1]);
				int q = input.nextInt();
				quantity[ch - 1] += q;

			} else {
				quit = false;

			}

		} while (quit);
		System.out.println("\t          Welcome to Restaurant");
		System.out.println("\t               Bill No:1001");
		System.out.println("\t    Bill No:1001           Time: 14:26");
		System.out.println("\t\t     ---Your Orders---");
		System.out.println("\t   - - - - - - - - - - - - - - - - - - -");
		
		System.out.println("\t    ITEM NAME" + "\t   Qty"+"\tPrice"+"\tAmt(Rs.)");
		System.out.println("\t   - - - - - - - - - - - - - - - - - - -");
		
		for (int i = 0; i < 10; i++) {
			if (quantity[i] != 0) {
				sum += quantity[i] * rate[i];
				System.out.println("\t    "+item[i] + "\t    " + quantity[i]+"\t "+rate[i] +"\t  "+ quantity[i] * rate[i] );
			} 
		}
		System.out.println("\t   - - - - - - - - - - - - - - - - - - -");
		System.out.println("\t    TOTAL BILL        \t\tRs." + sum);
		System.out.println("\t   - - - - - - - - - - - - - - - - - - -");
		System.out.println("\t\t      ---Thank you---");

	}

}