import java.util.*;

public class TypeA extends Thing {

public TypeA(){
    lab = 'r'; //making color for typeA red, "r" for red
}

@Override
    public void maybeTurn(Random rand) {//calling on maybe turn 
        //randomly chooses left, right, or straight at every turn
        int i = rand.nextInt(3);
    
          if (i == 1) {
            rightTurn();
          }
    
          if (i == 2) {
            leftTurn();
          }
        }
      }

