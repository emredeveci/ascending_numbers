import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int firstNumber, secondNumber, thirdNumber;

        Scanner scanner = new Scanner(System.in);

        //receiving input from the user
        System.out.println("Please enter the first number: ");
        firstNumber = scanner.nextInt();

        System.out.println("Please enter the second number: ");
        secondNumber = scanner.nextInt();

        System.out.println("Please enter the third number: ");
        thirdNumber = scanner.nextInt();

        //if statements to determine the ascending order of numbers
        if((firstNumber < secondNumber) && (firstNumber < thirdNumber)) {
            if (secondNumber < thirdNumber) {
                System.out.println("firstNumber < secondNumber < thirdNumber");
            } else {
                System.out.println("firstNumber < thirdNumber < secondNumber");
            }
        } else if ((secondNumber < firstNumber) && (secondNumber < thirdNumber)) {
            if (firstNumber < thirdNumber) {
                System.out.println("secondNumber < firstNumber < thirdNumber");
            } else {
                System.out.println("secondNumber < thirdNumber < firstNumber");
            }
        } else if ((thirdNumber < firstNumber) && (thirdNumber < secondNumber)) {
            if (firstNumber < secondNumber) {
                System.out.println("thirdNumber < firstNumber < secondNumber");
            } else {
                System.out.println("thirdNumber < secondNumber < firstNumber");
            }
        }
    }
}