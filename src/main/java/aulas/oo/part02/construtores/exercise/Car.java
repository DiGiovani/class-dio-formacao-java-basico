package aulas.oo.part02.construtores.exercise;

public class Car {
    private String Marca;
    private String Modelo;
    private Integer Ano;
    private String Variante;


    public Car(String marca, String modelo, Integer ano, String variante ) {
        this.Marca = marca;
        this.Modelo = modelo;
        this.Ano = ano;
        this.Variante = variante;
    }

    public String specs() {
        return "Meu carro é o " + Modelo + " " + Variante + " da marca " + Marca + " do ano de " + Ano;
    }

}
