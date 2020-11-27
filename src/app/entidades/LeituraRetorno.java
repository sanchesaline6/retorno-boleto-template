package app.entidades;

import java.util.List;

public interface LeituraRetorno {

    public abstract List<Boleto> processarLinhaArquivo(String[] vetor);
}
