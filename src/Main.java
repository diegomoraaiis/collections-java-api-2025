import carrinhodecompras.CarrinhoDeCompras;
import list.ListaTarefa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ListaTarefa lista = new ListaTarefa();

        lista.adicionarTarefa("teste1");
        lista.adicionarTarefa("teste1");
        lista.adicionarTarefa("teste3");
        lista.adicionarTarefa("teste4");
        System.out.println("Numero total de tarefas é igual a ..:"+ lista.obterNumeroTotalTarefas());
        lista.obterDescricoesTarefaS();

        System.out.println("==================================================");

        CarrinhoDeCompras compras = new CarrinhoDeCompras();
        compras.adicionarItem("laranja", 1.50, 2);
        compras.adicionarItem("cafe", 1.00, 2);
        compras.adicionarItem("chocolate", 1.50, 1);
        compras.exibirItems();
        String s = compras.calcularValorTotal();
        System.out.println(s);

}
}