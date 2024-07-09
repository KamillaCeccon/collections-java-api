package pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));

    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double calculaValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double valorProdutoMaisCaro = Double.MIN_VALUE;
        for (Produto p : estoqueProdutosMap.values()) {
            if (p.getPreco() > valorProdutoMaisCaro) {
                produtoMaisCaro = p;
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.exibirProdutos();

        estoque.adicionarProduto(457, "Produto 1", 5, 5.78);
        estoque.adicionarProduto(125, "Produto 2", 1, 2.00);
        estoque.adicionarProduto(741, "Produto 3", 8, 12.80);
        estoque.adicionarProduto(852, "Produto 4", 3, 22.00);
        estoque.adicionarProduto(951, "Produto 5", 10, 6.70);

        estoque.exibirProdutos();

        System.out.println("Valor total do estoque é: " + estoque.calculaValorTotalEstoque());
    }

}
