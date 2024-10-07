import java.util.*;

public abstract class Thing extends ThingList {
    // dir: 0=North, 1=East, 2=South, 3=West.
    // timeSinceLast: this is only important for "TypeB" Things.
    protected int  row;
    protected int  col;
    protected int  dir;
    protected int timeSinceLast;
    protected char lab;//color of the line

    public void step() {
        final int[] dc = {
          0, 1, 0, -1
        }, dr = {
          1, 0, -1, 0
        };
        row += dr[dir];
        col += dc[dir];
      }

    public void rightTurn() {
        dir = (dir + 1) % 4;//direction dictating "right" code
      }
    
    public void leftTurn() {
        dir = (dir + 3) % 4;//direction dictating ""
      }

    public String toString(){
        return (this.row + " " + this.col + " " + this.lab);
      }

    public abstract void maybeTurn(Random rand);

  }
