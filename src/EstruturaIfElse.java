public class EstruturaIfElse {
    public static void main(String[] args) {

//        int idade = 30;
//            if (idade >= 18) {
//                System.out.println("Você é maior de idade");
//                 }
//            else {
//                System.out.println("Você é menor de idade");
//                 }
//
//        boolean estaChovendo = true;
//            if (!estaChovendo) {
//                System.out.println("vamos sair para passear");
//            }
//            else {
//                System.out.println("vamos ficar em casa");
//            }

            boolean temDinheiro = true;
            boolean temCartao = false;

            if(temDinheiro && temCartao) {
                System.out.println("Pede um ifood do zé delivery");
            }
            else if (temDinheiro || temCartao) {
                System.out.println("pede um ifood");
            }
            else {
                System.out.println("Vai trabalhar");
            }


            String mensagem = (temDinheiro) ? "pede um ifood" : "come o que tem na geladeira";
            System.out.println(mensagem);
            if(temDinheiro){
                System.out.println("pede um ifood");
            }
            else {
                System.out.println("Come o que tem em casa");
            }

    }
}
