import java.lang.NullPointerException;
/**
 * Tester for singly linked list
 * 
 * @author Sachith Ranaweera
 * @version 1.0 2016-10-26
 */
public class Tester
{
   public static void main(String[] argument)
   {
      SinglyLinkedList list = new SinglyLinkedList();

      Node a = new Node (5, null);
      Node c = new Node (11, null);
      // Test 1:
      int test = 1;
      System.out.println("\ntest " + test++ + ": toString()\n" 
            + list);

     
      System.out.println("\ntest " + test++ + ": toString()\n" 
            + list);
      
      // Test 2:
      System.out.println("\ntest " + test++ + ": isEmpty()\n" 
            + list.isEmpty()); 
      
      // Test 3:
      list.insertAtHead(a);
      System.out.println("\ntest " + test++ + ": toString()\n" 
            + list);
      
      // Test 4:
      list.insertAtHead(c);
      System.out.println("\ntest " + test++ + ": toString()\n" 
            + list);
      
      // test 5:
      list.delete(c);
      System.out.println("\ntest " + test++ + ": delete()\n"
            + list);
           
      // Test 4:
      try
      {
          list.insert(8, null);
      }
      catch (NullPointerException exception)
      {
          System.out.println("\nexception thrown and cought");
      } // end of catch (NullPointerException exception)
      
      System.out.println("\ntest " + test++ + ": toString()\n" 
            + list);
      
      // Test 5:
      try
      {
          list.insert(8, a);
      }
      catch (NullPointerException exception)
      {
          System.out.println("\nexception thrown and cought");
      } // end of catch (NullPointerException exception)
      
      System.out.println("\ntest " + test++ + ": toString()\n" 
            + list);
      
      // Test 6:
      try
      {
          list.insert(null, null);
      }
      catch (NullPointerException exception)
      {
          System.out.println("\nexception thrown and cought");
      } // end of catch (NullPointerException exception)
      
      System.out.println("\ntest " + test++ + ": toString()\n" 
            + list);
            
      // Test 7:
      try
      {
          Node b = new Node (9, null);
          
          list.insert(b, a.getNext());
      }
      catch (NullPointerException exception)
      {
          System.out.println("\nexception thrown and cought");
      } // end of catch (NullPointerException exception)
      
      System.out.println("\ntest " + test++ + ": toString()\n" 
            + list);
     
      // Test 8:
      list.insertAtHead(6);
      System.out.println("\ntest " + test++ + ": insertAthead()\n" 
            + list);
      
      // Test 9:
      list.delete(list.getTailWithoutUsingTailReference());
      System.out.println("\ntest " + test++ + ": delete()\n"
            + list);
            
      // Test 9:
      Node newNode = new Node(7,null);
      list.insertAtHead(newNode);
      System.out.println("\ntest " + test++ + ": insertAthead()\n" 
            + list);
            
      // Test 10:
      list.insertAtTail(8);
      System.out.println("\ntest " + test++ + ": insertAthead()\n" 
            + list);
      
      // Test 11:
      System.out.println("\ntest " + test++ + ": isEmpty()\n" 
            + list.isEmpty());
            
      // Test 12:
      System.out.println("\ntest " + test++ + ": contains()\n" 
            + list.contains(8));
            
      // Test 13:
      System.out.println("\ntest " + test++ + ": contains()\n" 
            + list.contains(3));
      
      // Test 15:
      System.out.println("\ntest " + test++ + ": getHead()()\n" 
            + list.getHead());
            
      // Test 15:
      System.out.println("\ntest " + test++ + ": getTail()\n" 
            + list.getTailWithoutUsingTailReference());
            
      // Test 14:
      list.delete(list.getTail());
      System.out.println("\ntest " + test++ + ": insertAthead()\n" 
            + list);
     
      System.out.println(list.terseString());
   } // end of main(String[] argument)

} // end of class Tester