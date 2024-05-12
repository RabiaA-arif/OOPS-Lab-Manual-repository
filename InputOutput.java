package LabManul;
import java.util.Scanner;
public class InputOutput {
    public static void main(String[]args)
    {
//Declare the object and initialize with predefined standard input object
        Scanner sc=new Scanner(System.in);
// String input
        System.out.print("enter your name?");
        String name=sc.nextLine();
        System.out.print("enter your gender?");
        char gender=sc.next().charAt(0);
// Numerical data input    byte, short and float can be read   using similar-named functions.
        System.out.print("enter your age?");
        int age=sc.nextInt();
        System.out.print("enter your mobile number?");
        long mobileNo=sc.nextLong();
        System.out.print("enter your cgpa?");
        double cgpa=sc.nextDouble();
// Print the values to check if the input was correctly obtained.
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
        System.out.println("Mobile Number: "+mobileNo);
        System.out.println("CGPA: "+cgpa);
    }
}

