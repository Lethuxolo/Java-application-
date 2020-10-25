
public class Details {
    static boolean getUpdatedSalary;

    //delcare data members   
    private String employeeIDNumber;
    private String employeeName;
    private String employeSurname;
    private double originalSalary;
    private double increasedAmt;
    

public Details() {
    increasedAmt = 0.10;
}

    public double getIncreasedAmt() {
        return increasedAmt;
    }

    public String getEmployeeIDNumber() {
        return employeeIDNumber;
    }

    public void setEmployeeIDNumber(String employeeIDNumber) {
        this.employeeIDNumber = employeeIDNumber;
    }

    public void setIncreasedAmt() {
        this.increasedAmt = increasedAmt;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeSurname() {
        return employeSurname;
    }

    public void setEmployeSurname(String employeSurname) {
        this.employeSurname = employeSurname;
    }

    public double getOriginalSalary() {
        return originalSalary;
    }

    public void setOriginalSalary(double originalSalary) {
        this.originalSalary = originalSalary;
    }

    public void setIncreasedAmt(double increasedAmt) {
        this.increasedAmt = increasedAmt;
    }

    public static boolean isGetUpdatedSalary() {
        return getUpdatedSalary;
    }

    public static void setGetUpdatedSalary(boolean getUpdatedSalary) {
        Details.getUpdatedSalary = getUpdatedSalary;
    }
    
    public double getIncreaseAmt() {
        double increaseAmt = 0;
        increaseAmt = originalSalary * increasedAmt;
        return increaseAmt;
    }
    
    public double getUpdatedSalary(double increaseAmt) {
        double newSalary = increaseAmt + originalSalary;
        return newSalary;
    }

    void getIncreaseAmt(double increaseAmt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getUpdatedSalary() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setGetUpdatedSalary(double newSalary) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}