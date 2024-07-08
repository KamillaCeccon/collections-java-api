package set.ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {


    private String nomeProduto;
    private long codigoProduto;
    private double precoProduto;
    private int quantidade;

    public Produto(String nomeProduto, long codigoProduto, double precoProduto, int quantidade) {
        this.nomeProduto = nomeProduto;
        this.codigoProduto = codigoProduto;
        this.precoProduto = precoProduto;
        this.quantidade = quantidade;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public long getCodigoProduto() {
        return codigoProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public int compareTo(Produto p) {
        return nomeProduto.compareToIgnoreCase(p.getNomeProduto());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return codigoProduto == produto.codigoProduto;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigoProduto);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nomeProduto='" + nomeProduto + '\'' +
                ", codigoProduto=" + codigoProduto +
                ", precoProduto=" + precoProduto +
                ", quantidade=" + quantidade +
                '}';
    }

}

class ComparatorPorPreco implements Comparator<Produto> {
    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPrecoProduto(),p2.getPrecoProduto());
    }
}
