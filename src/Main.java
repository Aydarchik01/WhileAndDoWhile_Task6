import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        while (a1 <= a2) {
            if (a1%2==1){
                System.out.print(a1);
            }
            a1++;
        }
    }
}