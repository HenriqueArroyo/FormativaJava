package com.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public abstract class ItemBiblioteca {
   private String titulo;
   private String autor;
   
   public abstract double calcularMulta(int diasAtraso);
    
   public abstract int getDuracaoEmprestimo();


   public void emprestar() {
    System.out.println("Item emprestado: " + titulo);
}
 
}



