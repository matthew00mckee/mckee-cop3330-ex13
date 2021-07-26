/*
UCF cop 3330 summer 2021 assignment 1 solution
copyright 2021 Matthew McKee
*/

package Exercise_13;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

import static java.lang.Math.pow;

public class CompoundInterest {
    private double principal;
    private double rate;
    private int years;
    private int numCompounds;
    private double total;

    Scanner Input = new Scanner(System.in);

    public void getPrincipal() {
        System.out.print("What is the principal? ");
        this.principal = Input.nextDouble();
    }

    public void getRate() {
        System.out.print("What is the rate? ");
        this.rate = Input.nextDouble();
    }
    public void getYears() {
        System.out.print("What is the number of years? ");
        this.years = Input.nextInt();
    }
    public void getNumCompounds() {
        System.out.print("What is the number of times the interest is compounded per year? ");
        this.numCompounds = Input.nextInt();
    }
    public void calculateTotal() {

        double convertRate = rate / 100;
        double base = 1 + (convertRate / numCompounds);
        double pow = numCompounds * years;

        this.total = principal * pow(base, pow);
    }
    public void printOutput() {
        String message = setOutput();

        System.out.print(message);
    }
    private String setOutput() {
        DecimalFormat Format = new DecimalFormat("0.00");

        String principalStr = NumberFormat.getCurrencyInstance().format(principal);
        String rateStr = Format.format(rate);
        String yearStr = Integer.toString(years);
        String numCompoundsStr = Integer.toString(numCompounds);
        String totalStr = NumberFormat.getCurrencyInstance().format(total);

        return String.format("%s invested at %s%% for %s years compounded %s times per year is %s.%n ",
                principalStr,
                rateStr,
                yearStr,
                numCompoundsStr,
                totalStr);
    }
}
