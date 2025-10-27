import java.util.Scanner;
public class projeto2 {
    public static void main(String[] args) {
        Scanner scanner = new
                Scanner(System.in);
        //entrada da temperatura em celcius
        System.out.print("Digite a temperatura em graus Celcius:");
        double celsius = scanner.nextDouble();

        //Conversão para fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        //Conversão para kelvin
        double Kelvin = celsius + 273.15;

        //imprimir resultados
        System.out.println("\nResultados:");
        System.out.printf("%.2fºC é igual a %.2fºf\n" ,celsius,fahrenheit);
        System.out.printf("%.2fºC é igual a %.2fk\n" ,celsius,Kelvin);

    }
}
