
package caburnay;


public class Products {
    

    int id;
    String name;
    double price;
    int stocks, sold;
    
    public void addProduct(int pid, String pname, double price, int pstocks, int sold){
        
        this.id = pid;
        this.name = pname;
        this.price = price;
        this.stocks = pstocks;
        this.sold = sold;        
    }
    
    public void viewProduct(){
        double profit = this.price * this.sold;
        double tep = this.stocks * this.price;
        String status = (this.stocks > 0) ? "Available" : "Out-of-stock";
        
        System.out.printf("%-10d %-10s %-10.2f %-10d %-10d %-10.2f %-10.2f %-10s\n",
            this.id, this.name, this.price, this.stocks, this.sold, profit, tep, status);
               

    }

    void viewProducts() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
