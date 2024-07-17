public class Consulta {
    String data, resultadosExames, prescicoes;
    Paciente paciente;
    Medico medico;

    public Consulta(String parametroData, String parametroResultadosExames, String parametroPrescicoes, Paciente parametroPaciente, Medico parametroMedico){
        data = parametroData;
        resultadosExames = parametroResultadosExames;
        prescicoes = parametroPrescicoes;
        paciente = parametroPaciente;
        medico = parametroMedico;
    }

    public Consulta(){
        data = "01/01/2021";
        resultadosExames = "Nenhum";
        prescicoes = "Nenhuma";
        paciente = new Paciente();
        medico = new Medico();
    }

    public void obterDadosConsulta(){
        System.out.println("------------------------------------------");
        System.out.println("Consulta");
        System.out.print("Data: " + data);
        System.out.print(" Resultados de Exames: " + resultadosExames);
        System.out.print(" Prescrições: " + prescicoes);
    }
}