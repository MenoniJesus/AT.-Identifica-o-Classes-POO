public class Cliente {
    String nome, cpf, telefone, email, endereco;

    public Cliente(String parametroNome, String parametroCpf, String parametroTelefone, String parametroEmail, String parametroEndereco) {
        nome = parametroNome;
        cpf = parametroCpf;
        telefone = parametroTelefone;
        email = parametroEmail;
        endereco = parametroEndereco;
    }

    public Cliente(){

    }

    public void obterDadosCliente() {
        System.out.println("---------------------------------------------------");
        System.out.println("Cliente");
        System.out.print("Nome: " + nome);
        System.out.print(" CPF: " + cpf);
        System.out.print(" Telefone: " + telefone);
        System.out.print(" Email: " + email);
        System.out.println(" Endereço: " + endereco);
    }
}