import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class SistemaDeClientes {

    private HashMap<Integer, Clientes> clientes = new HashMap<>();
    private final String caminhadoDoArquivo = "C://Users//joaov//Documents//Programação//Java//SGC//clientes.txt";

    public void carregarCliente() {
        try (BufferedReader br = new BufferedReader(new FileReader(caminhadoDoArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(",");
                int id = Integer.parseInt(dados[0]);
                String nome = dados[1];
                String email = dados[2];
                clientes.put(id, new Clientes(id, nome, email));
            }
        } catch (Exception e) {
            System.out.println("Erro ao carregar clientes: " + e.getMessage());
        }
    }

    public void salvarClientes() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminhadoDoArquivo))) {
            for (Clientes cliente : clientes.values()) {
                bw.write(cliente.toString());
                bw.newLine();
            }
        } catch (Exception e) {
            System.out.println("Erro ao salvar clientes: " + e.getMessage());
        }
    }

    public void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            for (Clientes cliente : clientes.values()) {
                System.out.println(cliente);
            }
        }
    }

    public void adicionarCliente() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o ID do cliente: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir a linha extra
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o e-mail do cliente: ");
        String email = scanner.nextLine();

        // Adicionando o novo cliente
        Clientes cliente = new Clientes(id, nome, email);
        clientes.put(id, cliente);
        System.out.println("Cliente adicionado com sucesso!");
        salvarClientes();
    }

    public void editarCliente() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o ID do cliente a ser editado: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir a linha extra

        if (clientes.containsKey(id)) {
            Clientes cliente = clientes.get(id);
            System.out.print("Digite o novo nome do cliente (atual: " + cliente.getNome() + "): ");
            String nome = scanner.nextLine();
            System.out.print("Digite o novo e-mail do cliente (atual: " + cliente.getEmail() + "): ");
            String email = scanner.nextLine();

            // Atualizando os dados do cliente
            cliente.setNome(nome);
            cliente.setEmail(email);
            System.out.println("Cliente atualizado com sucesso!");
        } else {
            System.out.println("Cliente não encontrado!");
        }
        salvarClientes();
    }

    public void excluirCliente() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o ID do cliente a ser excluído: ");
        int id = scanner.nextInt();
    
        if (clientes.containsKey(id)) {
            // Remover o cliente do HashMap
            clientes.remove(id);
            System.out.println("Cliente excluído com sucesso!");
    
            // Salvar os dados no arquivo após a exclusão
            salvarClientes();
        } else {
            System.out.println("Cliente não encontrado!");
        }
    }

}
