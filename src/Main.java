import java.util.Scanner; //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество членов семьи 1: ");

        while (!scanner.hasNextInt()) {
            System.out.println("Ой-ой! Кажется, вы ввели не число.");
            scanner.next();
            System.out.print("Попробуйте снова: ");
        }



        int family1 = scanner.nextInt();

        System.out.print("Введите количество членов семьи 2: ");

        while (!scanner.hasNextInt()) {
            System.out.println("Ой-ой! Кажется, вы ввели не число.");
            scanner.next();
            System.out.print("Попробуйте снова: ");
        }

        int family2 = scanner.nextInt();

        System.out.print("Введите количество членов семьи 3: ");

        while (!scanner.hasNextInt()) {
            System.out.println("Ой-ой! Кажется, вы ввели не число.");
            scanner.next();
            System.out.print("Попробуйте снова: ");
        }

        int family3 = scanner.nextInt();

        System.out.println("Отлично! Общее количество членов всех семей: " + (family1 + family2 + family3));

    }

}