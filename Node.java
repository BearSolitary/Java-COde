/**
 * A node is an abstract data structure.
 * 
 * @author Sachith Ranaweera
 * @version 1.0 2016-10-21
 */
public class Node
{
    /* instance field */

    private int data;
    private Node nextNode;
   
    /* constructors */

    /**
     * Contructs an empty node which does not point to another.
     */
    public Node()
    {
        data = 0;
        nextNode = null;
    } // end of constructore Node()
    
    /**
     * Constructs a node with the specified data and link to a 
     * node which follows this node.
     * 
     * @param data the data to be store in this node
     * @param the node wich follows this node
     */
    public Node(int data, Node nextNode)
    {
        this.data = data;
        this.nextNode = nextNode;
    } // end of method Node(String data, Node next)
    
    /* accessors */
    
    /**
     * Compares this node to the specified node.
     * 
     * @param otherObject the object to which this node is compared
     * @return true if node is the same as otherObject
     * , otherwise false.
     */
    public boolean equals(Object otherObject)
    {
        if (otherObject == null) return false;
        if (getClass() != otherObject.getClass()) return false;
        
        Node other = (Node) otherObject;
        // is this data not equal to the other data?
        if (data != other.data)
        {
            return false;
        } //end of if (data != other.data)
        return true;
    } // end of method equals(Object otherObject)
    
    /**
     * Returns the data stored in this node.
     * 
     * @return the data stored in this node.
     */
    public int getData()
    {
        return data;
    } // end of method  getData()
    
    /**
     * Returns the node which follows this node.
     * 
     * @return the node which follows this node.
     */
    public Node getNext()
    {
        return nextNode;
    } // end of getNext()
    
    /* mutators */
    
    /**
     * Sets the data to be stored in this node.
     * 
     * @param data the datat to be stored in this node
     */
    public void setData(int data)
    {
        this.data = data;
    } // end of setData(String data)
    
    /**
     * Sets the node which follows this node.
     * 
     * @param next the node wich is to follow this node
     */
    public void setNext(Node nextNode)
    {
        this.nextNode = nextNode;
    } // end of setNext(Node next)
    
    /**
     * Returns a string representation of this node.
     * 
     * @return a string reprecentation of this node.
     */
    public String toString()
    {
        return
        getClass().getName()
        + "[Data: " + data
        + ", next node: " + nextNode
        + "]";
    } // end of toString()
} // end of class Node
