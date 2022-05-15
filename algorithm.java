import java.util.Scanner;

public class algorithm {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        if (num > 7) {
            System.out.printf("Привет!");
            in.close();
        }
    }
}
