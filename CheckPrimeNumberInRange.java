public class CheckPrimeNumberInRange {
    public static void main(String[] args) {
        int total = 20;
        for (int num = 1; num <= total; num++) {
            int count = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0)
                    count++;
            }
            if (count == 2)
                System.out.println(num + " ----> is Prime Number");
            else
                System.out.println(num + " ----> is not Prime Number");
        }
    }
}