public class Paciente {
    String nome, cpf, endereco, telefone, historicoConsultas, alergias;

    public Paciente(String parametroNome, String parametroCpf, String parametroEndereco, String parametroTelefone, String parametroHistoricoConsultas, String parametroAlergias){
        nome = parametroNome;
        cpf = parametroCpf;
        endereco = parametroEndereco;
        telefone = parametroTelefone;
        historicoConsultas = parametroHistoricoConsultas;
        alergias = parametroAlergias;
    }

    public Paciente(){
        nome = "Fulano";
        cpf = "123.456.789-00";
        endereco = "Rua dos Bobos, nº 0";
        telefone = "(11) 99999-9999";
        historicoConsultas = "Nenhuma";
        alergias = "Nenhuma";
    }

    public void obterDadosPaciente(){
        System.out.println("------------------------------------------");
        System.out.println("Paciente");
        System.out.print("Nome: " + nome);
        System.out.print(" CPF: " + cpf);
        System.out.print(" Endereço: " + endereco);
        System.out.print(" Telefone: " + telefone);
        System.out.print(" Histórico de Consultas: " + historicoConsultas);
        System.out.println(" Alergias: " + alergias);
    }
}