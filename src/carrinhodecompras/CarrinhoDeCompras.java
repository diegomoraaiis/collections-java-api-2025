package carrinhodecompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    List<Item> itens;

    public CarrinhoDeCompras() {
        this.itens = itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item i = new Item(nome, preco, quantidade);
        this.itens.add(i);
    }

    public void exibirItems(){
        System.out.println(itens);
    }

    public String calcularValorTotal(){
        float valorTotal = 0f;
        for (Item i : itens){
            float valor = (float) (i.getPreco() * i.getQuantidade());
            valorTotal = valorTotal + valor;

        }
        return String.format("Valor Total...: R$:%.2f", valorTotal);
    }

    public void removerItem(String nome){
        List<Item> removerItem = new ArrayList<>();

        for(Item i : itens){
            if (i.getNome().equalsIgnoreCase(nome)){
                removerItem.add(i);
            }
        }
        itens.removeAll(removerItem);
    }

}
