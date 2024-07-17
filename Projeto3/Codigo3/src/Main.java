public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("Hospital São Paulo", "Rua do Hospital, 123", "(11) 99999-9999", 100);
        hospital.obterDadosHospital();

        Medico medico = new Medico("Dr. Fulano", "123456", "Clínico Geral", "(11) 99999-9999", "fulaninho232@hotmail.com");
        medico.obterDadosMedico();

        Paciente paciente = new Paciente("Fulano", "123.456.789-00", "Rua dos Bobos, nº 0", "(11) 99999-9999", "Nenhuma", "Nenhuma");
        paciente.obterDadosPaciente();

        Leitos leitos = new Leitos(100, true);
        leitos.obterDadosLeitos();

        Consulta consulta = new Consulta("01/01/2021", "Nenhum", "Nenhuma", paciente, medico);
        consulta.obterDadosConsulta();

    }
}
