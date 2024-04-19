import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics sum = new Statistics();
        Statistics sumEven = new Statistics();
        Statistics sumOdd = new Statistics();

        System.out.println("Enter numbers:");
       
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1) {
                scanner.close();
                System.out.println("Sum: " + sum.sum());
                System.out.println("Sum of even numbers: " + sumEven.sum());
                System.out.println("Sum of odd numbers: " + sumOdd.sum());
                break;
            }
            
            sum.addNumber(input);

            if (input % 2 == 0) {
                sumEven.addNumber(input);
            } else {
                sumOdd.addNumber(input);
            }
        }
    }
}