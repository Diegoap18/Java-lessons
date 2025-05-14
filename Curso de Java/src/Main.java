//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
            byte:  -128 a 127 (1 byte de informação ou 8 bit)
            Exemplo byte = idade.

            short: -32768 a 32767 (2 bytes de informação ou 16 bits)
            exemplo short = estoque.

            int:   - 2147483648 - 214748647 (2 Bilhões) (4 bytes de informação ou 32 bits)
            exemplo int = numero.

            long:  - 9223372036854775808 a 9223372036854775807 (8 bytes de inforamção ou 64 bits)
            exemplo long = contaCorrente.
        Números decimais

            float:  7  casas decimais - 1234567 (4 bytes de informação ou 32 bits)
            exemplo float = real.
            double: 15 casas decimais - 123456789123456 (8 bytes de informação ou 64 bits)
            exemplo float = dollar.

            String: vai receber textos == palavras e frases
            exemplo String = nome.
            char: Suporta apenas um único caracter
            exemplo char = minhaLetra.

            outro tipo é atraves do VAR:
            exemplo:

            var nomeDaVariavel = "nome" ele seleciona o tipo de acordo com o valor atribuido

            tambem tem a variavel tipo Boolean.
            exemplo boolean = true or false

        */

        //Primitivos:
        /* byte idade = 120;
        short estoque = 32767;
        int numero = 2147483647;
        long contaCorrente = 3223372036854775807L;
        float real = 10.1234567f;
        double dollar = 10.123456789123456;
        char minhaLetra = 'A';
        boolean botaoAtivado = true;
        boolean botaoDesativado = false;
        String nome = "Araujo Costa";
        var meuSobreNome = "Pereira";

        System.out.println("tipo byte: " + idade);
        System.out.println("tipo short: " + estoque);
        System.out.println("tipo int: " + numero);
        System.out.println("tipo long: " + contaCorrente);
        System.out.println("tipo float: " + real);
        System.out.println("tipo Double: " + dollar);
        System.out.println("tipo String: " + nome);
        System.out.println("tipo char: " + minhaLetra);

        System.out.println("tipo Var: " + meuSobreNome);
        System.out.println("tipo boolean True: " + botaoAtivado);
        System.out.println("tipo boolean False: " + botaoDesativado); */

        //Classes Wrappers - objetos e methodos
        Byte idade = 120;
        Short estoque = 32767;
        Integer numero = 2147483647;
        Long contaCorrente = 3223372036854775807L;
        Float real = 10.1234567f;
        Double dollar = 10.123456789123456;
        Character minhaLetra = 'A';
        Boolean botaoAtivado = true;
        Boolean botaoDesativado = false;
        String nome = "Araujo Costa";
        var meuSobreNome = "Pereira";
        System.out.println();






    }
}