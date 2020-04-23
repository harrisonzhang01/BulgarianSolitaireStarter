
/**
 * Harrison Zhang
 * PetShop Client
 * Runs all the necessary functions of a pet shop.
 */
import java.util.*;
public class PetShop
{
  public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      System.out.println("Add to cart.");
      Invoice invoice = new Invoice();
      int quit = 0;
      while(quit != -1){
          System.out.println("Price?");
          double price = scan.nextDouble();
          System.out.println("Quantity?");
          int quantity = scan.nextInt();
          System.out.println("Is the Item a pet? Y or N.");
          String pet = scan.next();
          boolean isPet;
          if(pet.equals("Y")){
              isPet = true;
          } else{
              isPet = false;
          }
          Item item = new Item(price, isPet, quantity);
          invoice.add(item);
          System.out.println("Quit? -1 for Yes, 0 for No");
          quit = scan.nextInt();
      }
      System.out.println("Discount: " + invoice.getDiscount());
  }
}
