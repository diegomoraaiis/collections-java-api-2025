import list.ListaTarefa;
import list.Tarefa;

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

        lista.removerTarefa("teste1");
        System.out.println("Numero total de tarefas é igual a ..:"+ lista.obterNumeroTotalTarefas());
        lista.obterDescricoesTarefaS();
}
}