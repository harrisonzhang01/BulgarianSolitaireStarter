
/**
 * Harrison Zhang
 * Intro Lab 1 - Pair/Share (no partner)
 * Write 5 recursion functions
 */
public class IntroLab1
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class IntroLab1
     */
    public IntroLab1()
    {
        // initialise instance variables
        x = 0;
    }
    
    //Write a function using recursion to print numbers from n to 0
    public String nToZero(int n){
        if(n == 0){
            return "0";
        } else{
            return n + nToZero(n-1);
        }
    }
    
    //Write a function using recursion to print numbers from 0 to n
    //(you just need to change one line in the program of problem 1).
    public String zeroToN(int n){
        if(n == 0){
            return "0";
        }
        return zeroToN(n-1) + n;
    }
    
    //Write a function using recursion that takes in a string and returns
    //a reversed copy of the string. The only string operation you are
    //allowed to use is string concatenation.
    //Then test if user inputted String is a palindrome.
    public String reverse(String str){
        if(str.length() == 0){
            return "";
        } else{
            String letter = Character.toString(str.charAt(str.length()-1));
            return letter + reverse(str.substring(0,str.length()-1));
        }
    }
    
    //Write a function using recursion to check if a number n is prime
    //(you have to check whether n is divisible by any number below n)
    public boolean prime(int n, int k){
        if(n == 4){
            return true;
        } else{
            System.out.println(k);
            return k%(n-1)!=0 && prime(n-1, k);
        }
    }
    
    //main used for testing
    public static void main(String[] args){
        IntroLab1 lab = new IntroLab1();
        System.out.println(lab.nToZero(4));
        System.out.println(lab.zeroToN(4));
        String str = "racecar";
        System.out.println(lab.reverse(str));
        if(str.equals(lab.reverse(str))){
            System.out.println("It is a palindrome");
        } else{
            System.out.println("It is not a palindrome");
        }
        System.out.println(lab.prime(29,29));
    }
}