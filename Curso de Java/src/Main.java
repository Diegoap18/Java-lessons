import poo.Carro;
import poo.Moto;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
         Modificadores de acesso:
         1 - Public  - consigo acessar de qualquer classe para qualquer classe.
         2 - Private - so pode acessar dentro da classe.
         3 - Protected - So pode acessar dentro da propria classe, ou a subclasse.
         */

        Scanner entradaUsuario = new Scanner(System.in);
        Carro carro = new Carro();
        carro.acelerar("o Carro esta em movimento!");
        carro.frear("o Carro esta reduzindo a velodicade");
        carro.abastecer("O carro esta abastecendo gasolina");

        System.out.println(carro);
        System.out.println();
    }
}