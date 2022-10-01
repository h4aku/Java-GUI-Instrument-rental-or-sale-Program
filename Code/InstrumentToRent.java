/**
 * Write a description of class InstrumentToRent here.
 *
 * @author (Sujal Maharjan)
 * @version (1.0.0)
 */
public class InstrumentToRent extends Instrument
{
    //Declaring variables
    private int ChargePerDay;
    private String DateOfRent;
    private String DateOfReturn;
    private int NumOfDays;
    private boolean IsRented;
    
    /*
     * InstrumentToRent is a Parameterized Constructor.
     * Attributes 'InstrumentName' and 'ChargePerDay' are the Constructor's parameter.
     * 'super' keyword is used to access the variable 'InstrumentName' of the parent class.
     * ChargePerDay is initialized to value of parameter.
     * Attributes 'DateOfRent' and 'DateOfReturn' are set as emply string.
     * Attribute 'NumOfDays' is initialized zero.
     * Attribute 'IsRented' is set as false.
     */
    public InstrumentToRent(String InstrumentName, int ChargePerDay)
    {
        super(InstrumentName); //Initializing the parameter value to attribute of parent class
        this.ChargePerDay = ChargePerDay; //Initializing the value of variable to parameter
        this.DateOfRent = ""; //Value set as Empty String
        this.DateOfReturn = ""; //Value set as Empty String
        this.NumOfDays = 0; //Initialized as Zero
        this.IsRented = false; //Value set as false
    }
    
    //getters method / accessor method for all attributes
    public int getChargePerDay()
    {
        return this.ChargePerDay;
    }
    
    public String getDateOfRent()
    {
        return this.DateOfRent;
    }
    
    public String getDateOfReturn()
    {
        return this.DateOfReturn;
    }
    
    public int getNumOfDays()
    {
        return this.NumOfDays;
    }
    
    public boolean getIsRented()
    {
        return this.IsRented;
    }
    
    //setters method / mutator method for all attributes
    public void setChargePerDay(int ChargePerDay)
    {
        this.ChargePerDay = ChargePerDay;
    }
    
    public void setDateOfRent(String DateOfRent)
    {
        this.DateOfRent = DateOfRent;
    }
    
    public void setDateOfReturn(String DateOfReturn)
    {
        this.DateOfReturn = DateOfReturn;
    }
    
    public void setNumOfDays(int NumOfDays)
    {
        this.NumOfDays = NumOfDays;
    }
    
    public void setIsRented(boolean IsRented)
    {
        this.IsRented = IsRented;
    }
    
    /*
     * RentInstrument is a method with public modifier and return type set as void.
     * It contains six attributes (String newCustomerName, String newCustomerPhone, 
       int newCustomerPAN, String newDateOfRent, String newDateOfReturn, int newNumOfDays) as its parameters.
     * If IsRented == true, then it will display instrument rented notice and print customer details and date of return.
     * If IsRented == false, then it sets new values of customer details, date of rent and return and set the IsRented to true.
     * And the instrument is rented
     */
    public void RentInstrument(String newCustomerName, String newCustomerPhone, 
    int newCustomerPAN, String newDateOfRent, String newDateOfReturn, int newNumOfDays)
    {
        if(this.IsRented == true) //Condition where Instrument is Rented i.e IsRented == true
        {
            //Printing appropriate message, Customer details and Return date for when the Instrument is Rented
            System.out.println("This instrument is already rented to: "); //Displaying message
            System.out.println("Customer Name: " + this.getCustomerName()); //printing value of CustomerName
            System.out.println("Customer Phone: " + this.getCustomerPhone()); //printing value of CustomerPhone
            System.out.println("Return Date: " + this.getDateOfReturn()); //printing value of DateOfReturn
        }
        else //Condition where Instrument is not rented
        {
            this.setCustomerName(newCustomerName); //calling setter method of CustomerName and setting value of CustomerName
            this.setCustomerPhone(newCustomerPhone); //calling setter method of CustomerPhone and setting value of CustomerPhone
            this.setCustomerPAN(newCustomerPAN); //calling setter method of CustomerPAN and setting value of CustomerPAN
            this.DateOfRent = newDateOfRent; //setting value of DateOfRent
            this.DateOfReturn = newDateOfReturn; //setting value of DateOfReturn
            this.NumOfDays = newNumOfDays; //setting value of NumOfDays
            this.IsRented = true; //setting IsRented as true
            
            System.out.println("Customer Name: \'" + this.getCustomerName() + "\'"); //printing value of CustomerName
            System.out.println("Customer Phone: \'" + this.getCustomerPhone() + "\'"); //printing value of CustomerPhone
            System.out.println("Customer PAN: \'" + this.getCustomerPAN() + "\'"); //printing value of CustomerPAN
            System.out.println("Return Date: \'" + this.DateOfReturn + "\'"); //printing value of DateOfReturn
            System.out.println("Renting Date: \'" + this.DateOfRent + "\'"); //printing value of DateOfReturn
            System.out.println("Total Number of Days: \'" + this.NumOfDays + "\'"); //printing value of NumOfDays
            
            int TotalCharge = NumOfDays * ChargePerDay; //calculating total charge by multiplynig NumOfDays with ChargePerDay
            System.out.println("Total Price: \'" + TotalCharge + "\'" + "\n"); //printing total charge
        } 
    }
    
    /*
     * ReturnInstrument is a method with public modifier and return type set as void.
     * If IsRented == false, then it prints that the instrument is already returned.
     * If IsRented == false, then it initializes the values of CustomerName, CustomerPhone, DateOfReturn,
     * DateOfRent to empty String, sets CustomerPAN and NumOfDays to 0 and sets IsRented to false.
     */
    public void ReturnInstrument()
    {
        if(this.IsRented == false) //indicates that an intrument is already returned, as IsRented is false
        {
            System.out.println("This instrument is already returned!"); //Displaying appropriate message for returned instrument
        }
        else
        {
            this.setCustomerName(""); //setting value of CustomerName to empty String
            this.setCustomerPhone(""); //setting value of CustomerPhone to empty String
            this.setCustomerPAN(0);  //setting value of CustomerPAN to 0
            this.DateOfReturn = ""; //setting value of DateOfReturn to empty String
            this.DateOfRent = "";  //setting value of DateOfRent to empty String
            this.NumOfDays = 0;  //initializing value of NumOfDays to 0
            this.IsRented = false;  //Setting IsRented as false
        }
    }
    
    /*
     * Display is a method with public modifier and return type set as void.
     * 'super' keyword is used to call Display method of parent class.
     * If IsRented == true, then it prints Customer details, Date of Return and Date of rent.
     */
    public void Display()
    {
        super.Display(); //calling Display method from parent class i.e Instrument class
        
        if(this.IsRented == true) //Condition when instrument is rented
        {
            System.out.println("Customer Name: \'" + this.getCustomerName() + "\'"); //printing value of CustomerName
            System.out.println("Customer Mobile no: \'" + this.getCustomerPhone() + "\'"); //printing value of CustomerPhone
            System.out.println("Customer PAN: \'" + this.getCustomerPAN() + "\'"); //printing value of CustomerPAN
            System.out.println("Instrument Renting Date: \'" + this.getDateOfRent() + "\'"); //printing value of DateOfRent
            System.out.println("Instrument Return Date: \'" + this.getDateOfReturn() + "\'"+ "\n"); //printing value of DateOfReturn
        }
    }
}