public class App {
    public static void main(String[] args) {
        DecimalToBinary decimalToBinary = new DecimalToBinary();
        int decimalNumber = 12345;
        System.out.print("The binary of " + decimalNumber + " is :");
        decimalToBinary.convertBinary(decimalNumber);
    }
}
