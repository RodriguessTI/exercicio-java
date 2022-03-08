package dio.com;

import static dio.com.CalcularEmprestimo.duasParcelas;

public class Main {
    public static void main(String[] args){

        System.out.println("Calculando operacoes matematicas");
        Calculadora.Somar(10,5);
        Calculadora.Subtrair(8,2);
        Calculadora.Multiplicar(5,3);
        Calculadora.Dividir(10,2);

        System.out.println("horarios por turno");
        Horarios.Turno(2);
        Horarios.Turno(23);
        Horarios.Turno(14);
        Horarios.Turno(8);
        Horarios.Turno(30);

        System.out.println("Informacoes de emprestimo");
        CalcularEmprestimo.calculando(1000,duasParcelas());
        CalcularEmprestimo.calculando(1000,duasParcelas());
        CalcularEmprestimo.calculando(1000,5);

    }



}
