import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть своє ім'я: ");
        String name = scanner.nextLine();
        while (true) {
            System.out.println("Виберіть пункт:");
            System.out.println("1.Додавання");
            System.out.println("2.Віднімання");
            System.out.println("3.Множення");
            System.out.println("4.Ділення");
            System.out.println("5.Відсотки");
            int person = scanner.nextInt();
            int result; 
            if (person == 1){
                System.out.println("Введіть перше число: ");
                int a = scanner.nextInt();
                System.out.println("Введіть друге число: ");
                int b = scanner.nextInt();
                System.out.println("a: " + a);
                System.out.println("b: " + b);
                result = a + b; 
                System.out.println("Відповідь: " + result);
            }
            else if (person == 2){
                System.out.println("Введіть перше число:: ");
                int a = scanner.nextInt();
                System.out.println("Введіть друге число: ");
                int b = scanner.nextInt();
                System.out.println("a: " + a);
                System.out.println("b: " + b);
                result = a - b; 
                System.out.println("Відповідь : " + result);
            }
            else if (person == 3){
                System.out.println("Введіть перше число: ");
                int a = scanner.nextInt();
                System.out.println("Введіть друге число: ");
                int b = scanner.nextInt();
                System.out.println("a: " + a);
                System.out.println("b: " + b);
                result = a * b; 
                System.out.println("Відповідь: " + result);
            }
            else if (person == 4){
                System.out.println("Введіть перше число: ");
                float a = scanner.nextFloat();
                System.out.println("Введіть друге число: ");
                float b = scanner.nextFloat();
                System.out.println("a: " + a);
                System.out.println("b: " + b);
                float c = a / b; 
                System.out.println("Відповідь: " + c);
            }
            else if (person == 5){
                System.out.println("Введіть число: ");
                float a = scanner.nextFloat();
                System.out.println("Введіть відсоток від числа " + a);
                float b = scanner.nextFloat();
                System.out.println("a: " + a);
                System.out.println("b: " + b + "%");
                float c = (a / 100) * b; 
                System.out.println("Відповідь: " + c);
            }
        }
    }
}
