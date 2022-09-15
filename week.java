import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num == 1) {
            System.out.println("Понеділок");
        } 
        else if(num == 2) {
            System.out.println("Вівторок");
        }
        else if(num == 3) {
            System.out.println("Середа");
        }
        else if(num == 4) {
            System.out.println("Четвер");
        }
        else if(num == 5) {
            System.out.println("П'ятниця");
        }
        else if(num == 6 || num == 7) {
            System.out.println("Вихідний");
        }
    }
}