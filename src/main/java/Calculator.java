
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public Calculator() {
    }
    // https://my-deployment-ca5d14.kb.us-central1.gcp.cloud.es.io:9243/app/home#/
    public static double squareroot(double x){
        if(x<0){
            return -1;
        }
                    logger.info("[SQUARE ROOT] - " + x);
                    double result = Math.sqrt(x);
                    logger.info("[RESULT - SQUARE ROOT] - " + result);
                    return result;           
    }
    public static long factorial(int x){
        if(x<0){
            return -1;
        }
                    logger.info("[FACTORIAL] - " + x);
                    long fact = 1;
                    for (int i = 1; i <= x; i++) {
                        fact *= i;
                    }
                    logger.info("[RESULT - FACTORIAL] - " + fact);
                    return fact;
    }
    public static double log(double x){
        if(x<0){
            return -1;
        }
        logger.info("[LOG] - " + x);
        double anslog = Math.log(x);
        logger.info("[RESULT - LOG] - " + anslog);
        return anslog;
    }
    public static double twopower(double num,double expo){
        logger.info("[TWOPOWER] - " + num + "AND" + expo);
        double power = Math.pow(num, expo);
        logger.info("[RESULT - TWOPOWER] - " + power);
        return power;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the calculator program!");

        while (true) {
            System.out.println("\nPlease select an operation :");
            System.out.println("1. Square root function");
            System.out.println("2. Factorial function");
            System.out.println("3. Natural logarithm (base e)");
            System.out.println("4. Power function");
            System.out.println("5. Quit");

            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                System.out.print("Enter a number to find its square root: ");
                double x = input.nextDouble();
                double result=squareroot(x);
                System.out.printf("The square root of %.2f is %.2f%n", x, result);
                break;

                case 2:
                    System.out.print("Enter a non-negative integer to find its factorial: ");
                    int n = input.nextInt();
                    long fact=factorial(n);
                    System.out.printf("The factorial of %d is %d%n", n, fact);
                    break;

                case 3:
                    System.out.print("Enter a positive number to find its natural logarithm: ");
                    double num = input.nextDouble();
                    double ans=log(num);
                    System.out.printf("The natural logarithm of %.2f is %.2f%n", num, ans);
                    break;

                case 4:
                    System.out.print("Enter a number and its exponent to find its power: ");
                    double base = input.nextDouble();
                    double exponent = input.nextDouble();
                    double anspower=twopower(base,exponent);
                    System.out.printf("%.2f raised to the power of %.2f is %.2f%n", base, exponent, anspower);
                    break;

                case 5:
                    System.out.println("Thank you for using the calculator program!");
                    input.close();
                    return;

                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        }
}
}