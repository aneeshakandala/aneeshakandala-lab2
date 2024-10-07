import java.util.*;

public class DotChaser {
  public static Random rand = new Random(System.currentTimeMillis());

  /**
   * This static method is ok :)
   */
  public static void main(String[] args) {
    int N = 200;

    if( args.length != 0 )
      N = Integer.parseInt(args[0]);

    // INSTEAD OF A NODE, CREATE SOMETHING MORE USER-FRIENDLY.
    ThingList newlist = new ThingList();

    //Node L = null;
    int count = 0;

    while( true ) {
      // Every N rounds, add another typeA and typeB Thing.
      if( count % N == 0 ) {

        Thing tA = new TypeA();//creating new Thing tA

        newlist.addThing(tA);//calling addThing to add tA to newlist

        tA.row = 45;
        tA.col = 50;

        Thing tB = new TypeB();//creating new Thing tB

        newlist.addThing(tB);//calling addThing to add tB to newlist

        tB.row = 55;
        tB.col = 50;

        Thing tC = new TypeC();//creating new Thing tC

        newlist.addThing(tC);//calling addThing to add tC to newlist

        tC.row = 65;
        tC.col = 60;

      }

      newlist.printAll();//calling printAll method
      newlist.moveAll(rand);//calling moveAll method

      count++;
    }
  }
}