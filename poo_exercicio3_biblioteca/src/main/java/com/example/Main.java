package com.example;

import com.example.Usuario;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Revista revista = new Revista("Revista Natureza", "Vários Autores");
        MaterialEletronico material = new MaterialEletronico("Curso de Java", "Alguém");

        usuario.emprestar(livro);
        usuario.emprestar(revista);
        usuario.devolver(livro);
        
        HistoricoEmprestimos historico = new HistoricoEmprestimos();
        historico.registrarEmprestimo(livro, usuario);
        historico.registrarEmprestimo(revista, usuario);
        historico.exibirHistorico();
    }
    }
