package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {

    Set<Produto> produtoSet;

    public CadastroProduto() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(nome, cod, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtoPorNome = new TreeSet<>(produtoSet);
        return produtoPorNome;
    }


    public Set<Produto> exibirPorPreco() {
        Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoPorPreco.addAll(produtoSet);
        return produtoPorPreco;
    }

    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();
        cadastroProduto.adicionarProduto(4445, "Produto 1", 5.99,3);
        cadastroProduto.adicionarProduto(5879, "Produto 2", 5.56,5);
        cadastroProduto.adicionarProduto(4789, "Produto 3", 6.90,3);
        System.out.println(cadastroProduto.produtoSet);
        System.out.println(cadastroProduto.exibirProdutosPorNome());
    }
}
