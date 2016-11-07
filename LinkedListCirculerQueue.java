/**
 * A circular queue of simple objects implemented via a linked list.
 * 
 * @author Sachith Raneweera    
 * @version 1.0 2016-10-28
 */
public class LinkedListCirculerQueue
{
    // instance field
    private Node top;
    private int size;
    /* constructors */
    /**
     * Inizialize the instance fields decleared.
      pre-condition: maximumSize > 0
     */
    public LinkedListCirculerQueue()
    {
        top = null;
        size = 0;
    } // end of LinkedListCircularQueue()
   
    /**
     * Returns true if the queue is empty, otherwise false.
     * 
     * @returns true if the queue is empty, otherwise false.
     */
    public boolean isEmpty()
    {
        // checks the node top pointer is null or not
        if (top == null)
        {
            return true;
        }
        else
        {
            return false;
        } // end of if (top == null)
    } // end of method isEmpty()
    
    /**
     * Returns the number of elements on this queue.
     * 
     * @returns the number of elements on this queue.
     */
    public int queueSize()
    {
        return size;
    } // end of method queueuSIze()
    
    /**
     * Without dequeuing, returns the first element of this queue.
       pre-condition: the queue is not empty
     */
    public Node peek()
    {
        if (top != null)
        {
            // create a temporary variable to store head
            Node temp = top;
            // go to the second last element of the list
            while (temp.getNext() != null)
            {
                temp = temp.getNext();
            } // end of while (temp != null)
            // get the last element
            temp = temp.getNext();
            // reutrn the last element
            return temp;
        }
        else
        {
            return null;
        }
    } // end of method peek()
    
    /**
     * Removes the integer at the front of the queue.
     * pre-condition: the queue is not empty.
     * 
     * @return the integer at the front of the queue.
     */
    public Node dequeue()
    {
        // cheks the queue is not empty
        if (!isEmpty())
        {
            Node temp = top;
            Node prev = top;
            
            while (temp != null)
            {
               if (prev.getNext() == null)
               {
                   prev.setNext(null);
               }
               else
               {
                   prev.setNext(prev.getNext().getNext());
               }
               prev = temp;
               temp = temp.getNext();
            }
        }
        else
        {
            // if its not full return null
            return null;
        } // end of if (!isEmpty())
        return null;
    } // end of method dequeue()
    
    /**
     * Adds the specified integer to the rear of the queue.
     */
    public void enqueue(int value)
    {
        Node newNode = new Node (value, null);
        if (top != null)
        {
            Node temp = top;
            // goes to the send last element
            while (temp.getNext() != null)
            {
                temp = temp.getNext();
            } // end of while (temp != null)
            // add node
            temp.setNext(newNode);
        }
        else
        {
            top = newNode;
        }
    } // end of method enqueue(Node value)
    
    /**
     * Returns the nodes.
     * 
     * @returns the nodes
     */
    public String displayElements()
    {
        if (top != null)
        {
        // decleration of the string and node
        String elements = "";
        Node temp = top;
        int counter = 0;
        // goes to the end of the list
        while (temp != null)
        {
            counter++;
            // add the element value to the string
            elements += "Node " + counter + ": " +temp.getData();
            temp = temp.getNext();
        } // end of while (temp != null)
        /*
        // adds the last value data
        temp = temp.getNext();
        elements += "Node " + (counter + 1) + ": " + temp.getData();
        */
        // returns the string
        return elements;
    }
    else
    {
        return null;
    }
    } // end of displayElements()

    /**
     * Returns a string representation of this queue.
     */
    public String toString()
    {
        return
        getClass().getName()
        + "[List: " +  this.displayElements()
        + "]";
    } // end of methof toString()

} // end of class LinkedListCirculerQueue