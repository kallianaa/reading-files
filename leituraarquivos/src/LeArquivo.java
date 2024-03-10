import java.io.*;

public class LeArquivo{
    public static void main(String[] args){
        String filename = "produtos.txt";
        try{
            FileReader fr = new FileReader(filename);
            BufferedReader in = new BufferedReader(fr);
            int cont = 0; //contador de linhas
            String line = in.readLine();
            while (line != null){
                System.out.println("[Linha "+(cont++)+"]"+line); //cada readLine, le uma linha
                //quando se tem caractere especial deve usar \\* e \\s por espacos:
                String [] separada = line.split("\\s\\*\\s");
                //para cada s q tem no array seperada assume o valor da lista:
                for(String s: separada)
                    System.out.println(s.trim()); //tira os espacos
                line = in.readLine();
            }
            in.close(); //fecha o fluxo
        } catch (FileNotFoundException e){ //exceção
            System.out.println("Arquivos \""+filename+"\" não existe.");
        } catch (IOException e){
        System.out.println("Erro na leitura de " + filename+".");
    }
}
}