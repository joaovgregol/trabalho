package Trabalho02;

public class Piramide {
double lado;
double altura;
double volume;

double calcularVolume(double altura, double lado) {
volume = altura * (lado * lado) / 3;
return volume;
}
public Piramide(double altura, double lado) {
this.altura = altura;
this.lado = lado;
}
}