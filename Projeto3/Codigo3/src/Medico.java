public class Medico {
    String nome, crm, especialidade, telefone, email;

    public Medico(String parametroNome, String parametroCrm, String parametroEspecialidade, String parametroTelefone, String parametroEmail){
        nome = parametroNome;
        crm = parametroCrm;
        especialidade = parametroEspecialidade;
        telefone = parametroTelefone;
        email = parametroEmail;
    }

    public Medico(){
        nome = "Dr. Fulano";
        crm = "123456";
        especialidade = "Clínico Geral";
        telefone = "(11) 99999-9999";
        email = "fulano@hotmail.com";
    }

    public void obterDadosMedico(){
        System.out.println("------------------------------------------");
        System.out.println("Médico");
        System.out.print("Nome: " + nome);
        System.out.print(" CRM: " + crm);
        System.out.print(" Especialidade: " + especialidade);
        System.out.print(" Telefone: " + telefone);
        System.out.println(" Email: " + email);
    }
}
