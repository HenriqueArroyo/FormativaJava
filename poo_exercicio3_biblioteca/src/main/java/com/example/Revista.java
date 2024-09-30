package com.example;

public class Revista extends ItemBiblioteca {
    public Revista(String titulo, String autor) {
        super(titulo, autor);
    }

    @Override
    public int getDuracaoEmprestimo() {
        return 7; // dias
    }

    @Override
    public double calcularMulta(int diasAtraso) {
        return diasAtraso * 0.5; // 0.50 reais por dia de atraso
    }
    
}
