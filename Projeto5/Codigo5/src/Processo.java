public class Processo {
    String numeroProcesso, status, descricao;
    Advogado advogado;
    Cliente cliente;

    public Processo(String parametroNumeroProcesso, String parametroStatus, String parametroDescricao, Advogado parametroAdvogado, Cliente parametroCliente) {
        numeroProcesso = parametroNumeroProcesso;
        status = parametroStatus;
        descricao = parametroDescricao;
        advogado = parametroAdvogado;
        cliente = parametroCliente;
    }

    public Processo(){

    }

    public void obterDadosProcesso(){
        System.out.println("--------------------------------");
        System.out.print("Número do Processo: " + numeroProcesso);
        System.out.print(" Status: " + status);
        System.out.print(" Descrição: " + descricao);
        System.out.print(" Advogado: " + advogado.nome);
        System.out.println(" Cliente: " + cliente.nome);
    }
}
