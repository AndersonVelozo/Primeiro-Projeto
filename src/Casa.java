public class Casa {
    public static void main(String[] args) {
        //Criando a casa
        PlantaCasa casa = new PlantaCasa();


        //Iniciando atributos variaveis
        casa.numeroBanheiros = 2;
        casa.numeroQuartos = 3;
        casa.metragem = 70;
        casa.material = "Tijolo";
        casa.cor = "Branca";


        //chamada da função (metodo) ordem;
        casa.construir();
        casa.pintar();

        casa.mudarCorParede("Cinza");

        casa.alterarCaracteristicas(100, 3, 5, "Madeira");

        int resultado = casa.somarMetragem();
        System.out.println(resultado);

        PlantaCasa casaVizinho = new PlantaCasa();
        casaVizinho.metragem = 200;
        casaVizinho.material = "Tijolo";
        casaVizinho.numeroBanheiros = 2;
        casaVizinho.numeroQuartos = 5;
        casaVizinho.cor = "Azul";

        casaVizinho.construir();
        casaVizinho.pintar();
    }
}
