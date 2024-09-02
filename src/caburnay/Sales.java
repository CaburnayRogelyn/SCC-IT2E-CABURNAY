package caburnay;
import java.util.Scanner;

public class Sales {
    public void getSales(){
        Scanner input = new Scanner(System.in);
        
        String cname, pname;
        int quantity, price, cash;
        
        System.out.print("Enter Customer name: ");
        cname = input.nextLine();
        System.out.print("Enter Product Name: ");
        pname = input.nextLine();
        System.out.print("Enter Quantity: ");
        quantity = input.nextInt();
        System.out.print("Enter Price: ");
        price = input.nextInt();
        System.out.print("Enter Cash: ");
        cash = input.nextInt();
        
        System.out.println("---------------------------");
        System.out.println("RECEIPT:");
        System.out.println("---------------------------");
        System.out.println("Name: "+cname);
        System.out.println("\nItem Name: "+pname);
        System.out.println("Quantity: "+quantity);
        System.out.println("---------------------------");
        System.out.println("Total Due: "+(price*quantity)+".00");
        System.out.println("Cash: "+cash+".00");
        System.out.println("---------------------------");
        System.out.println("Change: "+(cash-(price*quantity))+".00");
    }
    
}
