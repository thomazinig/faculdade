import java.io.*;

//   @author: Thomazinig
//   @version: 1.0 

public class lab1 {
    public static void main(String[] args) {

        String nomeDoArquivo1 = "pib.txt";
        String nomeDoArquivo2 = "regioes.txt";

        //
        String linha = null;

        Regiao regiao = new Regiao("");

        try {
            FileReader fileReader = new FileReader(nomeDoArquivo2);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // loop por cada linha do arquivo
            while ((linha = bufferedReader.readLine()) != null) {

                Boolean lineBreak = false;
                
                if (linha.equals(System.lineSeparator())) {
                    lineBreak = true;
                } else {
                    if (lineBreak) {
                        Regiao reg = new Regiao(linha);
                        lineBreak = false;
                    }
                    regiao.setEstado(linha);

                }

            }

            // feche o arquivo
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Arquivo inexistente: '" + nomeDoArquivo1 + "'");
        } catch (IOException ex) {
            System.out.println("Erro lendo o arquivo '" + nomeDoArquivo1 + "'");
        }

        String arquivoDeSaida = "saida.txt";

        try {

            FileWriter fileWriter = new FileWriter(arquivoDeSaida);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("pib da regiao X = $$$$");
            bufferedWriter.newLine();
            bufferedWriter.write("pib da regiao Y = $$$$");

            // feche o arquivo
            bufferedWriter.close();
        } catch (IOException ex) {
            System.out.println("Erro de escrita em '" + arquivoDeSaida + "'");
        }

    }
}
