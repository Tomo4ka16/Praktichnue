import java.util.Scanner;
public class Завдання1вар3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First date (day.month.year): ");
        String pershaData = scanner.hasNextLine() ? scanner.nextLine().trim() : "15.03.2024";

        System.out.print("Second date (day.month.year): ");
        String drugaData = scanner.hasNextLine() ? scanner.nextLine().trim() : "20.07.2023";

        String[] first = pershaData.split("\\.");
        String[] second = drugaData.split("\\.");

        int day1 = Integer.parseInt(first[0]);
        int month1 = Integer.parseInt(first[1]);
        int year1 = Integer.parseInt(first[2]);

        int day2 = Integer.parseInt(second[0]);
        int month2 = Integer.parseInt(second[1]);
        int year2 = Integer.parseInt(second[2]);

        int result;

        if (year1 != year2) {
            result = year1 < year2 ? -1 : 1;
        } else if (month1 != month2) {
            result = month1 < month2 ? -1 : 1;
        } else if (day1 != day2) {
            result = day1 < day2 ? -1 : 1;
        } else {
            result = 0;
        }

        if (result == -1) {
            System.out.println("Earlier: " + pershaData + ", later: " + drugaData);
        } else if (result == 1) {
            System.out.println("Earlier: " + drugaData + ", later: " + pershaData);
        } else {
            System.out.println("The dates are the same");
        }
    }
}