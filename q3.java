import java.util.Scanner;

public class q3 {

    void findLongestStreak(String signalLog) {
        if (signalLog == null || signalLog.isEmpty()) {
            System.out.println("Longest Streak: '' repeated 0 times");
            return;
        }

        char currentChar = signalLog.charAt(0);
        int currentLength = 1;
        char bestChar = currentChar;
        int bestLength = 1;

        for (int i = 1; i < signalLog.length(); i++) {
            char ch = signalLog.charAt(i);
            if (ch == currentChar) {
                currentLength++;
            } else {
                if (currentLength > bestLength) {
                    bestLength = currentLength;
                    bestChar = currentChar;
                }
                currentChar = ch;
                currentLength = 1;
            }
        }

        if (currentLength > bestLength) {
            bestLength = currentLength;
            bestChar = currentChar;
        }

        System.out.println("Longest Streak: '" + bestChar + "' repeated " + bestLength + " times");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the signal log: ");
        String signalLog = scanner.nextLine();
        new q3().findLongestStreak(signalLog);
        scanner.close();
    }
}
