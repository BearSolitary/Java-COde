
/**
 * A stack of characters implemented via an array.
 * 
 * @author Sachith Ranaweera
 * @version 1.0 1016-10-31
 */
public class CircularQueue
{
    /* class fields */
    
    /**
     * The default size of a stack.
     */
    public static final int DEFAULT_SIZE = 5;
    
    private static final int QUEUE_EMPTY = -1;
    
    /* instance fields */

    private int[] integerArray;
    private int tail;
    private int front;
    
    /* constructors */
    
    /**
     * Constructs a stack of integers with the specified maximum size.
     * <br>Otherwise, constructs a stack which can hole Link: 
     * {@link Stack#DEFAULT_SIZE}
     * 
     * @param maximumSize maximum number of integers which this stack 
     * can hold. <br></li>pre-condition:</li> maximumSIze > 0
     */
    public CircularQueue(int maximumSize)
    {
        if (maximumSize > 0)
        {
            integerArray = new int[maximumSize];
        }
        else
        {
            integerArray = new int[DEFAULT_SIZE];
        } // end of if (maximumSize > 0)
        
        tail = QUEUE_EMPTY;
        front = QUEUE_EMPTY;
    } // end of constructor CircularQueue()
    
    /**
     * Returns the number of elements on this stack.
     * 
     * @return the number of elements on this stack
     */
    public int getSize()
    {
        return tail - front;
    } // end of method getSize()
    
    /**
     * Without popping, returns the top element of this stack.
     * <br><li>pre-condition:</li> the stack is not empty
     * 
     * @return the top element of this stack
     */
    public int peek()
    {
        // if (isFull()) return STACK_EMPTY;
        if (isEmpty()) return QUEUE_EMPTY;
        return integerArray[front];
    } // end of method peek()
    
    /**
     * Returns a string reprecentation of this stack.
     * 
     * @return a string reprecenting this stack
     */
    public String toString()
    {
        return 
        getClass().getName()
        + "[Capacity: " + integerArray.length
        + ", size: " + getSize()
        + this.arrayElements()
        + "]";
    } // end of method toString()
    
    /* mutators */
    
    /**
     * Returns <li>true</li> if the queue is empty, otherwise <li>false.</li>
     * 
     * @<li>true</li> if the stack is empty, otherwise <li>false</li>.
     */
    public boolean isEmpty()
    {
        // is the queue empty?
        if (front == tail)
        {
            return true;
        }
        else
        {
            return false;
        } // end of if (front == QUEUE_EMPTY) 
    } // end of method isEmpty()
    
    /**
     * Returns <li> true if the stack is full, otherwise <li>false</li>.
     * 
     * @return <li>true</li> if the stack is full, otherwise <li>false</li>
     */
    public boolean isFull()
    {
        // is the queue full?
        if (tail > QUEUE_EMPTY)
        {
            return true;
        }
        else
        {
            return false;
        } // end of if (front > QUEUE_EMPTY)
    } // end of method isFull()
    
    /**
     * Return and remove the integer at the front of the queue.
     * <dr><li>pre-condition:</li> the queue is not empty
     * 
     * @return the character at the front of the queue
     */
    public int dequeue()
    {
        // if (isEmpty()) return STACK_EMPTY;
        if (isEmpty()) return QUEUE_EMPTY;
        
        // store the integer at the front of the queue.
        int temp = integerArray[++front];
        
        // keeps the front integer between 0 and queue size.
        front = front % (integerArray.length + QUEUE_EMPTY);
        return temp;
    } // end of method dequeue()
    
    /**
     * Adds the specified character to the rear of the queue.
     * <dr><li>pre-condition:</li> the queue is not full
     * 
     * @parama character the integer to be enqueued
     */
    public void enqueue(int integer)
    {
        // if (isFull()) System.out.println("Stack Overflow");
        if (isFull()) System.out.println("Stack Overflow");
        
        // adds the integer to the rear of the queue circle.
        integerArray[++tail] = integer;
        
        // keeps the tail integer between 0 and queue size.
        tail = tail % (integerArray.length + QUEUE_EMPTY);
    } // end of method enqueue()
    
    /**
     * Returns the string containing the elements in the array.
     * <dr><li>pre-condition:</li> the stack is not empty
     * 
     * @return the string containing the elements in the array.
     */
    public String arrayElements()
    {
        String elementString = "";
        for (int i = front; i <= tail; i++)
        {
            // is the array empty?
            if (i > QUEUE_EMPTY)
            {
                elementString += ", " + (i + 1) + ": " + integerArray[i];
            } // end of if (i > STACK_EMPTY)
        } // end of for (int i = front; i <= tail; i++)
        return elementString;
    } // end of method arrayElements()
} // end of class CircularQueue