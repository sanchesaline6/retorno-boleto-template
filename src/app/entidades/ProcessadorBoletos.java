package app.entidades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class  ProcessadorBoletos {
    private LeituraRetorno leituraRetorno;

    public ProcessadorBoletos(LeituraRetorno leituraRetorno) {
        this.leituraRetorno = leituraRetorno;
    }
    //método processar -> método template
    public final List<Boleto> processar(String nomeArquivo){
        try{
            BufferedReader reader = Files.newBufferedReader(Paths.get(nomeArquivo));
            String line;
            List<Boleto> boletos = new ArrayList<>();
            while((line = reader.readLine()) != null){
                String[] vetor = line.split(";");
                Boleto boleto = leituraRetorno.processarLinhaArquivo(vetor);
                boletos.add(boleto);
                System.out.println(boleto);
            }

            return boletos;
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
