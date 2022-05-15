import java.util.Scanner;


public class Massive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Введите числа массива:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        for (int i = 0; i < size; i++) {
            if (array[i] % 3 != 0) {
                System.out.print("Чисел кратных 3 нет!" + array[i]);
            } else {
                System.out.print("Числа кратные 3" + array[i]);
            }
        }
    }
}