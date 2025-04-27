package ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return  pessoasPorAltura;
    }


    public static void main(String[] args) {
//        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
//
//        ordenacaoPessoa.adicionarPessoa("nome 3", 20, 1.96);
//        ordenacaoPessoa.adicionarPessoa("nome 2", 59, 1.90);
//        ordenacaoPessoa.adicionarPessoa("nome 1", 12, 1.60);
//        ordenacaoPessoa.adicionarPessoa("nome 5", 16, 1.75);
//        ordenacaoPessoa.adicionarPessoa("nome 4", 34, 1.55);
//
//        System.out.println(ordenacaoPessoa.ordenarPorAltura());
//         System.out.println(ordenacaoPessoa.ordenarPorIdade());
    }
}
