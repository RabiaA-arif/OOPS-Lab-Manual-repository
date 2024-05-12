package LabManul;

import java.util.Scanner;

public class AgeRollNo {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("give your age");
        int age=input.nextInt();
        System.out.println("give your roll number");
        String rollno= input.next();
        System.out.println("you are age is : " + age);
        System.out.println(" you are  roll number is :" + rollno);

    }
}
