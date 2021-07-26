/*
UCF cop 3330 summer 2021 assignment 1 solution
copyright 2021 Matthew McKee
*/

package Exercise_13;

public class Controller {
    public static void main(String[] args){
        CompoundInterest newInvestment = new CompoundInterest();

        newInvestment.getPrincipal();
        newInvestment.getRate();
        newInvestment.getYears();
        newInvestment.getNumCompounds();

        newInvestment.calculateTotal();

        newInvestment.printOutput();
    }
}
