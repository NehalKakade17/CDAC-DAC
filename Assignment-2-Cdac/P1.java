public class GradeClassifier {
    public static void main(String[] args) {
        // Example score; you can change this value to test different scores
        int score = 85;

        // Classify the grade based on the score
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}