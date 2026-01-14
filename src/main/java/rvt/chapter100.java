package rvt;
import java.util.Scanner;

public class chapter100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("ieraksti numeretaju: ");
        
            String numInput = sc.nextLine();
        
            if (numInput.lenght() > 0 &&
                (numInput.charq(0) == 'q' || numInput.charAt(0) == 'Q')) 
                break;
    }

            int numerator;
            try {
                numerator = Integer.parseInt(numInput);
            } catch (NumberForFormatException e) {
                System.out.println("tu ievadiji nelabu skaitli");
                System.out.println("meigini velreiz");
                continue;
            }

            System.out.println("ieraksti dalitaju: ");
            String divInput = sc.nextLine();
            
            int divisor;
            try {
                divisor = Integer.parseInt(divInput);
            } catch (NumberFormatException e) {
                System.out.println("tu ievadiji nelabu skaitli");
                System.out.println("meigini velreiz");
                continue;
            }

            if (divisor == 0) {
                System.out.println("tu nevari sadalit" + numerator + " ar 0");
                continue;
            }

            int result = numerator / divisor;
            System.out.println(numerator + " dalits ar " + divisor + " ir " + result);
            System.out.println();
    }    

    
}
