// Estrutura do Código
// Classe Cliente

// Representa um cliente com os atributos id, nome, e email.
// Deve incluir:
// Construtor: Para inicializar os atributos.
// Getters e Setters: Para acessar e modificar os atributos.
// toString: Para formatar o cliente como uma string no formato: ID,Nome,Email.

public class Clientes {

    private int id;
    private String nome;
    private String email;

   
    public Clientes(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override

    public String toString(){
        return id + "," + nome + "," + email;
    }


}