package com.example;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Usuario {
     String nome;
    private String cpf;
    private List<ItemBiblioteca> itensEmprestados;

    public void emprestar(ItemBiblioteca item) {
        item.emprestar();
        itensEmprestados.add(item);
    }


    public void devolver(ItemBiblioteca item) {
        if (itensEmprestados.remove(item)) {
            System.out.println("Item devolvido: " + item.getTitulo());
        } else {
            System.out.println("Item não encontrado nos empréstimos.");
        }
    }
}
