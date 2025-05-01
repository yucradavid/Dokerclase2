package service;

public class ConversorTemperatura {

    public  String convertir(String entrada) {
        if (entrada == null || !entrada.matches("^-?\\d+(\\.\\d+)?°[CFcf]$")) {
            return "Error: formato inválido. Usa el formato '30°C' o '86°F'.";
        }

        double valor = Double.parseDouble(entrada.substring(0, entrada.length() - 2));
        char unidad = Character.toUpperCase(entrada.charAt(entrada.length() - 1));

        if (unidad == 'C') {
            return String.format("%.2f°F", celsiusAFahrenheit(valor));
        } else {
            return String.format("%.2f°C", fahrenheitACelsius(valor));
        }
    }

    private  double celsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    private  double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
