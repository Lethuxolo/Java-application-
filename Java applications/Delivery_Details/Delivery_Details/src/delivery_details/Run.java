import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lethuxolo 
 */
public class Run {
    public static void main(String[] args) {
        
//DECLARING THE VARIABLES
    Delivery_Details d1 = new Delivery_Details();
        
	String Town = "";
        String Company;
        String Weight;
	double Price = 0;
        double Vat;
        double Total;
        
//ASSIGNING THE USER SELECTION TOWN/CITY TO ITS NUMBERS INSERTED BY USER
       String strTown = JOptionPane.showInputDialog(null,"Select the Town the parcel will be delivered to: "
                                                        + "\n1) Cape town "
                                                        + "\n2) Pretoria "
                                                        + "\n3) Durban ");
       switch (strTown){
           case "1":
                d1.setCapeTownCity("Cape Town");
                Town = d1.getCapeTownCity();
            break;

           case "2":
               d1.setPretoriaCity("Pretoria");
               Town = d1.getPretoriaCity();
           break;

           case "3":
               d1.setDurbanCity("Durban");
               Town = d1.getDurbanCity();
           break;
           
           default:
               JOptionPane.showMessageDialog(null, "incorrect input");
           break;
        }

//ASSIGNING THE USER SELECTION WEIGHT TO ITS NUMBERS INSERTED BY USER
       Weight = JOptionPane.showInputDialog(null,"Select the Weight category of the parcel to be delivered to: " + Town
                                                         + "\n1) 0-4 kg" 
                                                         + "\n2) 5-9kg" 
                                                         + "\n3) over 10kg");
       switch (Weight){
           case "1":
                Weight = d1.getWeight1();
                Price = d1.getCost1();
            break;

           case "2":
               Weight = d1.getWeight2();
               Price = d1.getCost2();
           break;

           case "3":
               Weight = d1.getWeight3();
               Price = d1.getCost3();
           break;
           
           default:
               JOptionPane.showMessageDialog(null,"incorrect input");
           break;
        }
       
//CALCULATIONS FOR VAT AND TOTAL AMOUNT
       Vat = Price * 0.14;
       Total = Vat + Price;
       
//ASSIGNING THE USER SELECTION COMPANTY TO ITS NUMBERS INSERTED BY USER
       Company = JOptionPane.showInputDialog(null,"Select the Company to deliver the parcel of:" + Weight + "to" + Town
                                                                 + "\n1) ABC Couriers" 
                                                        	 + "\n2) Fast Track"
								 + "\n3) Rest Assured");
       switch (Company){
           case "1":
                Company = d1.getABCcouriers();
            break;

           case "2":
               Company = d1.getFastTruck();
           break;

           case "3":
               Company = d1.getRestAssured();
           break;
           
           default:
               JOptionPane.showMessageDialog(null,"incorrect input");
           break;
        }
       
//SHOWING THE RESULTS FROM USER  
        System.out.println("DELIVERY REPORT - Created on " 
                         + "\n******************************************"
                         + "\n" + "Town:           " + Town
                         + "\n" + "Weight:         " + Weight
                         + "\n" + "Price:          R" + Price
                         + "\n" + "Vat (14%):      R" + Vat
                         + "\n" + "Total Due:      R" + Total
                         + "\n" + "Courier:        " + Company
                         + "\n******************************************");
    }
   
}
