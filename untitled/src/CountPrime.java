import java.util.Scanner;

public class CountPrime {
    private static boolean isPrime(int n)
    {
        for(int i = 2 ; i * i <= n ; i++)
            if(n % i == 0)
                return false;
        return true;
    }
    static int countPrimes(int n)
    {
        if(n < 3)
            return 0;
        int count = 1;
        for(int i = 3 ; i < n ; i += 2)
            if(isPrime(i))
                count++;
        return count;
    }
    public static void main(String args[])
    {
        System.out.println("Enter Your Number:");
        Scanner input = new Scanner(System.in);
        Integer n = input.nextInt();
        System.out.println(countPrimes(n));
    }

}
