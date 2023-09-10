import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstVallue, secondVallue, result;
        String operation;

        while (true) {

            System.out.print("Введите первое число: ");
            firstVallue = getValidNumber(scanner);

            System.out.print("\nВведите второе число: ");
            secondVallue = getValidNumber(scanner);

            System.out.print("\nВведите оператор (+ | - | * | /) или 's' для завершения программы и 'C' для сброса: ");
            operation = scanner.next();

            if (operation.equalsIgnoreCase("s")) {
                System.out.println("\nПрограмма завершена!");
                break;
            } else if (operation.equalsIgnoreCase("C")) { //На ENG
                System.out.println("\nНачинаем с начала!");
                continue;
            } else if (operation.equalsIgnoreCase("С")) { //На RUS
                System.out.println("\nНачинаем с начала!");
                continue;
            }

            switch (operation) {
                case "+":
                    result = firstVallue + secondVallue;
                    break;
                case "-":
                    result = firstVallue - secondVallue;
                    break;
                case "*":
                    if (secondVallue == 0) {
                        result = 0;
                    } else {
                        result = firstVallue * secondVallue;
                    }
                    break;
                case "/":
                    if (secondVallue == 0) {
                        result = 0;
                    } else {
                        result = firstVallue / secondVallue;
                    }
                    break;
                default:
                    System.out.println("Ошибка: неверный оператор");
                    continue;
            }

            System.out.println("\nРезультат: " + firstVallue + " " + operation + " " + secondVallue + " = " + result);
            System.out.println(" ");
        }

        scanner.close();
    }

    private static double getValidNumber(Scanner scanner) {
        while (true) {
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.print("Ошибка! Введите корректное число: ");
                scanner.next();
            }
        }
    }
}
