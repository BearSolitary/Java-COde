import java.util.EmptyStackException;
/**
 * A stack of integers implemented via an array.
 * 
 * @author Sachith Ranaweera
 * @version 1.0 2016-10-17
 */
public class Stack
{
    /* class fields */
    
    private static final int STACK_EMPTY = -1;

    /* instance fields */
    
    public final int DEFAULT_SIZE;
    private int[] integerArray;
    private int top;

    /* constructors */
    
    /**
     * Constructs a stack which can holw Link: 
     * {@link Stack#DEFAULTY_SIZE} elements.
     */
    public Stack()
    {
        DEFAULT_SIZE = 5;
        integerArray = new int [DEFAULT_SIZE];
        top = STACK_EMPTY;
    } // end of constructor stack()
    
    /**
     * Constructs a stack of characters with the specified 
     * positive maximimum size. 
     * 
     * @param maximumSize maximum number of characters which this 
     * stack can hold <br><i>pre-condition:</i> must be positive.
     */
    public Stack(int maximumSize)
    {
        if (maximumSize > 0)
        {
            DEFAULT_SIZE = maximumSize;
        }
        else
        {
            DEFAULT_SIZE = 5;
        } // end of if (maximumSIze > 0)
        integerArray = new int[DEFAULT_SIZE];
        top = STACK_EMPTY;
    } // end of constructor Stack()

    /* accessors */

    /**
     * Returns the number of elements on this stack.
     * 
     * @return the number of elements on this stack
     */
    public int getSize()
    {
        // Recall that position indicates start of 0, so when top == n,
        // return are n + 1 element on the stack.
        return top + 1;
    } // end of method getSize()

    /**
     * Returns a string reprecentation of this stack.
     * 
     * @return a string reprecentation of this stack      
     */
    public String toString()
    {
        String elementString = "";
        for (int i = 0; i <= top; i++)
                elementString += ", " + (i + 1) + ": " 
                        + integerArray[i];
        return
        getClass().getName()
        + "[Capacity: " + integerArray.length
        + ", size: " + getSize()
        + elementString
        + "]";
    } // end of method toString()

    /* mutators */

    /**
     * Returns true if the stack is empty, otherwise false.
     * 
     * @return true if the stack is empty, otherwise false
     */
    public boolean isEmpty()
    {
        return top == STACK_EMPTY;
    } // end of method isEmpty()

    /**
     * Returns true if the stack is full, otherwise false.
     * 
     * @return true if the stack is full, otherwuse false.
     */
    public boolean isFull()
    {
        return top == DEFAULT_SIZE;
    } // end of method isFull()

    /**
     * Without popping, returns the top element of this stack.
     * <br>pre-condition: the stack is not empty
     * 
     * @return the top element of this stack
     */
    public int peek() throws EmptyStackException
    {
        // if (isEmpty()) throw new EmptyStackException
        if (isEmpty()) throw new EmptyStackException();
        return integerArray[top--];
    } // end of method peek()

    /**
     * Returns and remove the top element from the stack.
     * <br>pre-condition: the stack is not empty
     * 
     * @return the top element from of this stack
     */
    public int pop() throws EmptyStackException
    {
        // if (isEmpty()) throw new EmptyStackException
        if (isEmpty()) throw new EmptyStackException();
        return integerArray[top--];
    } // end of method pop()

    /**
     * Pushes the specified integer onto the top-most element 
     * of this stack.
     * <br>pre-condition: the stack is not full
     * 
     * @param integer the character to be pushed onto top-most
     * element of this stack
     */
    public void push(int integer)
    {
        if (!isFull()) integerArray[++top] = integer;
        // prints error if the stack is full.
        System.out.println("Stack overflow");
    } // end of method push(int integer)
} // end of class Stack