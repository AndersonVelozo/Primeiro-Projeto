package heranca;

public class Principal {
    public static void main(String[] args) {

        Cachorro caramelo = new Cachorro();
        caramelo.latir();
        caramelo.comer("Ração");
        caramelo.beberAgua();
        caramelo.dormir();

        Galinha gertrudez = new Galinha();
        gertrudez.ciscar();
        caramelo.comer("Grão de milho");
        caramelo.beberAgua();
        caramelo.dormir();

    }
}
