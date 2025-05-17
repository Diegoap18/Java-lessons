//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //variavel mutavel, voce muda o valor varias vezes ou
        //quando quiser durante a execução.
        byte idade = 30;
        idade = 50;
        idade = 120;
        System.out.println(idade);

        //Variavel imutaveis,são variaveis que não pode ser alteradas
        //durante a execução: para isso inclua o final no inicio como abaixo:
        // sempre incluir com letra maiuscula
        // sempre utilize para dados fixos que não seram alterados na aplicação
        final String NOME = "Carlos";
        System.out.println(NOME);
    }
}