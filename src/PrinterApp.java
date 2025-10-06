public class PrinterApp {
    public static void main(String[] args) throws Exception {
        String app = "This app is made by : ";
        String creator = "Subhanjan";      // made the code some what clearer by moving the declarations and 
        int number1 = 5;
        int number2 = 2;
        int multiplication = number1 * number2;
        int addition = number1 + number2;
        int subtraction = number1 - number2;
        double division = (double) number1 / number2;   
        System.out.println("Printer App");
        System.out.println(app+creator);
        System.out.println("The value of number1 is " + number1);
        System.out.println(number1 + " * " + number2 + " = " + multiplication);  // adjusted spaces as required from the assignment 
        System.out.println(number1 + " + " + number2 + " = " + addition);     // added addition, divison and subtration
        System.out.println(number1 + " / " + number2 + " = " + division); 
        System.out.println(number1 + " - " + number2 + " = " + subtraction);
    }
}
