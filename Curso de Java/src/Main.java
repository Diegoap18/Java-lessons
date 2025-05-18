import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
            Switch: compara os valores no case e devolve o resultado de acordo
            com a escolha do usuario.
            exemplo:
            switch (){
            }
         */

        byte opcoesDoBanco;

        System.out.println("Escolha uma opção: \n " +
                "1- Ver Fatura do Cartão \n " +
                "2- Saldo Conta Corrente \n " +
                "3- Poupança \n " +
                "4- Câmbio \n "
        );

        Scanner entradaUsuario = new Scanner(System.in);
        opcoesDoBanco = entradaUsuario.nextByte();


        switch (opcoesDoBanco) {
            case 1:
                System.out.println("1- Ver Fatura do Cartão ");
                break;
            case 2:
                System.out.println("2- Saldo Conta Corrente ");
                break;
            case 3:
                System.out.println("3- Poupança ");
                break;
            case 4:
                System.out.println("4- Câmbio ");
                break;

            default:
                System.out.println("Nenhuma opção válida selecionada!");
        }
    }
}
