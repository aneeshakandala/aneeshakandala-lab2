import java.util.Random;

/**
   * YOU'LL NEED TO PUT THIS SOMEWHERE ELSE
   * HINT: WOULDN'T IT BE NICE TO HAVE A LIST OR QUEUE SO THAT
   *       WE DON'T HAVE TO USE NODES HERE?
   * This class is for linked lists of Thing's
   */

  public  class ThingList{
  public Random rand = new Random(System.currentTimeMillis());
  Node head;

    private class Node {
      public Thing data;
      public Node  next;
    }

    public void addThing(Thing t){
      Node newnode = new Node();
      newnode.data = t;

      if (head == null){
        head = newnode; 
        return; 
      }

    Node temp = head; 

      while(temp.next != null){
        temp = temp.next;
      }

      temp.next = newnode; 
      newnode.next = null;
    }

    public void printAll(){
      Node temp = head; 
      while (temp != null){
        System.out.println(temp.data.toString()); 
        temp = temp.next;
      }
      System.out.println("done"); 
      System.out.flush(); 
    }

    public void moveAll(Random rand){ 
     Node temp = head; 
      while (temp != null){
          temp.data.maybeTurn(rand);
          temp.data.step();
          temp = temp.next;
      }
    }
  }

