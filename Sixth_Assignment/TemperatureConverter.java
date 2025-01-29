import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        
        double celsiusFromFahrenheit = fahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + "° Fahrenheit is " + celsiusFromFahrenheit + "° Celsius.");
        
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        
        double fahrenheitFromCelsius = celsiusToFahrenheit(celsius);
        System.out.println(celsius + "° Celsius is " + fahrenheitFromCelsius + "° Fahrenheit.");
        
        scanner.close();
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
