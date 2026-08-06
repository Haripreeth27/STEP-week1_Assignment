
import java.util.Scanner;

public class q2 {

    public static void checkTypingAccuracy(String original, String typed) {
        int length = original.length();
        int matched = 0;
        int firstMismatch = -1;

        for (int i = 0; i < length; i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                matched++;
            } else if (firstMismatch == -1) {
                firstMismatch = i;
            }
        }

        double accuracy = (matched * 100.0) / length;

        System.out.printf("Matched: %d/%d | Accuracy: %.2f%% | ", matched, length, accuracy);
        if (firstMismatch == -1) {
            System.out.println("No Mismatches");
        } else {
            System.out.printf("First Mismatch at position %d ('%c' vs '%c')%n",
                    firstMismatch + 1,
                    original.charAt(firstMismatch),
                    typed.charAt(firstMismatch));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter original text: ");
        String original = scanner.nextLine();

        System.out.print("Enter typed text: ");
        String typed = scanner.nextLine();

        checkTypingAccuracy(original, typed);
        scanner.close();
    }
}
