/**
 * Tests the <code>CircularQueue</code> class.
 * @author M. Arkin
 * @version 1.0 2011-10-01
 */
public class CircularQueueTester
{
   /**
    * Creates and manipulates a queue of characters.
    * @param argument not used
    */
   public static void main(String[] argument)
   {
      System.out.println("\nCreate a new queue and display its state.");
      LinkedListCirculerQueue queue = new LinkedListCirculerQueue();
      int line = 1;
      System.out.printf("%02d%s%n", line++, ": empty? " + queue.isEmpty());
      System.out.printf("%02d%s%n", line++, ": " + queue);
      
      System.out.println("\nTry to create a queue underflow.");
      System.out.printf("%02d%s%n", line++, ": peek at '" + queue.peek() + "'");
      System.out.printf
         ("%02d%s%n", line++, ": just dequeued '" + queue.dequeue() + "'");
      
      System.out.println("\nEnqueue and dequeue some elements.");
      queue.enqueue(1);
      System.out.printf("%02d%s%n", line++, ": enqueued 'a'; " + queue);
      
      queue.enqueue(2);
      System.out.printf("%02d%s%n", line++, ": enqueued 'b'; " + queue);
      
      queue.enqueue(3);
      System.out.printf("%02d%s%n", line++, ": enqueued 'c'; " + queue);
      
      System.out.printf
         ("%02d%s%n", line++, ": just dequeued '" + queue.dequeue() 
             + "'; " + queue);
      
      System.out.printf
         ("%02d%s%n", line++, ": just dequeued '" + queue.dequeue() 
             + "'; " + queue);
      System.out.printf
         ("%02d%s%n", line++, ": just dequeued '" + queue.dequeue() 
             + "'; " + queue);
      
      System.out.println("\nTry to create a queue underflow.");
      System.out.printf("%02d%s%n", line++, ": empty? " + queue.isEmpty());
      System.out.printf("%02d%s%n", line++, ": peek at '" + queue.peek() + "'");
      System.out.printf
         ("%02d%s%n", line++, ": just dequeued '" + queue.dequeue() 
             + "'; " + queue);
      
      System.out.println("\nEnqueue more elements.");
      queue.enqueue(4);
      System.out.printf("%02d%s%n", line++, ": enqueued 'd'; " + queue);
      
      queue.enqueue(5);
      System.out.printf("%02d%s%n", line++, ": enqueued 'e'; " + queue);
      
      queue.enqueue(6);
      System.out.printf("%02d%s%n", line++, ": enqueued 'f'; " + queue);
      
      queue.enqueue(7);
      System.out.printf("%02d%s%n", line++, ": enqueued 'g'; " + queue);
      
      queue.enqueue(8);
      System.out.printf("%02d%s%n", line++, ": enqueued 'h'; " + queue);
      
      System.out.printf("%02d%s%n", line++, ": peek at '" + queue.peek() + "'");
      
      System.out.println("\nTry to create a queue overflow.");
      System.out.printf("%02d%s%n", line++, ": empty? " + queue.isEmpty());
      queue.enqueue(9);
      System.out.printf("%02d%s%n", line++, ": enqueued 'i'; " + queue);     
      
    
      /*
      System.out.println("\nTry again to create a queue underflow.");
      System.out.printf("%02d%s%n", line++, ": empty? " + queue.isEmpty());
      System.out.printf
         ("%02d%s%n", line++, ": just dequeued '" + queue.dequeue() + "'");
      System.out.printf("%02d%s%n", line++, ": peek at '" + queue.peek() + "'");
      System.out.printf("%02d%s%n", line++, ": " + queue);
      
      System.out.println("\nTry to trip up the circularity.");
      for (char c = '1'; c <= '5'; c++)
      {
         queue.enqueue(c);
         System.out.printf
            ("%02d%s%n", line++, ": enqueued '" + c + "'; " + queue);     
      } // end of for (char c = '1'; c <= '5'; c++)
      
      
      for (char c = 'a'; c <= 'z'; c++)
      {
         queue.enqueue(c);
         System.out.printf
            ("%02d%s%n", line++, ": enqueued '" + c + "'; " + queue);
         System.out.printf
            ("%02d%s%n", line++, ": just dequeued '" + queue.dequeue() + "'; "
            + queue);
      } // end of for (char c = '1'; c <= '5'; c++)
      */
   } // end of class main(String[] argument)
} // end of class CircularQueueTester