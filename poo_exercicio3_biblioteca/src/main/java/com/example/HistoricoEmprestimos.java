package com.example;

import java.util.ArrayList;
import java.util.List;
import com.example.Usuario;

/**
 * HistoricoEmprestimos
 */
public class HistoricoEmprestimos {

     private List<String> historico;

    public HistoricoEmprestimos() {
        historico = new ArrayList<>();
    }

    public void registrarEmprestimo(ItemBiblioteca item, Usuario usuario) {
        String registro = "Usuário: " + usuario.nome + ", Item: " + item.getTitulo() + ", Data: " + new String();
        historico.add(registro);
    }

    public void exibirHistorico() {
        for (String registro : historico) {
            System.out.println(registro);
        }
    }
}