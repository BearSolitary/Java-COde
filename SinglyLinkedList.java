import java.lang.NullPointerException;
/**
 * A basic singly-linked list whose nodes are composed of integers. 
 * Implements the algorithms required by IB Syllabus.
 * 
 * @author (Sachith Ranaweera) 
 * @version (2016-10-26)
 * @updated (2015-10-29)
 */
public class SinglyLinkedList extends Object
{
    /* instance fields */

    private Node head;
    
    /* constructors */
    
    /**
     *  Constructs an empty singly-linked list.
     */
    public SinglyLinkedList()
    {
        head = null;
    } // end of constructor SinglyLinkedList()
    
    /* methods */
    
    /**
     * Searches for the specified integer, and returns the first 
     * Node containing same, if it exists; otherwise null.
     * 
     * @param integer the integer value sought
     * @return the Node containing the integer value sought, if 
     * it exists; otherwise null
     */
    public Node contains(int integer)
    {
        Node temp = head;
        // is the node not null?
        while (temp != null)
        {
            // if (temp.getData() == integer) return temp
            if (temp.getData() == integer) return temp;
            // goes to the next node.
            temp = temp.getNext();
        } // end of while (temp != null)
        return null;
    } // end of method contains(int integer)
    
    /**
     * Deletes the specified node.<dr>(pre-condition: target is not null)
     * 
     * @param target the Node to be deleted
     */
    public void delete(Node target)
    throws NullPointerException
    {
        // if (target == null) throw new NullPointerException();
        if (target == null) throw new NullPointerException();
        Node before = head;
        Node after;
        
        // if (before == target) head = before.getNext();
        if (before == target) head = before.getNext();
        
        // is the next node null?
        do
        {
            // is the next node equal to the target?
            if (before.getNext() == target) 
            {
                after = before.getNext().getNext();
                before.setNext(after);
            }
            else
            {
                before = before.getNext();
            } // end of if (before.getNext() == target)
        } while (before != null);
    } // end of method delete(Node target)
    
    /**
     * Returns a reference to the Node which is the head of this 
     * list.
     * 
     * @return a reference to a Node, or null if this list is 
     * empty
     */
    public Node getHead()
    {
        return head;
    } // end of method getHead()
    
    /**
     * Returns a reference to the Node which is the tail of this 
     * list.
     * 
     * @return a reference to a Node, or null if this list is empty
     */
    public Node getTail()
    {
        // if (head == null) return null;
        if (head == null) return head;
        
        Node temp = head;
        // is the pointer null?
        while (temp.getNext() != null) temp = temp.getNext();
        return temp;
    } // end of method getTail()
    
    /**
     * Returns a reference to the Node which is the tail of this list.
     *
     * @returns a reference to a Node, or null if this list is empty
     */
    public Node getTailWithoutUsingTailReference() 
    {
        // if (head == null) return null;
        if (head == null) return head;
        
        Node temp = head;
        // is the pointer null?
        while (temp.getNext() != null) temp = temp.getNext();
        return temp;
    } // end of method getTailWithoutUsingTailReference() 
    
    /**
     *  Inserts the specified value into a new node following the 
     *  insertion point.
     *  <br>(pre-condition: the insertion point is not null)
     *  
     *  @param integer the int value to be inserted
     *  @insertionPoint the Node after which the new node will be 
     *  inserted
     */
    public void insert(int integer, Node insertionPoint) 
    throws NullPointerException
    {   
        // is the insertionPoint not null?
        if (insertionPoint != null)
        {
            Node temp = head;
            Node newNode = new Node(integer, null);
            
            do
            {
                // is the node equal to the insertionpoint
                if (temp.equals(insertionPoint))
                temp.setNext(newNode);
                temp = temp.getNext();
            } while (temp != null);
        }
        else
        {
            throw new NullPointerException();
        } // end of if (insertionPoint != null)
    } // end of method insert()
    
    /**
     * Inserts the specified node into this list following the 
     * insertionpoint.
     * (pre-conditions: the entrant and the insertion point is not null)
     * 
     * @param entrant the Node to be inserted
     * @param insertionPoint the Node after the new node will be 
     * inserted
     */
    public void insert(Node entrant, Node insertionPoint) 
    throws NullPointerException
    {
        // is the insertionpoint and entrant null?
        if (insertionPoint != null || entrant != null)
        {
            Node temp = head;
            
            do
            {
                // the node equal to the insertionPoint?
                if (temp.equals(insertionPoint))
                temp.setNext(entrant);
                temp = temp.getNext();
            } while (temp != null);
        }
        else
        {
            throw new NullPointerException();
        } // end of if (insertionPoint != null)
    } // end of method insert(Node entrant, Node insertionPoint)
    
    /**
     * Inserts the specified value into a node at the head of this 
     * list.
     * 
     * @param integer the int value to be inserted
     */
    public void insertAtHead(int integer)
    {
        Node newNode = new Node(integer, null);
        newNode.setNext(head);
        head = newNode;
    } // end of method insertAtHead(int integer)
    
    /**
     * Inserts the specified node at the head of this list.
     *  
     * @param entrant the Node to be inserted
     */
    public void insertAtHead(Node entrant)
    {
        entrant.setNext(head);
        head = entrant;
    } // end of method insertAtHead(Node entrant)
    
    /**
     *  Inserts the specified value into a node at the tail of this 
     *  list.
     *  
     *  @param integer value to be inserted
     */
    public void insertAtTail(int integer)
    {
        Node newNode = new Node(integer, null);
        getTailWithoutUsingTailReference().setNext(newNode);
    }// end of method insertAtTail(int integer)
    
    /**
     * Uses an insertion-sort algorithm with in-place sorting:
     * <dr> • establish the upper bound of the sorted portion of this list
     * <dr> • the sorted portion begins and ends with the head, which is—by itself—sorted
     * <dr> • start at lower bound of the unsorted portion
     * <dr> • move each unsorted node into the correct location in the sorted portion
     * 
     * @return the number of times an inserion was made
     */
    public int sort()
    {
        return 0;
    } // end of method sort()
    /**
     * Reveals whether this list is empty.
     * 
     * @return true if this list is composed of 0 nodes; otherwise 
     * false;
     */
    public boolean isEmpty()
    {
        // if (head == null) return true
        if (head == null) return true;
        return false;
    } // end of method isEmpty()
    
    /**
     * Reutrns a terse string reprecentation of this list.
     * 
     * @return a terse string reprecentation of this list
     */
    public String terseString()
    {
        // if (head == null) return null;
        if (head == null) return null;
        
        String nodeData = "";
        Node temp = head;
        
        while (temp != null)
        {
            nodeData += temp.getData() + " ";
            temp = temp.getNext();
        }// end of while (temp.getNext() != null)
        return nodeData;
    } // end of method terseString()
    
    /**
     * Returns a terse string representation of this list.
     * 
     * @return a string reprecentaion of this list
     */
    public String toString()
    {
        return
        getClass().getName()
        + "[head: " + head
        + "]";
    } // end of method toString()
} // end of class class SinglyLinkedList extends Object
