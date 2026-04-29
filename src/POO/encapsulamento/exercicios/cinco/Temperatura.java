package POO.encapsulamento.exercicios.cinco;

public class Temperatura {
    private double calcius;

    private double getFahrenheit(double temp){
        double fahrenheit;
        if (temp >= -273.15){
            fahrenheit = (this.calcius * 1.8) + 32;
            return fahrenheit;
        } else{
            System.out.println("Temperatura inválida.");
            return 0;
        }
    }
}
