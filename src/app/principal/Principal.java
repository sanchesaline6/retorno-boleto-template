package app.principal;

import app.entidades.LeituraRetornoBancoBrasil;
import app.entidades.ProcessadorBoletos;

public class Principal {
    public static void main(String[] args) {
        ProcessadorBoletos processador = new ProcessadorBoletos(new LeituraRetornoBancoBrasil());
        String nomeArquivo = "/home/aline/Área de Trabalho/IFTO/retorno-boleto-template/src/resources/banco-brasil-1.csv";
        processador.processar(nomeArquivo);
    }
}
