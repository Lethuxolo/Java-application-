/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lethuxolo
 */
public class Delivery_Details {
    
//DECLARING THE VARIABLES
       private String CapeTownCity;
       private String PretoriaCity;
       private String DurbanCity;
       private final String ABCcouriers = "ABC couriers";
       private final String FastTruck = "Fast Truck";
       private final String RestAssured = "Restassured";
       
//INSERTING A GETTER AND SETTER FUNCTION FOR THE CITIES
     public String getCapeTownCity() {
        return CapeTownCity;
    }

    public void setCapeTownCity(String CapeTownCity) {
        this.CapeTownCity = CapeTownCity;
    }

    public String getPretoriaCity() {
        return PretoriaCity;
    }

    public void setPretoriaCity(String PretoriaCity) {
        this.PretoriaCity = PretoriaCity;
    }

    public String getDurbanCity() {
        return DurbanCity;
    }

    public void setDurbanCity(String DurbanCity) {
        this.DurbanCity = DurbanCity;
    }
    
//INSERTING A GETTER FUNCTION FOR THE COSTS AND COURIERS
private final int Cost1 = 300;
private final int Cost2 = 500;
private final int Cost3 = 700;       

    public int getCost1() {
        return Cost1;
    }

    public int getCost2() {
        return Cost2;
    }

    public int getCost3() {
        return Cost3;
    }
    
    public String getABCcouriers(){
           return ABCcouriers;
       }
    public String getFastTruck(){
           return FastTruck;
       }
    public String getRestAssured(){
           return RestAssured;
       }
       
//INSERTING A GETTER FUNCTION FOR THE WEIGHTCLASSES
public final String weight1 = "0-4kg";
public final String weight2 = "5-9kg";
public final String weight3 = "Over 10kg";

    public String getWeight1() {
        return weight1;
    }

    public String getWeight2() {
        return weight2;
    }

    public String getWeight3() {
        return weight3;
    }
    
    }

