import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Parte 1: contatenação de variaveis dentro do system.out.println(soutm).
        String nome = "Diego Aparecido Pereira";
        Byte idade = 36;
        String profissao = "Desenvolvedor Java";
        System.out.println("App Parte1: " + "Meu Nome é " + nome + ", eu tenho " + idade + " anos" + " e sou " + profissao);

        //Parte 2 usando o Scanner para capturar a entrada do usuario:

        String nomeUsuario;
        String idadeUsuario; // usando String no lugar de Bytes por conta do nextlines()
        String profissaoUsuario;

        Scanner entradaUsuario = new Scanner(System.in);

        System.out.println("Qual o seu Nome?");
        nomeUsuario = entradaUsuario.nextLine();

        System.out.println("Qual sua idade?");
        idadeUsuario = entradaUsuario.nextLine();

        System.out.println("Qual Sua profissão");
        profissaoUsuario = entradaUsuario.nextLine();

        System.out.println("App Parte2: " + "Meu Nome é " + nomeUsuario + ", eu tenho " + idadeUsuario + " anos" + " e sou " + profissaoUsuario);
    }
    //
}