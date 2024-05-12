package LabManul;
import java.util.Scanner;
public class Armstrongnumber {
    public static void main(String[]args){
        int number=0,sum=0,rem=0,cube=0,temp=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number: ");
        number=scan.nextInt();
        System.out.println("The number entered is:"+" "+number);
        temp=number;

        while(number!=0)
        {
            rem=number%10;
            cube=(int)Math.pow(rem,3);
            sum=sum+cube;
            number=number/10;
        }
        if(sum==temp)
            System.out.println(temp+" "+"is an armstrong number");
        else
            System.out.println(temp+" "+"is not armstrong number");

    }
}



