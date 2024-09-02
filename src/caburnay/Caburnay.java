package caburnay;

public class Caburnay {
    public static void main(String[] args) {
        Grade gr = new Grade();
        Sales sl = new Sales();
        Product pr = new Product();
        
//        gr.getGrades();
//        sl.getSales();
        pr.addProducts(101, "Sabon", 10, 50, 100);
    }
    
}
