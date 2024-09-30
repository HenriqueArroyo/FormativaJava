package com.example;

class Livro extends ItemBiblioteca implements Reservavel {
    public Livro(String titulo, String autor) {
        super(titulo, autor);
    }

    @Override
    public int getDuracaoEmprestimo() {
        return 14; // dias
    }

    @Override
    public double calcularMulta(int diasAtraso) {
        return diasAtraso * 1.0; // 1 real por dia de atraso
    }

    @Override
    public void reservar() {
        System.out.println("Livro reservado: " + getTitulo());
    }
}
