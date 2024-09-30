package com.example;

public class MaterialEletronico extends ItemBiblioteca {
    public MaterialEletronico(String titulo, String autor) {
        super(titulo, autor);
    }

    @Override
    public int getDuracaoEmprestimo() {
        return 7; // dias
    }

    @Override
    public double calcularMulta(int diasAtraso) {
        return diasAtraso * 2.0; // 2 reais por dia de atraso
    }
}
