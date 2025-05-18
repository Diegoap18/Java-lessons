package poo;

import poo.interfaces.Veiculo;

public class Carro implements Veiculo {

    @Override
    public void acelerar(String text) {
        System.out.println(text);
    }

    @Override
    public void frear(String text) {
        System.out.println(text);
    }

    @Override
    public void abastecer(String text) {
        System.out.println(text);
    }
}
