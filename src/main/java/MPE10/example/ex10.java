package MPE10.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Derek Gilberti
 */

//class begin
public class ex10 {
    //main method begin
    public static void main(String[] args) {
        //scanner
        Scanner in = new Scanner(System.in);

        //input
        System.out.print("Enter the price of item 1: ");
        String onepri = in.nextLine();
        System.out.print("Enter the quantity of item 1: ");
        String onequa = in.nextLine();
        System.out.print("Enter the price of item 2: ");
        String twopri = in.nextLine();
        System.out.print("Enter the quantity of item 2: ");
        String twoqua = in.nextLine();
        System.out.print("Enter the price of item 3: ");
        String threepri = in.nextLine();
        System.out.print("Enter the quantity of item 3: ");
        String threequa = in.nextLine();

        //String conversion
        int oneqan =Integer.parseInt(onequa);
        double oneprc = Double.parseDouble(onepri);
        int twoqan =Integer.parseInt(twoqua);
        double twoprc = Double.parseDouble(twopri);
        int threeqan =Integer.parseInt(threequa);
        double threeprc = Double.parseDouble(threepri);

        //math
        double onetot = oneqan * oneprc;
        double twotot = twoqan * twoprc;
        double threetot = threeqan * threeprc;
        double subtotal = onetot + twotot + threetot;
        double tax = subtotal * .055;
        double total = tax + subtotal;

        //output
        System.out.println("Subtotal: $"+String.format("%.2f", subtotal));
        System.out.println("Tax: $"+String.format("%.2f", tax));
        System.out.println("Total: $"+String.format("%.2f", total));
    }
    //main method end
}
//class end
