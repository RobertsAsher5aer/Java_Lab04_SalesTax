public class Main {

    // Creates a constant; sales tax doesn't change throughout the program
    private static final double TAX_CONSTANT = 0.05;

    public static void main(String[] args) {

        // Creates the price of the item; we haven't learned input yet
        double purchasePrice = 100.00;

        // Computes the sales tax of said item price
        double salesTax = purchasePrice * TAX_CONSTANT;

        // Outputs the sales tax to console
        System.out.println(" ");
        System.out.println("The sales tax for an item with the price of $" + purchasePrice + " is $" + salesTax);




    }
}