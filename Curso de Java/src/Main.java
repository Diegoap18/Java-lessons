import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
         Condição IF e ELSE:
         exemplo:
         if(condição){ true
            Codigo a ser Executado se for
            verdadeiro.
         }else{ false
            Codigo a ser executado se for
            falso
         }

         */

        int numero1 = 10;
        int numero2 = 20;

        if (numero1 < numero2) { // true
            System.out.println("Verdadeiro");
        } else { // false
            System.out.println("Falso");
        }

        byte idade;
        Scanner entradaUsuario = new Scanner(System.in);
        System.out.println("Qual a sua idade?");
        idade = entradaUsuario.nextByte();

        if (idade <= 10) {
            System.out.println("Criança");
        } else if (idade <= 17) {
            System.out.println("Adolescente");
        } else if (idade > 17) {
            System.out.println("Adulto");
        }
    }
}