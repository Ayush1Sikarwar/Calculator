import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Addition: " + add(a, b));
    }

    public static int add(int x, int y) {
        return x + y;
    }

}