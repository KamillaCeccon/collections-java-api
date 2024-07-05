package list.OperacoesBasicas;

public class Item {

    private String nome;

    public Item(String nome, Double preco, int quantidade) {
        this.nome = nome;

    }
    public String getNome() {
        return nome;
    }
    @Override
    public String toString() {
        return nome;
    }
}
