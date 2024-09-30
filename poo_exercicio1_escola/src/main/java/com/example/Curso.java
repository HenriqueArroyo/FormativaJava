package com.example;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Curso {
    private String nomeCurso;
    private List<Aluno> alunos;
    private Professor professor;

    public Curso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
        alunos = new ArrayList<>();
    }

    // adiconar Professor na curso
    public void addProf(Professor professor){
        this.professor = professor; 
    }

    //Adicionar Alunos
    public void addAluno(Aluno aluno){
        alunos.add(aluno);
    }

    // método info curso
    public void infoCurso() {
        System.out.println("Curso: " + nomeCurso);
        System.out.println("Professor: " + professor.getNome());
        System.out.println("Alunos Matriculados:");
        for (Aluno aluno : alunos) {
            System.out.println("Aluno: " + aluno.getNome() + " RA: " + aluno.getMatricula());
        }

    }

    // método lançar nota
    public void atribuirNota() {
        if (alunos.size() == 0) {
            System.out.println("Nenhum Aluno Cadastrado");
        } else {
            for (Aluno aluno : alunos) {// percorrer arraylist
                double nota = Double.parseDouble(JOptionPane.showInputDialog(
                        "Nota do " + aluno.getNome() + ":"));
                aluno.setNota(nota);
            }
        }

    }

    //exibir nota final de todos os alunos
    public void resultadoFinal(){
        for (Aluno aluno : alunos) {
            System.out.println(aluno.exibirInfo());
            aluno.avaliadDesempenho();
        }
    }
}
