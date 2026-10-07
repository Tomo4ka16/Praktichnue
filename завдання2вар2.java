import java.util.Scanner;
public class завдання2вар2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = scanner.hasNextLine()
                ? scanner.nextLine()
                : "Hello! How are you? I am fine. Wait... Really?";

        int kilkistWhile = 0;
        int i = 0;
        while (i < text.length()) {
            boolean isEnd = isSentenceEnd(text.charAt(i));
            boolean nextIsEnd = i + 1 < text.length() && isSentenceEnd(text.charAt(i + 1));

            if (isEnd && !nextIsEnd) {
                kilkistWhile++;
            }
            i++;
        }

        int kilkistDoWhile = 0;
        if (!text.isEmpty()) {
            int j = 0;
            do {
                boolean isEnd = isSentenceEnd(text.charAt(j));
                boolean nextIsEnd = j + 1 < text.length() && isSentenceEnd(text.charAt(j + 1));
                if (isEnd && !nextIsEnd) {
                    kilkistDoWhile++;
                }
                j++;
            } while (j < text.length());
        }

        System.out.println("Sentences (while): " + kilkistWhile);
        System.out.println("Sentences (do-while): " + kilkistDoWhile);
    }

    private static boolean isSentenceEnd(char c) {
        return c == '.' || c == '!' || c == '?';
    }
}