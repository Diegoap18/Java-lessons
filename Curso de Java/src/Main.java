import poo.Carro;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
            POO- programação orientada a objetos.
            OOP- Object Oriented programming

            o que é POO: em simples palavras,
            se aproxima o mundo digital no mundo real.
            onde cada objecto tem sua propriedade.

            Classe: é o modelo ou template do objeto.
            Objeto: criado apartir de classes
                Propriedades: são as caracteristicas de um objeto.
                Exemplo: um carro pode ser:
                Cor
                largura
                Altura.

                Metodos:
                Abrir porta
                Acelerar
                Parar
                buzinar

           Classe:
           Objeto: propriedade e metodos

         */

        Scanner entradaUsuario = new Scanner(System.in);


        Carro carro1 = new Carro("Azul","EDX1094");
        //carro.setCor("Azul"); getter and setter
        //carro.setPlaca("EDX1094");getter and setter
        carro1.detalhesCarro("Brasil");
        carro1.acelerar();

        Carro carro2 = new Carro("Vermelho","AFX11B4");
        carro2.detalhesCarro("Espanha");
        carro2.abastecer();

        System.out.println(carro1);
        System.out.println(carro2);
        //System.out.println("" + carro.getCor()+ "\n" + carro.getPlaca()); getter and setter

    }
}