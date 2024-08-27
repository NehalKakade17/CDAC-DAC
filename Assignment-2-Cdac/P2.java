public class DayClassifier {
    public static void main(String[] args) {
        // Example input; change this value to test different inputs
        int dayNumber = 3;

        // Outer switch to determine the day of the week
        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                // Inner switch to classify as weekday or weekend
                switch (dayNumber) {
                    case 1:
                        System.out.println("It is a weekday.");
                        break;
                }
                break;
            case 2:
                System.out.println("Tuesday");
                // Inner switch to classify as weekday or weekend
                switch (dayNumber) {
                    case 2:
                        System.out.println("It is a weekday.");
                        break;
                }
                break;
            case 3:
                System.out.println("Wednesday");
                // Inner switch to classify as weekday or weekend
                switch (dayNumber) {
                    case 3:
                        System.out.println("It is a weekday.");
                        break;
                }
                break;
            case 4:
                System.out.println("Thursday");
                // Inner switch to classify as weekday or weekend
                switch (dayNumber) {
                    case 4:
                        System.out.println("It is a weekday.");
                        break;
                }
                break;
            case 5:
                System.out.println("Friday");
                // Inner switch to classify as weekday or weekend
                switch (dayNumber) {
                    case 5:
                        System.out.println("It is a weekday.");
                        break;
                }
                break;
            case 6:
                System.out.println("Saturday");
                // Inner switch to classify as weekday or weekend
                switch (dayNumber) {
                    case 6:
                        System.out.println("It is a weekend.");
                        break;
                }
                break;
            case 7:
                System.out.println("Sunday");
                // Inner switch to classify as weekday or weekend
                switch (dayNumber) {
                    case 7:
                        System.out.println("It is a weekend.");
                        break;
                }
                break;
            default:
                System.out.println("Invalid day number. Please enter a number between 1 and 7.");
                break;
        }
    }
}