
/**
 * Harrison Zhang
 * Intro Lab 2 - How to Get Rich
 * Basically a Ponzi Scheme
 */
public class GetRich{
    /**
     * Constructor for objects of class GetRich
     */
    public GetRich(){}

    /**
     * Records how much money each person must collect
     * @param int
     * @return int
     */
    int i = 1;
    public int collect(int monetaryGoal){
        if(monetaryGoal == 1){
            return 1;
        } else{
            System.out.println("Person " + i + ": " + (monetaryGoal/10));
            i++;
            return monetaryGoal / 10 +
                   collect(monetaryGoal / 10) +
                   collect(monetaryGoal / 10) +
                   collect(monetaryGoal / 10) +
                   collect(monetaryGoal / 10) +
                   collect(monetaryGoal / 10) +
                   collect(monetaryGoal / 10) +
                   collect(monetaryGoal / 10) +
                   collect(monetaryGoal / 10) +
                   collect(monetaryGoal / 10) +
                   collect(monetaryGoal / 10);
        }
    }
    
    public static void main(String[] args){
        GetRich rich = new GetRich();
        rich.collect(1000);
    }
}
