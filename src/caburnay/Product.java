package caburnay;

import java.util.Scanner;

public class Product {
    public void viewproducts(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number of Products: ");
        int np = sc.nextInt();
        
        Products[] pr = new Products[100];
        
        for (int i = 0; i < np; i++){
            pr[i] = new Products();
            
            System.out.println("\nEnter Details for Products " + (i + i));
            System.out.println("ID: ");
            int id = sc.nextInt();
            System.out.println("Name: ");
            String name = sc.next();
            System.out.println("Price: ");
            double price = sc.nextDouble();
            System.out.println("Stocks: ");
            int stocks = sc.nextInt();
            System.out.println("Sold: ");
            int sold = sc.nextInt();
            
            pr[i].addProduct(id, name, price, stocks, sold );
        }
        
        for (int i = 0; i < pr.length; i++) {
            pr[1].viewProducts();
        }
    }
}
