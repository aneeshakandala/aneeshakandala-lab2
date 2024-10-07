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
      Node newnode = new Node();//newnode to be added
      newnode.data = t;//data associated with new node

      if (head == null){//checking is head is null
        head = newnode;//if so, setting newnode as head
        return; 
      }

    Node temp = head; //creating temp node, setting it to "head"

      while(temp.next != null){//checking if temp is null
        temp = temp.next;//moving node, moving until last node is reached
      }

      temp.next = newnode;//setting temp.next to new node, effectively newnode to the "tail" of the list
      newnode.next = null;//setting "null" for what is after the last node, indicating the end of the list
    }

    public void printAll(){//printAll method 
      Node temp = head; //creating temp node, setting to head 
      
      while (temp != null){//checking if temp is null
        System.out.println(temp.data.toString()); //output toString
        temp = temp.next;//moving to next node
      }

      System.out.println("done"); 
      System.out.flush(); 

    }

    public void moveAll(Random rand){ //moveAll method
     Node temp = head; //creating temp node, seting to head
     
      while (temp != null){//checking if temp is null 

          temp.data.maybeTurn(rand);//calling on maybeturn
          temp.data.step();//calling step 
          temp = temp.next;//moving to next node 
      }

    }
  }

