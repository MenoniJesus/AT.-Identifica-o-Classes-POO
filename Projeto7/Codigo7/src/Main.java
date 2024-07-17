//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Camiseta", "Camiseta de algodão", 10, 50);
        produto1.obterDadosProduto();

        Cliente cliente1 = new Cliente("João", "123.456.789-00", "Rua 1", "1234-5678", "joao@gmail.com");
        cliente1.obterDadosCliente();

        Pedido pedido1 = new Pedido("Camiseta", "Aguardando pagamento", "01/01/2021", new Cliente(), 1);
        pedido1.obterDadosPedido();

        Envio envio1 = new Envio("Enviado", "02/01/2021", "05/01/2021", new Pedido());
        envio1.obterDadosEnvio();

        Pagamento pagamento1 = new Pagamento("Cartão de Crédito", "01/01/2021", new Pedido(), 50);
        pagamento1.obterDadosPagamento();
    }
}