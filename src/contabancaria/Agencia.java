package contabancaria;

public class Agencia {
    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria("Anderson", 500);

        minhaConta.setTitular("Anderson Velozo");
        minhaConta.setSaldo(minhaConta.getSaldo() + 500);

        String titularConta = minhaConta.getTitular();
        double saldoFinal = minhaConta.getSaldo();

        System.out.println("O titular da conta é : " + titularConta + " e o saldo final é " + saldoFinal);


        ContaBancaria contaMinhaMae = new ContaBancaria("Maria");
        System.out.println("O titular da conta é : " + contaMinhaMae.getTitular() + " e o saldo final é " + contaMinhaMae.getSaldo());
    }
}
