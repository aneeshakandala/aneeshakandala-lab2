import java.util.*;

public class TypeC extends Thing{
    
    public TypeC(){
        lab = 'y'; 
    }

    @Override 

    public void maybeTurn(Random rand) {
        // FOR REFERENCE: dir: 0=North, 1=East, 2=South, 3=West.

        int i = rand.nextInt(5);

        timeSinceLast++;
    
        if (timeSinceLast == 100) {
          timeSinceLast = 0;
        
            if (i == 0 || i == 2) {
                rightTurn();
                }
            }
    
            if (i == 3 || i == 5) {
                leftTurn();
        }

            else {
               
            }
    }
}