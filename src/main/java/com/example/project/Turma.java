package com.example.project;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    Double notas;
    Integer qtdNotas;
    Double somaNotas;
    Double media;
    List<Double>notaAlunos = new ArrayList<Double>();
    List<Double>maiorQueMedia = new ArrayList<Double>();
     Integer notasMaiorQueMedia;
    public void addNota(double nota) {
        this.notas = nota;
        notaAlunos.add(notas);
        somaNotas = somaNotas + notas;
        return;
    }

    public int getQuantidadeNotas() {
        this.qtdNotas = notaAlunos.size();
        return this.qtdNotas;
    }

    public double getMediaDasNotas() {
        Double quantNotas = (double) qtdNotas;
        this.media = somaNotas / quantNotas;
        if(this.notas > this.media){
            maiorQueMedia.add(this.notas);

        }
        return this.media;
    }

    public int getQuantidadeNotasMeioresQueAMedia() {
        this.notasMaiorQueMedia = maiorQueMedia.size();
        return this.notasMaiorQueMedia;
    }
    public static void main(String args[]){
        
    }
}
