import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); // -5
        int b = scanner.nextInt(); // 12

        double sum = 0;
        int count = 0;
        for(int i = a; i <= b; i++) {
            if(i % 3 == 0) {
                count += 1;
                sum += i;
            }
        }
        System.out.print(sum/count);
    }
}
