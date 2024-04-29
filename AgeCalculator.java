import java.util.Scanner;

class AgeCalculator {
    public static void main(String[] args) {
        int birthMonth, birthYear;
        Scanner in = new Scanner(System.in);
        
        //Taking user input!
        System.out.print("Enter the birth month: ");
        birthMonth = in.nextInt();
        System.out.print("Enter the birth year: ");
        birthYear = in.nextInt();

        // Get the current month and year!
        java.time.LocalDate currentDate = java.time.LocalDate.now();
        int currentMonth = currentDate.getMonthValue();
        int currentYear = currentDate.getYear();

        //Age calculation!
        int ageYears = currentYear - birthYear;
        int ageMonths = currentMonth - birthMonth;

        // Adjust age if current month is earlier than birth month!
        if (ageMonths < 0) {
            ageYears--;
            ageMonths = 12 + ageMonths;
        }

        System.out.println("You are " + ageYears + " years and " + ageMonths + " months old.");
        in.close();
    }
}
