import java.util.Map;
import java.util.TreeMap;

public class EstudoTreeMap {
    public static void main(String[] args) {

        TreeMap<String, Double> notasAlunos = new TreeMap<>();
        notasAlunos.put("Alice", 10.5);
        notasAlunos.put("Alessandro", 8.5);
        notasAlunos.put("Roberto", 9.9);

        for(String nome : notasAlunos.keySet()){
            double nota = notasAlunos.get(nome);
            System.out.println(nome + " : " + nota);
        }

        for(Map.Entry<String, Double> nota : notasAlunos.entrySet()){
            String nome = nota.getKey();
            double valorNota = nota.getValue();
            System.out.println(nome + " : " + valorNota);

        }


        System.out.println("Primeira chave: " + notasAlunos.firstKey());
        System.out.println("Última chave: " + notasAlunos.lastKey());



        int count = 1;

        while (count <= 3) {

            System.out.println("Contagem: " + count);

            count++;

        }

    }
}
