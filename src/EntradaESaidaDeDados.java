import java.util.Scanner;

public class EntradaESaidaDeDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Nome: " + nome);

        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("idade: " + idade);

        scanner.nextLine();

        System.out.println("Digite seu endereço: ");
        String endereco = scanner.nextLine();
        System.out.println("Endereço: " + endereco);

        System.out.println("Digite se você está empregado sim(true) ou não(false)");
        boolean empregado = scanner.nextBoolean();
        System.out.println("Olá, sou " + nome + " tenho " + idade + " anos, moro no endereço " + endereco + " estou empregado " + empregado);
    }
}
