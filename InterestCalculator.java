package interestcalculator;
import java.util.Scanner;
public class InterestCalculator {

    public static void main(String[] args) {

        double x; // investment
        double y; // interest
        double z; // time
        double w; // initial investment after x is overwritten
        double t; // time after  is overwritten
        double netGain; // profit from the investment

        System.out.println("Enter the amount of investment:");
        Scanner investment = new Scanner(System.in);
        x = investment.nextDouble();
        w = x;

        System.out.println("Enter the interest rate:");
        Scanner interest = new Scanner(System.in);
        y = interest.nextDouble();

        System.out.println("Enter the time:");
        Scanner time = new Scanner(System.in);
        z = time.nextDouble();
        t = z;

        while (z > 0) {
            x = x + x * y;
            z = z - 1;
        }


        netGain = x - w;

        System.out.println("Your initial investment was " + w);
        System.out.println("The total amount of profit that gained by investing is " + netGain);
        System.out.println("Your total balance after " + t + " year(s) of saving is " + x);


    }
}
