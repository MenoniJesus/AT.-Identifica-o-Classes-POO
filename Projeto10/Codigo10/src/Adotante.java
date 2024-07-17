public class Adotante {
    String nome, cpf, endereco, telefone, email;

    public Adotante(String parametroNome, String parametroCpf, String parametroEndereco, String parametroTelefone, String parametroEmail) {
        nome = parametroNome;
        cpf = parametroCpf;
        endereco = parametroEndereco;
        telefone = parametroTelefone;
        email = parametroEmail;
    }

    public Adotante(){
        nome = "Sebas";
    }

    public void obterDadosAdotante(){
        System.out.println("-----------------------------------------------");
        System.out.println("Adotante");
        System.out.print("Nome: " + nome);
        System.out.print(" CPF: " + cpf);
        System.out.print(" Endereco: " + endereco);
        System.out.print(" Telefone: " + telefone);
        System.out.println(" Email: " + email);
    }
}
