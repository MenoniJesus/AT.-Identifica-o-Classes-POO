public class Compromisso {
    String descricao, data;
    Cliente cliente;
    Advogado advogado;

    public Compromisso(String parametroDescricao, String parametroData, Cliente parametroCliente, Advogado parametroAdvogado) {
        descricao = parametroDescricao;
        data = parametroData;
        cliente = parametroCliente;
        advogado = parametroAdvogado;
    }

    public Compromisso(){

    }

    public void obterDadosCompromisso(){
        System.out.println("---------------------------------------");
        System.out.println("Compromisso");
        System.out.print("Descrição: " + descricao);
        System.out.print(" Data: " + data);
        System.out.print(" Cliente: " + cliente.nome);
        System.out.println(" Advogado: " + advogado.nome);
    }
}
