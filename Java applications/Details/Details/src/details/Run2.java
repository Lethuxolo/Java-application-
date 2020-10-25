import java.util.Scanner;
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
public class Run2 {

    public static void main(String[] args) {
        Details tria = new Details();
        Scanner sc = new Scanner(System.in);

        double Tax = 0.18;
        double MedicalAid = 0.125;
        double CarAllowance = 0.08;
        double UIF = 0.02;
//printing the details
        System.out.println("Employee IDNumber: ");
        String stremployeeIDNumber = JOptionPane.showInputDialog(null, "Employee IDNumber: ");
        System.out.println(stremployeeIDNumber);
        System.out.println("Employee Name: ");
        String stremployeeName = JOptionPane.showInputDialog(null, "Employee Name: ");
        System.out.println(stremployeeName);
        System.out.println("Employee Surname: ");
        String stremployeeSurname = JOptionPane.showInputDialog(null, "Employee Surname: ");
        System.out.println(stremployeeSurname);
        System.out.println("Salary to be increased: ");
        String stroriginalSalary = JOptionPane.showInputDialog(null, "Salary to be increased: ");
        double originalSalary = Double.parseDouble(stroriginalSalary);
        System.out.println("R" + originalSalary);

        System.out.println("EMPLOYEE DETAILS REPORT: ");
        System.out.println("Employee IDNumber: ");
        System.out.println(stremployeeIDNumber);
        System.out.println("Employee Name: ");
        System.out.println(stremployeeName);
        System.out.println("Employee Surname: ");
        System.out.println(stremployeeSurname);
        System.out.println("Original Salary: R" + originalSalary);
        System.out.println("Increase amount: R");
        double increaseAmt;
        increaseAmt = sc.nextDouble();
        tria.getIncreaseAmt(increaseAmt);
        increaseAmt = tria.getIncreaseAmt();
        System.out.println(tria.getIncreaseAmt());
        System.out.println("New Salary: R");
        double newSalary = 0;
        increaseAmt = sc.nextDouble();
        tria.getUpdatedSalary(newSalary);
        System.out.println(tria.getIncreaseAmt());
        JOptionPane.showInputDialog(null, "Enter 1 to view employee deductions");

        System.out.println("EMPLOYEE DEDUCTIONS REPORT: ");
        System.out.println(tria.getIncreaseAmt());
        double taxDeductionsAmt = taxDeductionsAmt(newSalary, Tax);
        System.out.println("Tax: R" + taxDeductionsAmt);
        double medicalAidAmt = medicalAidAmt(newSalary, MedicalAid);
        System.out.println("Medical Aid: R" + medicalAidAmt);
        double carAllowanceAmt = carAllowanceAmt(newSalary, CarAllowance);
        System.out.println("Car Allowance: R" + carAllowanceAmt);
        double theUIFAmt = theUIFAmt(newSalary, UIF);
        System.out.println("UIF: R" + theUIFAmt);
        double salaryDeductions = salaryDeductions(taxDeductionsAmt, medicalAidAmt, carAllowanceAmt, theUIFAmt, newSalary);
        System.out.println("Take Home Pay: R" + salaryDeductions);

    }
//Gets and sets methods 
    public double getTax(double Tax) {
        return Tax;
    }

    public double getMedicalAid(double MedicalAid) {
        return MedicalAid;
    }

    public double getCarAllowance(double CarAllowance) {
        return CarAllowance;
    }

    public double getUIF(double UIF) {
        return UIF;
    }

    public static double taxDeductionsAmt(double newSalary, double Tax) {
        double taxDeductionsAmt = (newSalary * Tax);
        return taxDeductionsAmt;
    }

    public static double medicalAidAmt(double newSalary, double MedicalAid) {
        double medicalAidAmt = (newSalary * MedicalAid);
        return medicalAidAmt;
    }

    public static double carAllowanceAmt(double newSalary, double CarAllowance) {
        double carAllowanceAmt = (newSalary * CarAllowance);
        return carAllowanceAmt;
    }

    public static double theUIFAmt(double newSalary, double UIF) {
        double theUIFAmt = (newSalary * UIF);
        return theUIFAmt;
    }

    public static double salaryDeductions(double taxDeductionsAmt, double medicalAidAmt, double carAllowanceAmt, double theUIFAmt, double newSalary) {
        double salaryDeductions = newSalary - (taxDeductionsAmt + medicalAidAmt + carAllowanceAmt + theUIFAmt);
        return salaryDeductions;
    }

}
