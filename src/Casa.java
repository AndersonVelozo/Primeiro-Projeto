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
    }
}
