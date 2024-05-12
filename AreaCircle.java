package LabManul;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class AreaCircle {
    public static void main(String[]args){
        String input;
        int radius;
        int area;
        input = JOptionPane.showInputDialog("Enter Radius");
        radius= Integer.parseInt(input);
        area=2 *3 *radius *radius;
//        System.out.println(area);
        JOptionPane.showMessageDialog(null,"Area of circle of circumstances is "+ area);
    }
}
