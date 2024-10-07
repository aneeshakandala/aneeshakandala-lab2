import java.util.*;

public class TypeC extends Thing{
    
    public TypeC(){
        lab = 'y'; //setting color for typeC to yellow, "y" for yellow
    }

    @Override 

    public void maybeTurn(Random rand) {//calling on maybeturn
        // FOR REFERENCE: dir: 0=North, 1=East, 2=South, 3=West.

        int i = rand.nextInt(5);//setting bound to 5 for more options

        timeSinceLast++;//increment timeSinceLast
    
        if (timeSinceLast == 100) {//makes decision every 100 rounds 
          timeSinceLast = 0;
        
            if (i == 0 || i == 2) {
                rightTurn();//turning right on certain ints to create a sporatic pattern 
                }
            }
    
            if (i == 3 || i == 5) {
                leftTurn();//turning left on certain ints to create a sporatic pattern 
        }

            else {//not turning on int 4 (straight) for different pattern 
               
            }
    }
}