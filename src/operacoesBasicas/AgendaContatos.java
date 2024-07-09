package operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, int telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.get(nome);

        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Kamilla", 997014473);
        agendaContatos.adicionarContato("Georgia", 997014573);
        agendaContatos.adicionarContato("Heloize", 997078473);
        agendaContatos.adicionarContato("Karol", 997015473);

        agendaContatos.exibirContato();
        agendaContatos.removerContato("Karol");
        agendaContatos.exibirContato();
    }
}
