import java.util.Scanner;
public class завдання3вар2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter mezha: ");
        int mezha = scanner.hasNextLine() ? Integer.parseInt(scanner.nextLine().trim()) : 30;

        System.out.println("Prime numbers from 1 to " + mezha + ":");

        for (int number = 2; number <= mezha; number++) {
            boolean prostе = true;

            for (int dilnyk = 2; dilnyk * dilnyk <= number; dilnyk++) {
                if (number % dilnyk == 0) {
                    prostе = false;
                    break;
                }
            }

            if (prostе) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }
}