//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*
            Operadores Logicos (|| e &&) 
                                ou   and
         */

        int numero1 = 10;
        int numero2 = 20;
        int numero3 = 30;
        int numero4 = 40;

        if (numero1 == numero2 || numero3 < numero4) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }

        if (numero1 == numero2 || numero3 == numero4) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }

        if (numero1 == numero2 && numero3 == numero4) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }

        if (numero1 < numero2 && numero3 == numero4) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }


    }
}