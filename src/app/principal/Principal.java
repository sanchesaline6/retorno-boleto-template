package app.principal;

import app.entidades.LeituraRetornoBancoBrasil;
import app.entidades.ProcessadorBoletos;

public class Principal {
    public static void main(String[] args) {
        ProcessadorBoletos processador = new LeituraRetornoBancoBrasil();
        String nomeArquivo = "C:\\Users\\aline\\OneDrive\\Área de Trabalho\\IFTO\\2020-2\\Padrões de Projeto\\TemplateMethod\\retorno-boleto-template\\src\\resources\\banco-brasil-1.csv";
        processador.processar(nomeArquivo);
    }
}
