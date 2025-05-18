package poo.heranca;

public class Veiculo {

    //variavel de instancia
    String cor;
    String placa;

    public Veiculo(String cor, String placa) {
        this.cor = cor;
        this.placa = placa;
    }

    public Veiculo() {
    }

    //Métodos - Comportamento do objeto, ações
    public void detalhesVeiculo(String Veiculo) {
        System.out.println(Veiculo +" tem a cor " + cor + " e o numero da placa é " + placa);
    }

    public void acelerar(String Veiculo) {

        System.out.println(Veiculo+" esta em movimento..");
    }

    public void frear(String Veiculo) {

        System.out.println(Veiculo + " Reduziu a velocidade..");
    }

    public void abastecer(String Veiculo, String combustivel) {

        System.out.println(Veiculo + "esta sendo abastecido com: "+ combustivel);
    }

}
