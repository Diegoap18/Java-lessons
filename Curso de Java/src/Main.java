import java.lang.reflect.Array;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
            Arrays:
            indices:         0        1         2       3
            items de array {"item1","items2","item3","items4"}
            String[] variavel = {"item1","items2"}
            int[] variavel = {30,20,80,55}
            double[] valores = {10.50, 100.20,80.66}
            boolean[] estados = {false,true,false}
         */

        String[] listaDeCompras = {"banana","carne","ovos"};
        System.out.println(listaDeCompras[1]); //lista por indice 1 item banana.
        System.out.println(Arrays.toString(listaDeCompras)); //lista completa


    }
}