import java.util.*;

public class TypeB extends Thing {
    
    public TypeB(){
        lab = 'b'; //making color for typeB blue, "b" is blue 
    }

    @Override 

    public void maybeTurn(Random rand) {//calling on maybeTurn 
        int i = rand.nextInt(3);
    
          timeSinceLast++;//incremend time since last 
    
          if (timeSinceLast == 10) { //chooses left, right, or straight every 10 bounds 
            timeSinceLast = 0;
    
            if (i == 1) {
              rightTurn();
            }
    
            if (i == 2) {
              leftTurn();
            }
          }
        }
      }
