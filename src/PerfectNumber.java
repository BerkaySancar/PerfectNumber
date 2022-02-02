import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        /*
        ------- What is the Perfect Number ? -------
        In number theory, a perfect number is a positive integer that is equal to the sum of its positive divisors,
        excluding the number itself. For instance, 6 has divisors 1, 2 and 3 (excluding itself),
         and 1 + 2 + 3 = 6, so 6 is a perfect number.
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int perfectNum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                perfectNum += i;
            }
        } if (perfectNum == number){
            System.out.print(number + " is a perfect number.");
        } else {
            System.out.print(number + " is not a perfect number.");
        }
    }
}
