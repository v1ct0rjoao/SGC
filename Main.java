import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemaDeClientes sistema = new SistemaDeClientes();
        sistema.carregarCliente();

        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("=== Sistema de Gestão de Clientes ===");
            System.out.println("1. Listar Clientes");
            System.out.println("2. Adicionar Cliente");
            System.out.println("3. Editar Cliente");
            System.out.println("4. Excluir Cliente");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    sistema.listarClientes();
                    break;
                case 2:
                    sistema.adicionarCliente();
                    break;
                case 3:
                    sistema.editarCliente();
                    break;
                case 4:
                    sistema.excluirCliente();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    sistema.salvarClientes();  // Salva os clientes no arquivo ao sair
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}
 
