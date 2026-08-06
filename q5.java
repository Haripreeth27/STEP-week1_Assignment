import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a movie review:");
        String review = scanner.nextLine();
        classifyWordLengths(review);
        scanner.close();
    }

    public static void classifyWordLengths(String review) {
        int shortCount = 0;
        int mediumCount = 0;
        int longCount = 0;

        String[] words = review.trim().isEmpty() ? new String[0] : review.trim().split("\\s+");

        for (String word : words) {
            int length = word.replaceAll("[^A-Za-z]", "").length();
            if (length >= 1 && length <= 4) {
                shortCount++;
            } else if (length >= 5 && length <= 8) {
                mediumCount++;
            } else if (length >= 9) {
                longCount++;
            }
        }

        System.out.println("Short: " + shortCount + " | Medium: " + mediumCount + " | Long: " + longCount);
    }
}