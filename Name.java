import java.util.Objects;
import java.util.Scanner;

public class Name {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String num = in.nextLine();
        if (Objects.equals(num, "Вячеслав")) {
            System.out.printf("Привет, Вячеслав!");
        } else {
                System.out.printf("Нет такого имени!" + num);
            in.close();
        }
    }
}