public class PlantaCasa {

        //Atributos

        int metragem;
        int numeroQuartos;
        int numeroBanheiros;
        String cor;
        String material;

        public void construir() {
            System.out.println("A casa foi construida, as caracteristicas são: ");
            System.out.println("Metragem " + metragem);
            System.out.println("Numero de quartos " + numeroQuartos);
            System.out.println("Numero de banheiros " + numeroBanheiros);
            System.out.println("Material " + material);
        }

        public void pintar() {
            System.out.println("A casa foi pintada de " + cor);
        }

        public void mudarCorParede(String novaCor) {
            cor=novaCor;
            pintar();
        }

        public int somarMetragem() {
            return metragem * numeroBanheiros * numeroQuartos;
        }

    public void alterarCaracteristicas(int metros, int quartos, int banheiro, String mat) {
        metragem = metros;
        numeroQuartos = quartos;
        numeroBanheiros = banheiro;
        material = mat;
        construir();
    }


}
