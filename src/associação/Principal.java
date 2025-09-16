package associação;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Principal {
    public static void main (String[] args) {

        Carro fusca = new Carro(40);
        fusca.mostrarCilindradas();


        Funcionarios joao = new Funcionarios("João");
        Funcionarios anderson = new Funcionarios("Anderson");
        Funcionarios fabio = new Funcionarios("Fabio");

        List<Funcionarios> listaDeFuncionarios = new ArrayList<>();
        listaDeFuncionarios.add(joao);
        listaDeFuncionarios.add(anderson);
        listaDeFuncionarios.add(fabio);

        Departamento ti = new Departamento("TI", listaDeFuncionarios);
        ti.mostrarFuncionarios();

        Departamento marketing = new Departamento("Marketing", Collections.emptyList());
        marketing.mostrarFuncionarios();
    }
}
