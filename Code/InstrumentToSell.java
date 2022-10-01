/**
 * Write a description of class InstrumentToSell here.
 *
 * @author (Sujal Maharjan)
 * @version (1.0.0)
 */
public class InstrumentToSell extends Instrument
{
    //Declaring variables
    private float Price;
    private String SellDate;
    private float DiscountPercent;
    private boolean IsSold;
    
    /*
     * InstrumentToSell is a Parameterized Constructor.
     * Attributes 'InstrumentName' and 'Price' are its parameters.
     * 'super' keyword is used to access the variable 'InstrumentName' of the parent class.
     */
    public InstrumentToSell(String InstrumentName, float Price)
    {
        super(InstrumentName); //Initializing the parameter value to attribute of parent class
        this.Price = Price; //Initializing the value of variable to parameter
        this.SellDate = ""; //Value set as empty String
        this.DiscountPercent = 0.0f; //Value set as 0.0f
        this.IsSold = false; //Value set as false
    }
    
    //getters method / accessor method for all attributes
    public float getPrice()
    {
        return this.Price;
    }
    
    public String getSellDate()
    {
        return this.SellDate;
    }
    
    public float getDiscountPercent()
    {
        return this.DiscountPercent;
    }
    
    public boolean getIsSold()
    {
        return this.IsSold;
    }
    
    //setters method / mutator method for all attributes
    public void setPrice(float Price)
    {
        if(this.IsSold == false)
        {
            this.Price = Price; //setting value of price, if the instrument is not sold
        }
        else
        {
            System.out.println("This instrument has been sold out, so changing price is not possible");
        }
    }
    
    public void setSellDate(String SellDate)
    {
        this.SellDate = SellDate;
    }
    
    public void setDiscountPercent(float DiscountPercent)
    {
        this.DiscountPercent = DiscountPercent;
    }
    
    public void setIsSold(boolean IsSold)
    {
        this.IsSold = IsSold;
    }
    
    /*
     * SellInstrument is a method with public modifier and return type set as void.
     * It contains five parameters (String Customer_Name, String Customer_Phone,int Customer_PAN,
       String Sell_Date, float DiscountPercent).
     * If IsSold == true, then it will display a message and print the customer details.
     * If IsSold == false, then it will set new values of Customer details, sell date, discount percent.
     * It also calculates the new p=discounted price and sets IsSold to true.
     * And the instrument is sold.
     */
    public void SellInstrument(String Customer_Name, String Customer_Phone,int Customer_PAN,
    String Sell_Date, float DiscountPercent)
    {
        if(this.IsSold == true) //Condition where instrument is sold
        {
            System.out.println("This instrument is sold out!"); //Displaying message
            System.out.println("Purchased by: \'" + Customer_Name + "\'"); //printing value of Customer_Name
            System.out.println("Customer Phone: \'" + Customer_Phone + "\'"); //printing value of Customer_Phone
            System.out.println("Customer PAN: \'" + Customer_PAN + "\'" + "\n"); //printing value of Customer_PAN
        }
        else //Condition where instrument is not sold
        {
            super.setCustomerName(Customer_Name); //calling setters method of CustomerName and setting value of Customer_Name
            super.setCustomerPhone(Customer_Phone); //calling setters method of CustomerPhone and setting value of Customer_Phone
            super.setCustomerPAN(Customer_PAN); //calling setters method of CustomePAN and setting value of Customer_PAN
            this.SellDate = Sell_Date; //setting value of Sell_Date
            this.DiscountPercent = DiscountPercent; //setting value of DiscountPercent
            
            this.setPrice(this.Price - ((this.DiscountPercent/100) * this.Price)); //setting value of discounted price
            this.IsSold = true; //setting IsSold to true
        }
    }
    
    /*
     * Display is a method with public modifier and return type set as void.
     * 'super' keyword is used to call Display method of parent class.
     * Final price is also printed.
     * If IsRented == true, then it prints Customer details and SellDate.
     */
    public void Display()
    {
        super.Display();//calling Display method from parent class i.e Instrument class
        System.out.println("The final price of the Instrument is Rs." + this.getPrice()); //printing final price
        
        if(this.IsSold == true) //Condition when instrument is sold
        {
            System.out.println("Customer Name: \'" + this.getCustomerName() + "\'"); //printing value of CustomerName
            System.out.println("Customer Phone: \'" + this.getCustomerPhone() + "\'"); //printing value of CustomerPhone
            System.out.println("Customer PAN: \'" + this.getCustomerPAN() + "\'"); //printing value of CustomePAN
            System.out.println("Sold Date: \'" + this.SellDate + "\'" + "\n"); //printing value of SellDate
        }
    }
}
