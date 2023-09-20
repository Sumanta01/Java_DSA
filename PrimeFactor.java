import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeFactor {
    public static List<Integer> findPrimeFactors(int number) {
        List<Integer> primeFactors = new ArrayList<>();

        // Check and divide by 2 repeatedly
        while (number % 2 == 0) {
            primeFactors.add(2);
            number /= 2;
        }

        // Check for prime factors starting from 3
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                primeFactors.add(i);
                number /= i;
            }
        }

        // If the remaining number is greater than 2, it's a prime factor
        if (number > 2) {
            primeFactors.add(number);
        }

        return primeFactors;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> primeFactors = findPrimeFactors(n);
        System.out.println("Prime factors of " + n + " are: " + primeFactors);
    }
}

