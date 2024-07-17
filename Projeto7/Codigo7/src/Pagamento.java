public class Pagamento {
    String tipo, data;
    Pedido pedido;
    float valor;

    public Pagamento(String parametroTipo, String parametroData, Pedido parametroPedido, float parametroValor){
        tipo = parametroTipo;
        data = parametroData;
        pedido = parametroPedido;
        valor = parametroValor;
    }

    public Pagamento(){

    }

    public void obterDadosPagamento(){
        System.out.println("------------------------------------------------");
        System.out.println("Pagamento");
        System.out.print("Tipo: " + tipo);
        System.out.print(" Data: " + data);
        System.out.println(" Valor: " + valor);
    }
}