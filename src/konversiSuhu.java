import java.util.Scanner;

public class konversiSuhu {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double celcius, hasilKonversi;
        String konversi;
        System.out.print("Masukan suhu (celcius) = ");
        celcius = userInput.nextDouble();
        System.out.print("Konversi ke (Fahrenheit,Kelvin,Reamur) = ");
        konversi = userInput.next();
        hasilKonversi = switch (konversi) {
            case "Fahrenheit" -> celcius * 9/5 + 32;
            case  "Kelvin" -> celcius+ 273.15;
            case  "Reamur" -> celcius * 4/5;
            default -> {
                yield 0.0;
            }
        };
        System.out.println("Hasil Konversi suhu anda adalah =" + hasilKonversi);
    }
}
