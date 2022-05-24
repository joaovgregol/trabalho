package Trabalho02;

public class Main {

public static void main(String[] args) {
Cubo cubo = new Cubo(5);
System.out.println("O volume do cubo é: " + cubo.calculaVolume());

Cone cone = new Cone(12,5);
System.out.println("O volume do cone é: " + cone.calculaVolume());

Cilindro cilindro = new Cilindro(10, 2);
System.out.println("O volume do cilindro é: " + cilindro.calcularVolume());

Piramide piramide = new Piramide(24, 6);
System.out.println("O volume do piramide é: " + piramide.calcularVolume());
}

}