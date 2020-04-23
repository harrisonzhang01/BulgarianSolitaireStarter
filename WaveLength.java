/**
 * Harrison Zhang
 * WaveLength Lab
 * Smooths out an array by changing each number to the average of its neighbors.
 */
import java.util.Random;

public class WaveLength
{
   private double[] values;
   private int valueSizes;
   public WaveLength(){
   }
   /**
      Smoothes out an array by averaging values with its neighbors.
      @param values an array
      @param size the number of elements in values
      @return void
   */
   public void smooth(double[] values, int valueSizes){
       //makes new array as reference for old values
       double[] ref = new double[valueSizes];
       for(int i = 0; i < valueSizes; i++){
           ref[i] = values[i];
       }
       for(int i = 0; i < valueSizes; i++){
           if(i == 0){
               values[i] = values[i+1];
           } else if(i == valueSizes-1){
               values[i] = values[i-1];
           } else{
               //finds average of original neighbors from reference array
               values[i] = (ref[i-1] + ref[i+1])/2;
           }
       }
   }
   /**
      Prints an array.
      @param a an array
   */
   public void print(double[] a)
   {
       //prints out elements of array
       for(double s : a){
           System.out.print(s + " ");
       }
       System.out.print("\n");
   }

   public static void main(String[] args)
   {
      final int SIZE = 100;
      double[] a = new double[SIZE];
      Random generator = new Random();

      for (int i = 0; i < SIZE; i++)
      {
         a[i] = 1 + i / 100.0;
         // Add some noise between -0.01 and .01
         a[i] = a[i] + (1 - 2 * (generator.nextDouble() * 1.0 / 10000)) / 100;
      }

      WaveLength wave = new WaveLength();
      wave.print(a);
      wave.smooth(a, SIZE);
      wave.print(a);
   }
}
