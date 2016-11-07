
/**
 * A stack of integers implemented via an linked list.
 * 
 * @author Sachith Ranaweera
 * @version 1.0 2016-10-28
 */
public class LinkListStack
{
    // instance field
    private Node top;
    private int size;
    
    /* constructor */
    /**
     * Constructsa stack of integers with the specified maximum size.
       pre condition: maximumSize > 0
     */
    public LinkListStack()
    {
       top = null;
       size = 0;
    } // end of constructor LinkListStack()

    /**
     * Returs true if the stack is empty, otherwise false.
     * 
     * @returns true if the stack is empty, otherwise false.
     */
    public boolean isEmpty()
    {
        // checks the top element is null or not
        if (top == null)
        {
            // if it is null
            return true;
        }
        else
        {
            // if it is not null
            return false;
        } // end of if (top == null)
    } // end of method isEmpty()
    
    /**
     * Returns the number of elements in the stack.
     * 
     * @returns the number of elements in the stack.
     */
    public int getSize()
    {
        return size;
    } // end of getSize()
    
    /**
     * Pops the top simple object from the stack. 
       pre-condition: the stack is not empty
     *
     * @returns the top element that popped.
     */
    public int pop()
    {
        if (isEmpty())
        {
            return 0;
        }
        else
        {
            Node temp = top;
            top = temp.getNext();
            size--;
            return temp.getData();
        } // end of if (isEmpty())
    }// end of method pop()
    
    /**
     * Returns the top element of the linked list without disturbing
     */
    public int peek()
    {
        if (isEmpty())
        {
            System.out.println("Underflow Exception");
            return 0;
        }
        else
        {
            return top.getData();
        } // end of if (isEmpty())
    } // end of method peek() 
    
    /**
     * Pushes the specified simple object onto the stack.
       pre-condition: the stack is not full
     */
    public void push(int change)
    {
        // create a temporary node
        Node temp = new Node (change, null);
        
        // cheks the top is null
        if (top == null)
        {
            // top cahnge to temp
            top = temp;
        }
        else
        {
            // else change top to temp, was top to second node
            temp.setNext(top);
            top = temp;
        } // end of if (top == null)
        size++;
    }// end of method push()
    
       /*  Function to display the status of the stack */
    public void display()
    {
        System.out.print("\nStack = ");
        if (size == 0) 
        {
            System.out.print("Empty\n");
            return ;
        }
        Node ptr = top;
        while (ptr != null)
        {
            System.out.print(ptr.getData()+" ");
            ptr = ptr.getNext();
        }
        System.out.println();        
    }
    
    /**
     * Returns a string representation of this stack.
     * 
     * @returns a string reprecentation of this stack.
     */
    public String toString()
    {
        return
        getClass().getName()
        + "["
        + "]";
    } // end of methof toString()

} // end of class LinkListStack