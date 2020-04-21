import java.util.ArrayList;
import java.util.Random;
/**
 * A class that plays Bulgarian Solitare.
 * Version 3: Complete the isDone method.
*/
public class Piles
{
   /**
      Checks whether the game is done.
      @return true when the piles have size
      1, 2, 3, 4, 5, 6, 7, 8, and 9, in some order.
   */
   public boolean isDone()
   {
      /*
         We are done when we have some combination of the numbers
         1 through 9 in the piles. Therefore, we can first check to
         make sure we have exactly 9 piles so we don't waste our time.
         We also need to take care that we have the exact numbers and
         avoid a situation like  1 1 3 4 5 6 7 8 10  which means we
         still aren't done.
      */
      int[] check = new int[9];
      for(int i = 0; i < piles.size(); i++){
          int num = piles.get(i);
          if(num > 9){
              return false;
          }
          check[num-1]++;
      }
      for(int i = 0; i < check.length; i++){
          if(check[i] != 1){
              return false;
          }
      }
      return true;
   }

   private ArrayList<Integer> piles;

   /**
      Sets up the game randomly with some number of piles of random
      size. The pile sizes add up to 45.
   */
   public Piles(Random generator)
   {
      piles = new ArrayList<Integer>();
      /* randomly divide up the deck into piles */
      int TOTAL_SIZE = 45;  // number of cards in a deck
      int numCards = TOTAL_SIZE;
      while (numCards > 0)
      {
         int pile = generator.nextInt(numCards) + 1;
         piles.add(pile);
         numCards -= pile;
      }
   }

   /**
      Set up a pile with a known (non-random) configuration for testing.
      @param pileSizes an array of numbers whose sum is 45
   */
   public Piles(int[] pileSizes)
   {
      piles = new ArrayList<>();
      for (int s : pileSizes)
         piles.add(s);
   }

   /**
    * Return the string representation of the piles.
    * @return the string representation of the piles.
    */
   public String toString()
   {
      return piles.toString();
   }

   /**
      Play one round of the game.
   */
   public void playRound()
   {
	   // insert your code for ver 1
	   int count = 0;
          for(int i = 0; i < piles.size(); i++){
              piles.set(i, piles.get(i)-1);
              if(piles.get(i) == 0){
                  piles.remove(i);
                  i--;
              }
              count++;
          }
          piles.add(count);
   }
}
