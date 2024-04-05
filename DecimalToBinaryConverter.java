import java.util.Scanner;

public class DecimalToBinaryConverter {
    
    // Method to convert integer part of decimal number to binary
    public static void decToBinary(int num) {
        int binaryNum[] = new int[100];
        int i = 0;
        
        // Convert decimal to binary
        while (num > 0) {
            binaryNum[i] = num % 2;
            num = num / 2;
            i++;
        }
        
        // Print binary representation
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binaryNum[j]);
        }
    }
    
    // Method to convert fractional part of decimal number to binary
    public static void fractionPartToBinary(double fraction, int noOfDecimalPlaces) {
        System.out.print(".");
        for (int i = 0; i < noOfDecimalPlaces; i++) {
            fraction *= 2;
            int bit = (int) fraction;
            System.out.print(bit);
            fraction -= bit;
        }
    }

    public static void main(String[] args) {
        System.out.println("\nDecimal to Binary Converter!!\n");
        double num;
        int noOfDecimalPlaces;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the decimal number: ");
        num = in.nextDouble();
        System.out.print("Enter the number of decimal places for fractional part: ");
        noOfDecimalPlaces = in.nextInt();

        int integerPart = (int) num;
        double fractionalPart = num - integerPart;
        
        // Convert and print binary equivalent
        System.out.print("Binary equivalent = ");
        decToBinary(integerPart);
        fractionPartToBinary(fractionalPart, noOfDecimalPlaces);
        
        in.close();
    }
}

