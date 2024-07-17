public class Aula {
    String tipo, aula, horario, instrutor;
//    Instrutor instrutor;

    public Aula(String parametroTipo, String parametroAula, String parametroHorario, String parametroInstrutor){
        tipo = parametroTipo;
        aula = parametroAula;
        horario = parametroHorario;
        instrutor = parametroInstrutor;
    }

    public Aula(){

    }

    public void obterDadosAula(){
        System.out.println("-----------------------------------------------");
        System.out.println("Dados da Aula");
        System.out.print("Tipo: " + tipo);
        System.out.print(" Aula: " + aula);
        System.out.print(" Horário: " + horario);
        System.out.println(" Instrutor: " + instrutor);
    }
}