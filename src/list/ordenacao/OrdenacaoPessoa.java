package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    public OrdenacaoPessoa(List<Pessoa> pessoaList) {
        this.pessoaList = pessoaList;
    }

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pesoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pesoaPorAltura);
        Collections.sort(pesoaPorAltura, new ComparatorPorAltura());
        return pesoaPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Kamilla", 34, 1.70);
        ordenacaoPessoa.adicionarPessoa("Lucas", 27, 1.78);
        ordenacaoPessoa.adicionarPessoa("Jonas", 18, 2.01);
        ordenacaoPessoa.adicionarPessoa("Heloize", 30, 1.59);
        
        System.out.println(ordenacaoPessoa.pessoaList);
//        // System.out.println(ordenacaoPessoa.ordenarPorIdade());
//        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}