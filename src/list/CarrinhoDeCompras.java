package list;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item i : itemList) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(i);
            }
            itemList.removeAll(itensParaRemover);
        }
    }

    public int exibirItens() {
        return itemList.size();
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("Item 1", 20.0, 3);
        carrinhoDeCompras.adicionarItem("Item 2", 130.0, 3);
        carrinhoDeCompras.removerItem("Item 1");
        carrinhoDeCompras.exibirItens();
        System.out.println("O numero total de itens na lista é de " + carrinhoDeCompras.exibirItens());

    }

}
