/**
 * SarangiSansar is a public class which implements ActionListener and consists of a constructor and two methods actionPerformed and Main method.
 * The actionperformed method consists of multiple functions which makes the buttons of the JPanels functioning using swing, awt and awt events components.
 * Through this method, an instrument can be added for rent tor sale, an instrument can be rented, returned or sold.
 * @author (Sujal Maharjan)
 * @version (1.0.0)
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Font;
public class SarangiSansar implements ActionListener
{
    //creating swing components 
    JFrame f;
    JPanel ITR_panel, RI_panel, RET_panel, ITS_panel, SI_panel;
    JLabel /*left*/ Title, ITR, ITR_IN, ITR_CPD, RI, RI_IN, RI_CN, RI_PAN, RI_CP, RI_NOD, RI_RentD, RI_ReturnD, RET, RET_IN,
            /*right*/ITS, ITS_IN, ITS_P, SI, SI_IN, SI_CN, SI_PAN, SI_CP, SI_DP, SI_SellD;
    JTextField /*left*/ ITR_INtf, ITR_CPDtf, RI_INtf, RI_CNtf, RI_PANtf, RI_CPtf, RI_NODtf, RET_INtf,
            /*right*/ ITS_INtf, ITS_Ptf, SI_INtf, SI_CNtf, SI_PANtf, SI_CPtf, SI_DPtf;
    JButton ITR_add, RI_rent, RI_display, RI_clear, RET_return, ITS_add, SI_sell, SI_display, SI_clear;
    JComboBox<String> JCB_day1, JCB_month1, JCB_year1, JCB_day2, JCB_month2, JCB_year2, JCB_day3, JCB_month3, JCB_year3;
    
    /*Array*/
    String [] day={"DD","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15",
                    "16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32"};
    String [] month={"MM","Jan","Feb","Mar","Apr","May","June","July","Aug","Sep","Oct","Nov","Dec"};
    String [] year={"YYYY","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022"};
    
    //Array list
    ArrayList<Instrument> Instrument_Data = new ArrayList<Instrument>();
    
    //creating colors
    Color myColor1, myColor2, myColor3, myColor4;
    public SarangiSansar()
    {
        //creating new frame
        f = new JFrame("Sarangi Sansar");
        
        //main frame layout
        f.setVisible(true);
        f.setLayout(null);
        f.setSize(700,800);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        
        //creating main four panels
        ITR_panel = new JPanel();
        RI_panel = new JPanel();
        RET_panel = new JPanel();
        ITS_panel = new JPanel();
        SI_panel = new JPanel();
        
        //panel layouts
        ITR_panel.setLayout(null);
        ITR_panel.setVisible(true);
        RI_panel.setLayout(null);
        RI_panel.setVisible(true);
        RET_panel.setLayout(null);
        RET_panel.setVisible(true);
        ITS_panel.setLayout(null);
        ITS_panel.setVisible(true);
        SI_panel.setLayout(null);
        SI_panel.setVisible(true);
        
        //creating label for title
        Title = new JLabel("Sarangi Sansar");
        
        //creating labels for ITR_panel panel
        ITR = new JLabel("Instrument To Rent");
        ITR_IN = new JLabel("Instrument Name:");
        ITR_CPD = new JLabel("Charge Per Day:");
        
        //creating labels for RI_panel panel
        RI = new JLabel("Rent Instrument");
        RI_IN = new JLabel("Instrument Name:");
        RI_CN = new JLabel("Customer Name:");
        RI_PAN = new JLabel("Customer PAN:");
        RI_CP = new JLabel("Customer Phone:");
        RI_NOD = new JLabel("No. of Days:");
        RI_RentD = new JLabel("Rent Date:");
        RI_ReturnD = new JLabel("Return Date:");
        
        //creating labels for RET_panel panel
        RET = new JLabel("Return Instrument");
        RET_IN = new JLabel("Instrument Name:");
        
        //creating labels for ITS_panel panel
        ITS = new JLabel("Instrument To Sell");
        ITS_IN = new JLabel("Instrument Name:");
        ITS_P = new JLabel("Price:");
        
        //creating labels for SI_panel panel
        SI = new JLabel("Sell Instrument");
        SI_IN = new JLabel("Instrument Name:");
        SI_CN = new JLabel("Customer Name:");
        SI_PAN = new JLabel("Customer PAN:");
        SI_CP = new JLabel("Customer Phone:");
        SI_DP = new JLabel("Discount Percent:");
        SI_SellD = new JLabel("Selling Date:");
        
        //creating TextField for ITR_panel panel
        ITR_INtf = new JTextField();
        ITR_CPDtf = new JTextField();
        
        //creating TextField for RI_panel panel
        RI_INtf = new JTextField();
        RI_CNtf = new JTextField();
        RI_PANtf = new JTextField();
        RI_CPtf = new JTextField();
        RI_NODtf = new JTextField();
        
        //creating TextField for RET_panel panel
        RET_INtf = new JTextField();
        
        //creating TextFied for ITS_panel panel
        ITS_INtf = new JTextField();
        ITS_Ptf = new JTextField();
        
        //creating TextField for SI_panel panel
        SI_INtf = new JTextField();
        SI_CNtf = new JTextField();
        SI_PANtf = new JTextField();
        SI_CPtf = new JTextField();
        SI_DPtf = new JTextField();
        
        //creating combobox for RI_panel (rent date)
        JCB_day1 = new JComboBox<String>(day);
        JCB_month1 = new JComboBox<String>(month);
        JCB_year1 = new JComboBox<String>(year);
        
        //creating combobox for RI_panel (return date)
        JCB_day2 = new JComboBox<String>(day);
        JCB_month2 = new JComboBox<String>(month);
        JCB_year2 = new JComboBox<String>(year);
        
        //creating combobox for SI_panel (return date)
        JCB_day3 = new JComboBox<String>(day);
        JCB_month3 = new JComboBox<String>(month);
        JCB_year3 = new JComboBox<String>(year);
        
        //creating buttons for all left panel
        ITR_add = new JButton("Add");
        RI_rent = new JButton("Rent");
        RI_display = new JButton("Display");
        RI_clear = new JButton("Clear");
        RET_return = new JButton("Return");
        
        //creating buttons for all right panels
        ITS_add = new JButton("Add");
        SI_sell = new JButton("Sell");
        SI_display = new JButton("Display");
        SI_clear = new JButton("Clear");
        
        //adding four panels to the main JFrame
        f.add(ITR_panel);
        f.add(RI_panel);
        f.add(RET_panel);
        f.add(ITS_panel);
        f.add(SI_panel);
        
        //adding title in main JFrame
        f.add(Title);
        
        //setting bounds for title
        Title.setBounds(274,10,152,31);
            
        //adding ITR components to ITR_panel
        ITR_panel.add(ITR);
        ITR_panel.add(ITR_IN);
        ITR_panel.add(ITR_INtf);
        ITR_panel.add(ITR_CPD);
        ITR_panel.add(ITR_CPDtf);
        ITR_panel.add(ITR_add);
        
        //adding RI components to RI_panel
        RI_panel.add(RI);
        RI_panel.add(RI_IN);
        RI_panel.add(RI_INtf);
        RI_panel.add(RI_CN);
        RI_panel.add(RI_CNtf);
        RI_panel.add(RI_PAN);
        RI_panel.add(RI_PANtf);
        RI_panel.add(RI_CP);
        RI_panel.add(RI_CPtf);
        RI_panel.add(RI_NOD);
        RI_panel.add(RI_NODtf);
        RI_panel.add(RI_RentD);
        RI_panel.add(JCB_day1);
        RI_panel.add(JCB_month1);
        RI_panel.add(JCB_year1);
        RI_panel.add(RI_ReturnD);
        RI_panel.add(JCB_day2);
        RI_panel.add(JCB_month2);
        RI_panel.add(JCB_year2);
        RI_panel.add(RI_rent);
        RI_panel.add(RI_display);
        RI_panel.add(RI_clear);
        
        //adding RET components to RET_panel
        RET_panel.add(RET);
        RET_panel.add(RET_IN);
        RET_panel.add(RET_INtf);
        RET_panel.add(RET_return);
    
        //adding ITS components to ITS_panel
        ITS_panel.add(ITS);
        ITS_panel.add(ITS_IN);
        ITS_panel.add(ITS_INtf);
        ITS_panel.add(ITS_P);
        ITS_panel.add(ITS_Ptf);
        ITS_panel.add(ITS_add);
        
        //adding SI components to SI_panel
        SI_panel.add(SI);
        SI_panel.add(SI_IN);
        SI_panel.add(SI_INtf);
        SI_panel.add(SI_CN);
        SI_panel.add(SI_CNtf);
        SI_panel.add(SI_PAN);
        SI_panel.add(SI_PANtf);
        SI_panel.add(SI_CP);
        SI_panel.add(SI_CPtf);
        SI_panel.add(SI_DP);
        SI_panel.add(SI_DPtf);
        SI_panel.add(SI_SellD);
        SI_panel.add(JCB_day3);
        SI_panel.add(JCB_month3);
        SI_panel.add(JCB_year3);
        SI_panel.add(SI_sell);
        SI_panel.add(SI_display);
        SI_panel.add(SI_clear);
        
        //setting bounds for main four panels
        ITR_panel.setBounds(25,45,305,137);
        RI_panel.setBounds(25,195,305,405);
        RET_panel.setBounds(25,613,305,117);
        ITS_panel.setBounds(355,45,305,137);
        SI_panel.setBounds(355,195,305,535);
        
        //setting bounds for components of ITR_panel
        ITR.setBounds(76,0,153,25);
        
        ITR_IN.setBounds(6,36,112,20);
        ITR_INtf.setBounds(138,36,150,20);
        ITR_CPD.setBounds(6,71,101,20);
        ITR_CPDtf.setBounds(138,71,150,20);
        ITR_add.setBounds(117,106,71,25);
        
        //setting bounds for components of RI_panel
        RI.setBounds(88,0,129,25);
        RI_IN.setBounds(6,38,112,20);
        RI_INtf.setBounds(141,38,150,20);
        RI_CN.setBounds(6,78,110,20);
        RI_CNtf.setBounds(141,78,150,20);
        RI_PAN.setBounds(6,118,101,20);
        RI_PANtf.setBounds(141,118,150,20);
        RI_CP.setBounds(6,158,110,20);
        RI_CPtf.setBounds(141,158,150,20);
        RI_NOD.setBounds(6,198,81,20);
        RI_NODtf.setBounds(141,198,150,20);
        //rent date and combo box
        RI_RentD.setBounds(6,238,67,20);
        JCB_day1.setBounds(141,238,44,20);
        JCB_month1.setBounds(187,238,46,20);
        JCB_year1.setBounds(235,238,56,20);
        //return date and combo box
        RI_ReturnD.setBounds(6,278,80,20);
        JCB_day2.setBounds(141,278,44,20);
        JCB_month2.setBounds(187,278,46,20);
        JCB_year2.setBounds(235,278,56,20);
        //buttons of RI panel
        RI_rent.setBounds(141,318,67,25);
        RI_display.setBounds(216,318,75,25);
        RI_clear.setBounds(216,363,75,25);
        
        //setting bounds for components of RET_panel
        RET.setBounds(89,0,145,25);
        RET_IN.setBounds(6,42,112,20);
        RET_INtf.setBounds(141,42,150,20);
        RET_return.setBounds(215,82,75,25);
        
        //setting bounds for components of ITS_panel
        ITS.setBounds(80,0,145,25);
        ITS_IN.setBounds(6,36,112,20);
        ITS_INtf.setBounds(138,36,150,20);
        ITS_P.setBounds(6,71,36,20);
        ITS_Ptf.setBounds(138,71,150,20);
        ITS_add.setBounds(117,106,71,25);
        
        //setting bounds for components of SI_panel
        SI.setBounds(90,0,124,25);
        SI_IN.setBounds(6,38,112,20);
        SI_INtf.setBounds(141,38,150,20);
        SI_CN.setBounds(6,78,104,20);
        SI_CNtf.setBounds(141,78,150,20);
        SI_PAN.setBounds(6,118,95,20);
        SI_PANtf.setBounds(141,118,150,20);
        SI_CP.setBounds(6,158,112,20);
        SI_CPtf.setBounds(141,158,150,20);
        SI_DP.setBounds(6,198,120,20); 
        SI_DPtf.setBounds(141,198,150,20); 
        //Sell date and combo box
        SI_SellD.setBounds(6,238,105,20);
        JCB_day3.setBounds(141,238,44,20);
        JCB_month3.setBounds(187,238,46,20);
        JCB_year3.setBounds(235,238,56,20);
        //buttons of SI panel
        SI_sell.setBounds(141,278,67,25);
        SI_display.setBounds(215,278,75,25);
        SI_clear.setBounds(215,318,75,25);
        
        //setting fonts for title
        Title.setFont(new Font("Verdana", Font.PLAIN, 18));
        
        //setting fonts for ITR_panel
        ITR.setFont(new Font("Verdana", Font.PLAIN, 15));
        
        //setting fonts for RI_panel
        RI.setFont(new Font("Verdana", Font.PLAIN, 15));
        JCB_day1.setFont(new Font("Verdana", Font.PLAIN, 12));
        JCB_month1.setFont(new Font("Verdana", Font.PLAIN, 12));
        JCB_year1.setFont(new Font("Verdana", Font.PLAIN, 12));
        JCB_day2.setFont(new Font("Verdana", Font.PLAIN, 12));
        JCB_month2.setFont(new Font("Verdana", Font.PLAIN, 12));
        JCB_year2.setFont(new Font("Verdana", Font.PLAIN, 12));
        
        //setting fonts for components of RET_panel
        RET.setFont(new Font("Verdana", Font.PLAIN, 15));
        
        //setting fonts for components of ITS_panel
        ITS.setFont(new Font("Verdana", Font.PLAIN, 15));
        
        //setting fonts for components of SI_panel
        SI.setFont(new Font("Verdana", Font.PLAIN, 15));
        JCB_day3.setFont(new Font("Verdana", Font.PLAIN, 12));
        JCB_month3.setFont(new Font("Verdana", Font.PLAIN, 12));
        JCB_year3.setFont(new Font("Verdana", Font.PLAIN, 12));
        
        //settings colors for different panels and main JFrame
        myColor1 = new Color(207, 210, 207);
        f.getContentPane().setBackground(myColor1);
        
        myColor2 = new Color(245, 237, 220);
        ITR_panel.setBackground(myColor2);
        RI_panel.setBackground(myColor2);
        RET_panel.setBackground(myColor2);
        ITS_panel.setBackground(myColor2);
        SI_panel.setBackground(myColor2);
        
        //setting colors for buttons
        myColor3 = new Color(207, 210, 207);
        ITR_add.setBackground(myColor3);
        RI_rent.setBackground(myColor3);
        RI_display.setBackground(myColor3);
        RI_clear.setBackground(myColor3);
        RET_return.setBackground(myColor3);
        ITS_add.setBackground(myColor3);
        SI_sell.setBackground(myColor3);
        SI_display.setBackground(myColor3);
        SI_clear.setBackground(myColor3);
        
        //setting color of labels
        myColor4 = new Color(84, 71, 71);
        
        ITR_IN.setForeground(myColor4);
        ITR_CPD.setForeground(myColor4);
        
        RI_IN.setForeground(myColor4);
        RI_CN.setForeground(myColor4);
        RI_PAN.setForeground(myColor4);
        RI_CP.setForeground(myColor4);
        RI_NOD.setForeground(myColor4);
        RI_RentD.setForeground(myColor4);
        RI_ReturnD.setForeground(myColor4);
        
        RET_IN.setForeground(myColor4);
        
        ITS_IN.setForeground(myColor4);
        ITS_P.setForeground(myColor4);
        
        SI_IN.setForeground(myColor4);
        SI_CN.setForeground(myColor4);
        SI_PAN.setForeground(myColor4);
        SI_CP.setForeground(myColor4);
        SI_DP.setForeground(myColor4);
        SI_SellD.setForeground(myColor4);
        
        //adding button action listener
        ITR_add.addActionListener(this);
        RI_rent.addActionListener(this);
        RI_display.addActionListener(this);
        RI_clear.addActionListener(this);
        RET_return.addActionListener(this);
        ITS_add.addActionListener(this);
        SI_sell.addActionListener(this);
        SI_display.addActionListener(this);
        SI_clear.addActionListener(this);
    }
    
    
    public void actionPerformed(ActionEvent e)
    {   
        /*
         * This function handles the add button of the ITR_panel and helps to add an instrument in the arraylist which can be listed for rent
         * It checks the textfields and displays appropriate message if any text field is empty or has mistake values
         * It displays appropriate message if the instrument is added correctly
         */
        if(e.getSource() == ITR_add)
        {
            if(ITR_INtf.getText().isEmpty() || ITR_CPDtf.getText().isEmpty()) //Checking if the text fields are empty
            {
                JOptionPane.showMessageDialog(f, "Fields are empty!", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            
            else
            {
                try
                {
                    String ITR_IN = ITR_INtf.getText(); //Initializing new variables and getting values that we get from textfields
                    int ITR_CPD = Integer.parseInt(ITR_CPDtf.getText()); //converting string to int
                    boolean InstrumentIsAddedR = false;  
                    if(ITR_CPD <= 0) //Checking if the textfield vaule is lessthan or equal to zero
                    {
                        JOptionPane.showMessageDialog(f, "Value cannot be zero", "VALUE ERROR", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else
                    {
                        if(Instrument_Data.isEmpty()) //checking if the arraylist is empty or not
                        {
                            InstrumentToRent insRENT = new InstrumentToRent(ITR_IN, ITR_CPD);
                            Instrument_Data.add(insRENT);
                            JOptionPane.showMessageDialog(f,"The instrument is added for rent","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
                            
                            ITR_INtf.setText("");
                            ITR_CPDtf.setText("");
                        }
                        else
                        {
                            //for loop to check if the instrument name has already been added to the arraylist or not
                            for(Instrument Instrument_obj : Instrument_Data)
                            {
                                //Checking if the object is of InstrumentToRent Class
                                if(Instrument_obj instanceof InstrumentToRent)
                                {
                                    //Checking if the instrument exists in arraylist or not
                                    if(Instrument_obj.getInstrumentName().equals(ITR_IN))
                                    {
                                        InstrumentIsAddedR = true;
                                    }
                                }
                            }
                            //checking if instrument is already added or not
                            if(InstrumentIsAddedR == true) 
                            {
                                JOptionPane.showMessageDialog(f,"Instrument is already added","ERROR",JOptionPane.ERROR_MESSAGE);
                                
                                ITR_INtf.setText("");
                                ITR_CPDtf.setText("");
                            }
                            else
                            {
                                InstrumentToRent insRENT = new InstrumentToRent(ITR_IN, ITR_CPD);
                                Instrument_Data.add(insRENT);
                                JOptionPane.showMessageDialog(f,"The instrument is added for rent","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
                                
                                ITR_INtf.setText("");
                                ITR_CPDtf.setText("");
                            }
                        }
                    }
                }
                catch(NumberFormatException a) //catching exception
                {
                    JOptionPane.showMessageDialog(f, "Number format error", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        
        /*
         * This function handles the add button of the ITS_panel and helps to add an instrument in the arraylist which can be listed for sale
         * It checks the textfields and displays appropriate message if any text field is empty or has mistake values
         * It displays appropriate message if the instrument is added correctly
         */
        if(e.getSource() == ITS_add)
        {
            if(ITS_INtf.getText().isEmpty() || ITS_Ptf.getText().isEmpty()) //Checking if the text fields are empty
            {
                JOptionPane.showMessageDialog(f, "Fields are empty!", "ERROR", JOptionPane.INFORMATION_MESSAGE);
            }
            
            else
            {
                try
                {
                    String ITS_IN = ITS_INtf.getText(); //Initializing new variables and getting values that we get from textfields
                    int ITS_P = Integer.parseInt(ITS_Ptf.getText()); //converting string to int
                    boolean InstrumentIsAddedS = false;  
                    if(ITS_P <= 0) //Checking if the textfield vaule is lessthan or equal to zero
                    {
                        JOptionPane.showMessageDialog(f, "Value cannot be zero", "VALUE ERROR", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else
                    {
                        if(Instrument_Data.isEmpty()) //checking if the arraylist is empty or not
                        {
                            InstrumentToSell insSELL = new InstrumentToSell(ITS_IN, ITS_P);
                            Instrument_Data.add(insSELL);
                            JOptionPane.showMessageDialog(f,"The instrument is added for sale","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
                            
                            ITS_INtf.setText("");
                            ITS_Ptf.setText("");
                        }
                        else
                        {
                            //for loop to check if the instrument name has already been added to the arraylist or not
                            for(Instrument Instrument_obj : Instrument_Data)
                            {
                                //Checking if the object is of InstrumentToSell Class
                                if(Instrument_obj instanceof InstrumentToSell)
                                {
                                    //Checking if the instrument exists in arraylist or not
                                    if(Instrument_obj.getInstrumentName().equals(ITS_IN))
                                    {
                                        InstrumentIsAddedS = true;
                                    }
                                }
                            }
                            //checking if instrument is already added or not
                            if(InstrumentIsAddedS == true)
                            {
                                JOptionPane.showMessageDialog(f,"Instrument is already added","ERROR",JOptionPane.ERROR_MESSAGE);
                            }
                            else
                            {
                                InstrumentToSell insRENT = new InstrumentToSell(ITS_IN, ITS_P);
                                Instrument_Data.add(insRENT);
                                JOptionPane.showMessageDialog(f,"The instrument is added for sale","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
                                
                                ITS_INtf.setText("");
                                ITS_Ptf.setText("");
                            }
                        }
                    }
                }
                catch(NumberFormatException a) //catching exception
                {
                    JOptionPane.showMessageDialog(f, "Number format error", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        
        /*
         * This function handles the rent button of the RI_panel and helps to rent an instrument present in the array list
         * It checks the textfields and displays appropriate message if any text field is empty or has mistake values
         * It displays appropriate message if the instrument rented correctly using correct values in the textfields
         */
        if(e.getSource() == RI_rent)
        {
            if(Instrument_Data.isEmpty()) //checking if the arraylist is empty or not
            {
                JOptionPane.showMessageDialog(f,"No Instrument To Rent","ERROR",JOptionPane.ERROR_MESSAGE); 
            }
            //Checking if the text fields are empty
            else if(RI_INtf.getText().isEmpty() || RI_CNtf.getText().isEmpty() || RI_CPtf.getText().isEmpty() || 
                    RI_NODtf.getText().isEmpty() || RI_PANtf.getText().isEmpty())   
            {
                JOptionPane.showMessageDialog(f,"Fill in all the text fields!","Error",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                try
                {
                    //Initializing new variables and getting values that we get from textfields
                    String Instrument_Name = RI_INtf.getText();
                    String Customer_Name = RI_CNtf.getText();
                    String Customer_Phone = RI_CPtf.getText();
                    int Customer_PAN = Integer.parseInt(RI_PANtf.getText());
                    int NoOfDays = Integer.parseInt(RI_NODtf.getText());
                    
                    String RDay = String.valueOf(JCB_day1.getSelectedItem());
                    String RMonth = String.valueOf(JCB_month1.getSelectedItem());
                    String RYear = String.valueOf(JCB_year1.getSelectedItem());
                    String RDate = RDay + "-" + RMonth + "-" + RYear;
                    
                    String RetDay = String.valueOf(JCB_day2.getSelectedItem());
                    String RetMonth = String.valueOf(JCB_month2.getSelectedItem());
                    String RetYear = String.valueOf(JCB_year2.getSelectedItem());
                    String RetDate = RetDay + "-" + RetMonth + "-" + RetYear;
                    
                    boolean RentInstrument = false;
                        
                    
                    //for loop to check if the instrument name has already been added to the arraylist or not
                    for(Instrument Instrument_obj : Instrument_Data)
                    {
                        if((Instrument_obj.getInstrumentName()).equals(Instrument_Name)) //Checking if the instrument exists in arraylist or not
                        { 
                            RentInstrument = true;
                            
                            if(Instrument_obj instanceof InstrumentToRent) //Checking if the object is of InstrumentToRent Class
                            {
                                InstrumentToRent InstrumentToRentObj = (InstrumentToRent)Instrument_obj; //Creating new object of InstrumentToRent class
    
                                if(InstrumentToRentObj.getIsRented()) //checking if instrument is already rented or not
                                {
                                    JOptionPane.showMessageDialog(f,"The following instrument is already rented","Message",JOptionPane.INFORMATION_MESSAGE);
                                }
                                else
                                {
                                    //Instrument being rented with the help of method RentInstrument method of Instrument to Rent
                                    InstrumentToRentObj.RentInstrument(Customer_Name, Customer_Phone, Customer_PAN, RDate, RetDate, NoOfDays);
                                    //"/n" breaks the line
                                    JOptionPane.showMessageDialog(f,"Instrument Rented successfully.\n" + "Instrument Name: " + InstrumentToRentObj.getInstrumentName(), 
                                                                  "Message",JOptionPane.INFORMATION_MESSAGE);
                                    break;
                                }
                            }
                            else //the object is not of InstrumentToRent class so cannot be rented
                            {
                                JOptionPane.showMessageDialog(f,"Instrument is listed for sale! Cannot be rented!","Error",JOptionPane.ERROR_MESSAGE);
                                break;
                            }
                        }
                    }
                    
                    if(RentInstrument == false) //checking if instrument is listed in arraylist for rent or not
                    {
                        JOptionPane.showMessageDialog(f,"Instrument Not Found! Please add instrument first!","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }
                catch(NumberFormatException a) //catching exception
                {
                    JOptionPane.showMessageDialog(f,"Number Format Error!","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
            //setting text fields to null
            RI_INtf.setText("");
            RI_CNtf.setText("");
            RI_PANtf.setText("");
            RI_CPtf.setText("");
            RI_NODtf.setText("");
        }
        
        
        /*
         * This function handles the return button of the RET_panel and helps to renturn a rented instrument
         * It checks the textfields and displays appropriate message if any text field is empty or has mistake values
         * It displays appropriate message if the instrument returned correctly using correct values in the textfields
         */
        if(e.getSource() == RET_return)
        {
            if(Instrument_Data.isEmpty()) //checking if the arraylist is empty or not
            {
                JOptionPane.showMessageDialog(f,"Instrument is not added!!","Error",JOptionPane.ERROR_MESSAGE);
            }
            else if(RET_INtf.getText().isEmpty()) //Checking if the text fields are empty
            {
                JOptionPane.showMessageDialog(f,"Instrument Name empty!","Error",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                String Instrument_Name = RET_INtf.getText(); //initializing new variable
                boolean InstrumentReturned = false;
                for(Instrument Instrument_obj : Instrument_Data)
                {
                    //Checking if the instrument is present in arraylist or not
                    if(Instrument_obj.getInstrumentName().equals(Instrument_Name)) 
                    {
                        InstrumentReturned = true;
                        
                        if(Instrument_obj instanceof InstrumentToRent) //Checking if the object is of InstrumentToRent Class
                        {
                            InstrumentToRent InstrumentReturnObj = (InstrumentToRent)Instrument_obj; //Creating new object of InstrumentToRent class

                            if(InstrumentReturnObj.getIsRented()) //checking if instrument is returned or not
                            {
                                InstrumentReturnObj.ReturnInstrument();
                                JOptionPane.showMessageDialog(f,"The Instrument has been Returned successfully!\n" + "Instrument Name: " + 
                                InstrumentReturnObj.getInstrumentName(),"Message",JOptionPane.INFORMATION_MESSAGE);
                            }
                            else //already returned
                            {
                                JOptionPane.showMessageDialog(f,"The instrument is available for renting.","Message",JOptionPane.INFORMATION_MESSAGE);
                                break;
                            }
                        }
                        else //the object is not of InstrumentToSell class so cannot be rented or returned
                        {   
                            JOptionPane.showMessageDialog(f,"The instrument name you have written is listed for sale not rent!","Error",JOptionPane.ERROR_MESSAGE);
                            break;
                        }
                    }
                }
                //checking whether instrument is in Arraylist or not
                if(InstrumentReturned == false)
                {
                    JOptionPane.showMessageDialog(f,"Instrument has not been added!! Please add the instrument first!!","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
            RET_INtf.setText(""); //setting textfield as null
        }
        
        
        /*
         * This function handles the sell button of the SI_panel and helps to sell an instrument present in the array list
         * It checks the textfields and displays appropriate message if any text field is empty or has mistake values
         * It displays appropriate message if the instrument sold correctly using correct values in the textfields
         */
        if(e.getSource() == SI_sell)
        {
            if(Instrument_Data.isEmpty()) //checking if the arraylist is empty or not
            {
                JOptionPane.showMessageDialog(f,"No Instrument To Sell","ERROR",JOptionPane.ERROR_MESSAGE); 
            }
            
            else if(SI_INtf.getText().isEmpty() || SI_CNtf.getText().isEmpty() || SI_CPtf.getText().isEmpty() || 
                    SI_PANtf.getText().isEmpty() || SI_DPtf.getText().isEmpty()) //Checking if the text fields are empty
            {
                JOptionPane.showMessageDialog(f,"Fill in all the text fields!","Error",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                try
                {
                    //initializing new variables and getting values that we get from textfields
                    String Instrument_Name = SI_INtf.getText();
                    String Customer_Name = SI_CNtf.getText();
                    String Customer_Phone = SI_CPtf.getText();
                    int Customer_PAN = Integer.parseInt(SI_PANtf.getText());
                    float Discount_Percent = Integer.parseInt(SI_DPtf.getText());
                    
                    String SDay = String.valueOf(JCB_day3.getSelectedItem());
                    String SMonth = String.valueOf(JCB_month3.getSelectedItem());
                    String SYear = String.valueOf(JCB_year3.getSelectedItem());
                    String SDate = SDay + "-" + SMonth + "-" + SYear;
                    
                    boolean SellInstrument = false;
                    
                    //for loop to check if the instrument name has already been added to the arraylist or not
                    for(Instrument Instrument_obj : Instrument_Data)
                    {
                        if((Instrument_obj.getInstrumentName()).equals(Instrument_Name)) //Checking if the instrument exists in arraylist or not
                        { 
                            SellInstrument = true;
                            
                            if(Instrument_obj instanceof InstrumentToSell) //Checking if the object is of InstrumentToSell Class
                            {
                                InstrumentToSell InstrumentToSellObj = (InstrumentToSell)Instrument_obj; //Creating new object of InstrumentToSell class
    
                                if(InstrumentToSellObj.getIsSold()) //already sold
                                {
                                    JOptionPane.showMessageDialog(f,"The following instrument is already sold","Message",JOptionPane.INFORMATION_MESSAGE);
                                }
                                else
                                {
                                    //Instrument being rented with the help of method SellInstrument of Instrument to Rent
                                    InstrumentToSellObj.SellInstrument(Customer_Name, Customer_Phone, Customer_PAN, SDate, Discount_Percent);
                                    // "/n" gives a line after the message is printed
                                    JOptionPane.showMessageDialog(f,"Instrument Sold successfully.\n" + "Instrument Name: " + InstrumentToSellObj.getInstrumentName() 
                                                                  + "\nPrice: " + InstrumentToSellObj.getPrice() ,
                                                                  "Message",JOptionPane.INFORMATION_MESSAGE);
                                    break;
                                }
                            }
                            else //the object is not of InstrumentToSell class so cannot be sold
                            {
                                JOptionPane.showMessageDialog(f,"Instrument is listed for rent! Cannot be sold!","Error",JOptionPane.ERROR_MESSAGE);
                                break;
                            }
                        }
                    }
                    
                    if(SellInstrument == false) //checking if instrument is added in arraylist  for sale or not
                    {
                        JOptionPane.showMessageDialog(f,"Instrument Not Found! Please add instrument first!","Error",
                        JOptionPane.ERROR_MESSAGE);
                    }
                }
                catch(NumberFormatException a) //catching exception
                {
                    JOptionPane.showMessageDialog(f,"Number Format Error!","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
            //setting textfields to null
            SI_INtf.setText("");
            SI_CNtf.setText("");
            SI_PANtf.setText("");
            SI_CPtf.setText("");
            SI_DPtf.setText("");
        }
        
        /*
         * This function handles the display button of the RI_panel and helps to display details of an instrument present in the array list
         * It checks the textfields and displays appropriate message if the required instrument is not present in the arraylist
         * It displays required values in the terminal
         */
        if(e.getSource() == RI_display)
        {
            //checking if array list is empty
            if(Instrument_Data.isEmpty())
            {
                    JOptionPane.showMessageDialog(f,"No Instrument Found!","Error",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                //showing dialog box
                JOptionPane.showMessageDialog(f,"Check Terminal for the displayed information.","Information",JOptionPane.INFORMATION_MESSAGE);
                //for loop to check if the instrument name has already been added to the arraylist or not
                for(Instrument Instrument_obj : Instrument_Data)
                {
                    //to check if the object is of InstrumentToRent Class
                    if(Instrument_obj instanceof InstrumentToRent)
                    {
                        //Down casting object
                        InstrumentToRent InstrumentRentObj = (InstrumentToRent)Instrument_obj;

                        //Calling the display method of InstrumentToRent class
                        InstrumentRentObj.Display();
                    }
                }
            }
        }
        
        /*
         * This function handles the display button of the SI_panel and helps to display details of an instrument present in the array list
         * It checks the textfields and displays appropriate message if the required instrument is not present in the arraylist
         * It displays required values in the terminal
         */
        if(e.getSource() == SI_display)
        {
            //chceking if array list is empty and showing message accordingly
            if(Instrument_Data.isEmpty())
            {
                    JOptionPane.showMessageDialog(f,"Instrument not added!! Please add the instrument","Error",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                //Dialog box telling the user to check the terminal for for the displayed information
                JOptionPane.showMessageDialog(f,"Check Terminal for the displayed information.","Information",JOptionPane.INFORMATION_MESSAGE);
                //for loop to check if the instrument name has already been added to the arraylist or not
                for(Instrument Instrument_obj : Instrument_Data)
                {
                    //to check if the object is of InstrumentToSell Class
                    if(Instrument_obj instanceof InstrumentToSell)
                    {
                        //Down casting object
                        InstrumentToSell InstrumentSellObj = (InstrumentToSell)Instrument_obj;

                        //Calling the display method of InstrumentToSell class
                        InstrumentSellObj.Display();
                    }
                }
            }
        }
        
        //Clear Button of RI_panel
        if(e.getSource() == RI_clear)
        {
            //setting textfields and index of JComboBox as null
            RI_INtf.setText("");
            RI_CNtf.setText("");
            RI_PANtf.setText("");
            RI_NODtf.setText("");
            RI_CPtf.setText("");
            JCB_day1.setSelectedIndex(0);
            JCB_month1.setSelectedIndex(0);
            JCB_year1.setSelectedIndex(0);
            JCB_day2.setSelectedIndex(0);
            JCB_month2.setSelectedIndex(0);
            JCB_year2.setSelectedIndex(0);
        }
        
        //Clear Button of SI_panel
        if(e.getSource() == SI_clear)
        {
            //setting textfields and index of JComboBox as null
            SI_INtf.setText("");
            SI_CNtf.setText("");
            SI_PANtf.setText("");
            SI_CPtf.setText("");
            SI_DPtf.setText("");
            JCB_day3.setSelectedIndex(0);
            JCB_month3.setSelectedIndex(0);
            JCB_year3.setSelectedIndex(0);
        }
    }
    
    //main method
    public static void main(String[] args)
    {
        //calling constructor
        new SarangiSansar();
    }
}