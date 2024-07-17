public class Pedido {
    String produto, status, data;
    Cliente cliente;
    int quantidade;

    public Pedido(String parametroProduto, String parametroStatus, String parametroData, Cliente parametroCliente, int parametroQuantidade){
        produto = parametroProduto;
        status = parametroStatus;
        data = parametroData;
        cliente = parametroCliente;
        quantidade = parametroQuantidade;
    }

    public Pedido(){

    }

    public void obterDadosPedido(){
        System.out.println("------------------------------------------------");
        System.out.println("Pedido");
        System.out.print("Produto: " + produto);
        System.out.print(" Status: " + status);
        System.out.print(" Data: " + data);
        System.out.println(" Quantidade: " + quantidade);
    }
}