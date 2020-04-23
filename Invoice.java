
/**
 * Harrison Zhang
 * Invoice Class
 * Calculates pricing to charge
 */
import java.util.ArrayList;
public class Invoice{
    private ArrayList<Item> invoice;

    /**
     * Constructor for objects of class Invoice
     */
    public Invoice(){
        invoice = new ArrayList<Item>();
    }

    /**
     * Adds another item to invoice
     * @param Item
     * @return void
     */
    public void add(Item anitem){
        invoice.add(anitem);
    }
    
    /**
     * returns the amount of money that is discounted
     * @return double
     */
    public double getDiscount(){
        double tot = 0;
        for(int i = 0; i < invoice.size(); i++){
            if(invoice.get(i).getPet() == false){
                tot += invoice.get(i).getCost() * invoice.get(i).getQuant();
            }
        }
        return tot*0.2;
    }
}
