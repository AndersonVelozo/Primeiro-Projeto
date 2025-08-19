public class Array {
    public static void main(String[] args) {

        //declaração do array

        int[] numeros = {10,20,30,50,1};
        String [] frutas;

        frutas = new String[]{"Maça", "Morango", "Abacaxi"};

        double[] salarios = new double[5];
        salarios[3] = 500.00;
        salarios[1] = 200.00;
        salarios[0] = 150.00;
        salarios[2] = 25.00;
        salarios[4] = 100.00;

        //iteração de array
        for(int posicao = 3; posicao <salarios.length; posicao++){
            System.out.println(salarios[posicao]);
        }

        for(double salario : salarios) {
            System.out.println(salario);
        }

    }
}
