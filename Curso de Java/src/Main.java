import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
            Estrutura de repetição
            1- While: enquanto:
            example:
            while(condição){
             codigo para execução.
            }

         */

        //while com array:
        int contador = 0;

        while (contador <= 10) {//true
            contador++;
            System.out.println(contador);
        }

        //while com array:
        int indice = 0;
        String[] listaDeCompras = {"banana","carne","ovos","arroz"};

        while (listaDeCompras.length <= 4) {//true
            System.out.println(listaDeCompras[indice]);
            indice++;
        }

    }
}