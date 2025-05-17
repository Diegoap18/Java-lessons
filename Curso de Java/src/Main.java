//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /* Operadores Aritmeticos
            + soma
            - subtração
            * multiplicação
            / divisão
            % resto da divisão
         */

        int numero1 = 50;
        int numero2 = 20;
        int ValorSomaTotal = numero1 + numero2;
        int ValorSubtracaoTotal = numero1 - numero2;
        int ValorMultiplicacaoTotal = numero1 * numero2;
        int ValorDivisaoTotal = numero1 / numero2;
        int ValorRestoDivisaoTotal = numero1 % numero2;

        System.out.println("Soma: -> " + "Valor1: " + numero1 + " -> valor2: " + numero2 + " -> valorTotal: " + ValorSomaTotal);
        System.out.println("Subtração: -> " + "Valor1: " + numero1 + " -> valor2: " + numero2 + " -> valorTotal: " + ValorSubtracaoTotal);
        System.out.println("Multiplicação: -> " + "Valor1: " + numero1 + " -> valor2: " + numero2 + " -> valorTotal: " + ValorMultiplicacaoTotal);
        System.out.println("Divisão: -> " + "Valor1: " + numero1 + " -> valor2: " + numero2 + " -> valorTotal: " + ValorDivisaoTotal);
        System.out.println("Resto Divisão: -> " + "Valor1: " + numero1 + " -> valor2: " + numero2 + " -> valorTotal: " + ValorRestoDivisaoTotal);
    }
}
