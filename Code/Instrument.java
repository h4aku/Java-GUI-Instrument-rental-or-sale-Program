/**
 * Write a description of class Instrument here.
 *
 * @author (Sujal Maharjan)
 * @version (1.0.0)
 */
public class Instrument
{
    //Declaring variables
    private static int InstrumentID;
    private String InstrumentName;
    private String CustomerName;
    private String CustomerPhone;
    private int CustomerPAN;
    
    /*
     * Instrument is a Parameterized Constructor.
     * Attribute 'InstrumentName'is the Constructor's parameter.
     * InstrumentID is auto incremented by 1.
     * InstrumentName is initialized to value of parameter.
     * Attributes 'CustomerName' and 'CustomerPhone' are set as emply string.
     * Attribute 'CustomerPAN' is initialized zero.
     */
    Instrument(String InstrumentName)
    {
        Instrument.InstrumentID = ++InstrumentID; //auto incrementing InstrumentID by 1
        this.InstrumentName = InstrumentName; //Initializing the value of variable to parameter
        this.CustomerName = ""; //Value set as Empty String
        this.CustomerPhone = ""; //Value set as Empty String
        this.CustomerPAN = 0; //Value initialized as zero
    }
    
    //getters method / accessor method for all attributes
    public int getInstrumentID()
    {
        return InstrumentID; //'this' keyword not used since InstrumentId is static variable
    }
    
    public String getInstrumentName()
    {
        return this.InstrumentName;
    }
    
    public String getCustomerName()
    {
        return this.CustomerName;
    }
    
    public String getCustomerPhone()
    {
        return this.CustomerPhone;
    }
    
    public int getCustomerPAN()
    {
        return this.CustomerPAN;
    }
    
    
    //setters method / mutator method for all attributes
    public void setInstrumentID(int InstrumentID)
    {
        Instrument.InstrumentID = InstrumentID;
    }
    
    public void setInstrumentName(String InstrumentName)
    {
        this.InstrumentName = InstrumentName;
    }
    
    public void setCustomerName(String CustomerName)
    {
        this.CustomerName = CustomerName;
    }
    
    public void setCustomerPhone(String CustomerPhone)
    {
        this.CustomerPhone = CustomerPhone;
    }
    
    public void setCustomerPAN(int CustomerPAN)
    {
        this.CustomerPAN = CustomerPAN;
    }
    
    /*
     * Display is a method with public modifier and return type set as void.
     * It prints InstrumentID and InstrumentName.
     * If CustomerName, CustomerPhone equals to empty string and CustomerPAN equals 0,
       then it prints a messeage saying instrument is availabe to rent.
     * Else, it will print Customer Details.
     */
    public void Display()
    {
        System.out.println("The Instrument ID is: \'" + Instrument.InstrumentID + "\'"); //printing value of InstrumentID
        System.out.println("Name of the Instrument is: \'" + this.InstrumentName + "\'"); //printing value of InstrumentName
        
        if(this.CustomerName.equals("") && this.CustomerPhone.equals("") && CustomerPAN == 0)
        {
            System.out.println("This instrument is available\n"); //displaying message
        }
        else
        {
            System.out.println("Customer Name is: \'" + this.CustomerName + "\'"); //printing value of CustomerName
            System.out.println("Customer Mobile Number is: \'" + this.CustomerPhone + "\'"); //printing value of CustomerPhone
            System.out.println("Customer PAN number is: \'" + this.CustomerPAN + "\'"); //printing value of CustomerPAN
        }
    }
}