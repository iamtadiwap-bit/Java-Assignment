import java.util.Arrays;
import java.util.List;

// ✅ First Question: Filter numbers divisible by 5 using Streams
public class Main {
    public static void main(String[] args) {
        // --- Question2a: Stream Filtering ---
        System.out.println("=== Part 1: Numbers divisible by 5 ===");

        List<Integer> numbers = Arrays.asList(1, 4, 5, 20, 30, 6);

        numbers.stream()
                .filter(n -> n % 5 == 0)
                .forEach(n -> System.out.println("Divisible by 5: " + n));

        // --- Question 2b: Custom Exception Handling ---
        System.out.println("\n=== Part 2: Custom Exception Example ===");

        int score = 120; // Try changing this to a valid score like 85

        try {
            validateScore(score);
            System.out.println("Score accepted: " + score);
        } catch (InvalidScoreException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Method that throws the custom exception
    public static void validateScore(int score) throws InvalidScoreException {
        if (score < 0 || score > 100) {
            throw new InvalidScoreException("Score must be between 0 and 100.");
        }
    }
}

// ✅ Custom Exception Class
class InvalidScoreException extends Exception {
    public InvalidScoreException(String message) {
        super(message);
    }
}
