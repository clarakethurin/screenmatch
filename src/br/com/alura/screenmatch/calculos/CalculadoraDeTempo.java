package br.com.alura.screenmatch.calculos;

import br.com.alurascreenmatch.modelos.Filme;
import br.com.alurascreenmatch.modelos.Serie;
import br.com.alurascreenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private  int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }


}
