import java.io.*;
import java.util.HashMap;


public class SistemaDeClientes {

    private HashMap<Integer, Clientes> clientes = new HashMap<>();
    private final String caminhodoarquivo = "clientes.txt";

    public void carregarCliente(){
        try (BufferedReader br = new BufferedReader(new FileReader(caminhodoarquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                    String[] dados = linha.split(",");
                    int id = Integer.parseInt(dados[0]);
                    String nome = dados[1];
                    String email = dados[2];
            }
        } catch (Exception e) {
            System.out.println("Erro ao carregar clientes: " + e.getMessage());
        }
    }

    public void salvarClientes(){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminhodoarquivo))) {
            for (Clientes cliente : clientes.values()) {
                bw.write(cliente.toString());
                bw.newLine();
            }
        } catch (Exception e) {
            System.out.println("Erro ao salvar clientes: " + e.getMessage());
        }
    }
    
}
