package main.java.list.OperacoesBasicas.Exercicios;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
	private List<Tarefa> listaTarefa;
	
	public ListaTarefa() {
		this.listaTarefa = new ArrayList<>();
	}
	
	public void adicionarTarefa(String descricao) {
		listaTarefa.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		List<Tarefa> tarefaParaRemover = new ArrayList<>();
		
		for (Tarefa t: listaTarefa) {
			if (t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefaParaRemover.add(t);
			}
		}
		
		listaTarefa.removeAll(tarefaParaRemover);
	}
	
	public Integer obterNumeroTotalTarefas() {
		return listaTarefa.size();
	}
	
	public void obterDescricoesTarefas() {
		System.out.println(listaTarefa);
	}
	
	public static void main(String[] args) {
		ListaTarefa listaTarefa = new ListaTarefa();
		
		System.out.println(listaTarefa.obterNumeroTotalTarefas());
		
		listaTarefa.adicionarTarefa("Tarefa 1");
		listaTarefa.adicionarTarefa("Tarefa 1");
		listaTarefa.adicionarTarefa("Tarefa 2");
		listaTarefa.adicionarTarefa("Tarefa 3");
		System.out.println(listaTarefa.obterNumeroTotalTarefas());
		
		listaTarefa.removerTarefa("Tarefa 1");
		System.out.println(listaTarefa.obterNumeroTotalTarefas());
		
		listaTarefa.obterDescricoesTarefas();
	}
}
