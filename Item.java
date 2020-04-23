/**
 * Harrison Zhang
 * Item Class
 * Creates all the necessary functions to suit a pet shop's purpose
 */
public class Item
{
    private double cost;
    private boolean pet;
    private int quant;

    /**
     * Constructor for objects of class Item
     */
    public Item(double price, boolean isPet, int quantity){
        if(price >= 0){
            cost = price;
        } else{
            cost = 0;
        }
        pet = isPet;
        quant = quantity;
    }

    /**
     * returns cost of item
     * @return double
     */
    public double getCost(){
        return cost;
    }
    
    /**
     * returns whether it is a pet or not 
     * @return boolean
     */
    public boolean getPet(){
        return pet;
    }
    
    /**
     * returns quantity bought
     * @return int
     */
    public int getQuant(){
        return quant;
    }
}
