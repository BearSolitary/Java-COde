/**
 * A simple object which knows its serial number, string, and integer.
 * 
 * @author Sachith Ranaweera
 * @version 1.0 2016-10-14
 */
public class SimpleObject
{
    // class field
    private static int lastSerialNumber = 1;
    
    //instance field
    private int integer;
    private int serialNumber;
    private String string; 
    
    /**
     * Constructs a simple object with the next serial number.
     */
    public SimpleObject ()
    {
        serialNumber  = ++lastSerialNumber;
        string        = "";
        integer       = 0;
    }
    
        /**
     * Constructs a simple object with the next serial number and the
     * specified integer.
     */
    public SimpleObject (int integer)
    {
        serialNumber = ++lastSerialNumber;
        string       = "";
        this.integer = integer;
    }
    
    /**
     * Constructs a simple object with the next serial number
     * and the specified string.
     */
    public SimpleObject(String string)
    {
        serialNumber = ++lastSerialNumber;
        integer      = 0;
        this.string  = string;
    }
    
    /**
     * Constructs a simple object with the next serial number
     * and the specified string and integer.
     */
    public SimpleObject(String string, int integer)
    {
        serialNumber = ++lastSerialNumber;
        this.integer = integer;
        this.string  = string;
    }
    
    /**
     * Returns the integer of this simple object.
     */
    public int getInteger()
    {
        return integer;
    } // end of method getNumber()
    
    /**
     * Returns the serial number of this simple object.
     */
    public int getSerialNumber()
    {
        return serialNumber;
    } // end of method serialNumber()
    
    /**
     * Returns the string of this simple object.
     */
    public String getString()
    {
        return string;
    } // end of method string()
    
    /**
     * Sets the integer of this simple object.
     */
    public void setInteger(int integer)
    {
        integer = this.integer;
    } // end of setString()
    
    /**
     * Sets the string of this simple object.
     */
    public void setString(String string)
    {
        string = this.string;
    } // end of method setString()
    
    /**
     * Returns a string representation of this simple object.
     */
    public String toString()
    {
        return
           getClass().getName()
           + "["
           + "SerialNumber: " + serialNumber
           + ", String: " + string
           + ", integer: " + integer
           + "]";
    } // end of method to String()
    
    /**
     * Compare object one with object two
     */
    public int compareTo(Object otherObject)
    {
        if(otherObject == null) return 0;
        if(getClass()  != otherObject.getClass()) return 0;
        
        SimpleObject other = (SimpleObject) otherObject;
        if(serialNumber < other.serialNumber) return -1;
        if(serialNumber > other.serialNumber) return  1;
        
        return 0;
    }// end of compareTO method
    
} // end of class SimpleObject