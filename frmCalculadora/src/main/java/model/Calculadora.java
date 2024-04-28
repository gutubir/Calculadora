package model;

public class Calculadora {

    private double valorA;
    private double valorB;

    
    public Calculadora() {
        this(0.0, 0.0);
    }

    
    public Calculadora(double valorA, double valorB) {
        setValorA(valorA);
        setValorB(valorB);
    }

    public double getValorA() {
        return valorA;
    }

    public double getValorB() {
        return valorB;
    }

    public void setValorA(double valorA) {
        this.valorA = valorA;
    }

    public void setValorB(double valorB) {
        this.valorB = valorB;
    }

    //Adição
    public double getSoma() {
        return (getValorA() + getValorB());
    }

    //Subtração
    public double getSubtracao() {
        return (getValorA() - getValorB());
    }

    //Multiplicação
    public double getMultiplicacao() {
        return (getValorA() * getValorB());
    }

    //Divisão
    public double getDivisao() {
        return (getValorA() / getValorB());
    }
}
