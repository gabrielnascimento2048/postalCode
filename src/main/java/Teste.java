public class Teste {
    private static int[] fibonacci(int number) {
        int fibo[] = new int[number+1];

        fibo[0] = 5;
        fibo[1] = 10;
        fibo[2] = 15;
        fibo[3] = 25;

        for (int i = 2; i <= number; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2];
        }

        return fibo;
    }

    public static void main(String[] args) {
        System.out.println("Return value:");
        for (int num : fibonacci(5))
            System.out.print(num + " ");
    }
}