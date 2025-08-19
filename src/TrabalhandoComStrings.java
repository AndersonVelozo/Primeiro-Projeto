public class TrabalhandoComStrings {
    public static void main(String[] args) {

        String nome = "Anderson";
        String nomeDois = "Lucivane";


        int TamanhoDaSting = nome.length();
        boolean saoIguais = nome.equals(nomeDois);

        System.out.println("Olá " + nome.toUpperCase() + " seu nome tem " + TamanhoDaSting + " caracteres");
        System.out.println("Os nomes são iguais?p: " + saoIguais);
    }
}
 