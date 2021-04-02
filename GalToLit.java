package galtolit;

import java.util.Scanner;
public class GalToLit {

    public static void main(String[] args) {
        int gallons = 0 ;
        double liters;

        Scanner scan = new Scanner(System.in);
        System.out.println("Inputkan berapa Gallon yang ingin di convert ke liters : ");
        gallons = scan.nextInt();


        liters = gallons *3.785;



        System.out.println(gallons + " gallons adalah " + liters + " liters.");
    }
    
}
