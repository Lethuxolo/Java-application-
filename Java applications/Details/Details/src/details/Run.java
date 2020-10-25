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

//DECLARATION THE VARIABLES:
        double increasedAmt = 0.10;
        double Tax = 0.18;
        double MedicalAid = 0.125;
        double CarAllowance = 0.08;
        double UIF = 0.02;

//PROMPTING THE USER TO INPUT THE INFORMATION:
        String stremployeeNumber = JOptionPane.showInputDialog(null, "Employee Number: ");
        String stremployeeName = JOptionPane.showInputDialog(null, "Employee Name: ");
        String stremployeeSurname = JOptionPane.showInputDialog(null, "Employee Surname: ");
        String stroriginalSalary = JOptionPane.showInputDialog(null, "Salary to be increased: ");
        double originalSalary = Double.parseDouble(stroriginalSalary);

//VIWEING THE EMPLOYEE DETAILS REPORT AFTER EMPLOYEE INFORMATION HAS BEEN ENTERED AND CALCULATING EMPLOYEE NEW SALARY:
        System.out.println("EMPLOYEE DETAILS REPORT: " 
                         + "\n**********************************************************"); 
        System.out.println("Employee Number:                   " + stremployeeNumber);
        System.out.println("Employee Name:                     " + stremployeeName);
        System.out.println("Employee Surname:                  " + stremployeeSurname);
        System.out.println("Original Salary:                   R" + originalSalary);
        double sum1 = increaseAmt(originalSalary, increasedAmt);
        System.out.println("Increase amount:                   R" + sum1);
        double sum2 = getUpdatedSalary(sum1, originalSalary);
        System.out.println("Salary with increase added:        R" + sum2);
        String strNum1 = JOptionPane.showInputDialog(null, "Enter 1 to view employee deductions");
        System.out.println(strNum1 
                         + "\n**********************************************************");

        
//VIEWING  THE EMPLOYEE DEDUCTIONS REPORT OF THE NEW SLARY AFTER INCREASE AND VIEWING THE TAKE HOME SALARY AFTER DEDUCTIONS HAVE BEEN CALCULATED:
        System.out.println("EMPLOYEE DEDUCTIONS REPORT: "
                         + "\n**********************************************************");
        double getUpdatedSalary = getUpdatedSalary(sum1, originalSalary);
        System.out.println("Salary:                           R" + sum2);
        double taxDeductionsAmt = taxDeductionsAmt(sum2, Tax);
        System.out.println("Tax:                              R" + taxDeductionsAmt);
        double medicalAidAmt = medicalAidAmt(sum2, MedicalAid);
        System.out.println("Medical Aid:                      R" + medicalAidAmt);
        double carAllowanceAmt = carAllowanceAmt(sum2, CarAllowance);
        System.out.println("Car Allowance:                    R" + carAllowanceAmt);
        double theUIFAmt = theUIFAmt(sum2, UIF);
        System.out.println("UIF:                              R" + theUIFAmt);
        double salaryDeductions = salaryDeductions(taxDeductionsAmt, medicalAidAmt, carAllowanceAmt, theUIFAmt, sum2);
        System.out.println("Take Home Pay:                    R" + salaryDeductions 
                         + "\n**********************************************************");
}

//RETURN STATEMENTS FOR THE VALUES:
    public double Salary(double originalSalary) {
        return originalSalary;
    }

    public double IncreasedAmt(double increasedAmt) {
        return increasedAmt;
    }

    public static double getTax(double Tax) {
        return Tax;
    }

    public static double getMedicalAid(double MedicalAid) {
        return MedicalAid;
    }

    public static double getCarAllowance(double CarAllowance) {
        return CarAllowance;
    }

    public static double getUIF(double UIF) {
        return UIF;
    }

//CALCULATING THE VALUES:
    public static double increaseAmt(double originalSalary, double increasedAmt) {
        double sum1 = (originalSalary * increasedAmt);
        return sum1;
    }

    public static double getUpdatedSalary(double sum1, double originalSalary) {
        double sum2 = (sum1 + originalSalary);
        return sum2;
    }

    public static double taxDeductionsAmt(double sum2, double Tax) {
        double taxDeductionsAmt = (sum2 * Tax);
        return taxDeductionsAmt;
    }

    public static double medicalAidAmt(double sum2, double MedicalAid) {
        double medicalAidAmt = (sum2 * MedicalAid);
        return medicalAidAmt;
    }

    public static double carAllowanceAmt(double sum2, double CarAllowance) {
        double carAllowanceAmt = (sum2 * CarAllowance);
        return carAllowanceAmt;
    }

    public static double theUIFAmt(double sum2, double UIF) {
        double theUIFAmt = (sum2 * UIF);
        return theUIFAmt;
    }

    public static double salaryDeductions(double taxDeductionsAmt, double medicalAidAmt, double carAllowanceAmt, double theUIFAmt, double sum2) {
        double salaryDeductions = sum2 - (taxDeductionsAmt + medicalAidAmt + carAllowanceAmt + theUIFAmt);
        return salaryDeductions;
    }
}