package poo;

public class Carro {
    //propriedades | atributos | campos | variaveis de instancia

    //variavel de instancia
    String cor;
    String placa;

    //variavel de classe:
    static String pais;

    //Construtor: botão direito generate construtor seleciona
    //as variaveis e ok
    public Carro(String cor, String placa) {
        this.cor = cor;
        this.placa = placa;
    }

    public void detalhesCarro(String pais){
        System.out.println("O Carro tem a cor " + cor + " e o numero da placa é "+placa);
        this.pais  = pais;
        System.out.println("Pais de origem " + pais);
    }

    //Métodos - Comportamento do objeto, ações
    public void acelerar() {
        System.out.println("Carro esta em movimento..");
    }

    public void frear() {
        System.out.println("A Velocidade do Carro foi reduzida..");
    }

    public void abastecer() {
        System.out.println("O Carro esta sendo abastecido com Gasolina.");
    }

//    //Getter em Setter:
//    // botão direito generate getter e setter e selecione as duas
//    // variaveis e clique em ok, vai gerar as informações abaixo:
//
//    public String getCor() {
//        return cor;
//    }
//
//    public void setCor(String cor) {
//        this.cor = cor;
//    }
//
//    public String getPlaca() {
//        return placa;
//    }
//
//    public void setPlaca(String placa) {
//        this.placa = placa;
//    }
}
