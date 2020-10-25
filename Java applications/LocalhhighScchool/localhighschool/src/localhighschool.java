import java.util.Random;
import javax.swing.JOptionPane;
/*df
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author LETHUXOLO 
 */
public class localhighschool {
    public static void main(String[] args) {
        
//DECLARING THE VARIABLES        
        int randint = 0;
        
//PROMPTING THE USER        
        String strfirstStudent = JOptionPane.showInputDialog(null, "Enter first student's name: ");
        String strsecondStudent = JOptionPane.showInputDialog(null, "Enter second student's name: ");
        String strthirdStudent = JOptionPane.showInputDialog(null, "Enter third student's name: ");

//RANDOMISING THE COLOURS        
	String house [] = {"BLUE","WHITE","RED"};
	Random Colour = new Random();
	String colour1 = house[new Random().nextInt(house.length)];
	String colour2 = house[new Random().nextInt(house.length)];
	String colour3 = house[new Random().nextInt(house.length)];
        
//RANDOMISING THE NUMBERS        
        Random Number = new Random();
        int num1 = Number.nextInt(900);
        int num2 = Number.nextInt(900);
        int num3 = Number.nextInt(900);
        int i;
        
//SHOWING THE INPUTTED VARIABLES BY USER
        JOptionPane.showMessageDialog(null, "\nSCHOOL HOUSE ASSIGNMENT: " 
                                          + "\n**********************************"
                                          + "\n" + strfirstStudent + " assigned to the " + colour1 + " team with the student number " + colour1 + num1 
                                          + "\n" + strsecondStudent + " assigned to the " + colour2 + " team with the student number " + colour2 + num2 
                                          + "\n" + strthirdStudent + " assigned to the " + colour3 + " team with the student number " + colour3 + num3);
    }       
}